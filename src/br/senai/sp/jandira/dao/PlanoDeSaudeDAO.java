package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    
    private final static String URL = "C:\\Users\\22282215\\java\\planodesaude.txt";
    private final static Path PATH = Paths.get(URL);
    private final static String URL_TEMP = "C:\\Users\\22282215\\java\\planodesaude-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) { //CREATE
        planosDeSaude.add(p);
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }
    }

    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() { //READ
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigoP) { //READ
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigoP) {
                return p;
            }
        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) { //UPDATE
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == planoDeSaudeAtualizado.getCodigo()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }
        }
        
        atualizarArquivo();
    }

    public static void excluir(Integer codigoP) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigoP) {
                planosDeSaude.remove(p);
                break;
            }
        }
        
        atualizarArquivo();
    }
    
    private static void atualizarArquivo(){
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        
        try {
            arquivoTemp.createNewFile();
            
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(PlanoDeSaude p : planosDeSaude){
                
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
                
            }
            
            bwTemp.close();
            
            arquivoAtual.delete();
            
            arquivoTemp.renameTo(arquivoAtual);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    // criar lista inicial de planos de saúde
    public static void criarListaDePlanosDeSaude() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            
            while(linha != null){
                String[] vetor = linha.split(";");
                
                PlanoDeSaude p = new PlanoDeSaude(vetor[1], 
                        vetor[2], 
                        vetor[3], 
                        LocalDate.parse(vetor[4]), 
                        Integer.valueOf(vetor[0]));
                
                planosDeSaude.add(p);
                
                linha = leitor.readLine();
                
            }
            
            leitor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }
        
        
    }

    public static DefaultTableModel getTabelaPlanosDeSaude() {

        String[] titulo = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][5];

        for (PlanoDeSaude p : planosDeSaude) {
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getNumero();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = p.getValidade().format(formato);
        }

        return new DefaultTableModel(dados, titulo);

    }

    //
}
