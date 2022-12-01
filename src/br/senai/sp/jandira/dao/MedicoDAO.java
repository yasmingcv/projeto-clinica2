package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private final static String URL = "C:\\Users\\22282215\\java\\medico.txt";
    private final static Path PATH = Paths.get(URL);
    private final static String URL_TEMP = "C:\\Users\\22282215\\java\\medico-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();

    //CRUD
    public static void gravar(Medico m) { //CREATE
        medicos.add(m);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro (médico).");
        }

    }

    public static ArrayList<Medico> getMedicos() { //READ
        return medicos;
    }

    public static Medico getMedico(Integer codigo) { //READ
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {                    
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medicoAtualizado) { //UPDATE
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }
        }

        atualizarArquivo();
    }

    public static void excluir(Integer codigo) { //DELETE
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }

        atualizarArquivo();
    }

    //
    private static void atualizarArquivo() {
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {

                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();

            }

            bwTemp.close();
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            

            while (linha != null) {
                
                String[] vetor = linha.split(";");
                String[] dataNascimento = vetor[5].split("-");
                
                Integer ano = Integer.parseInt(dataNascimento[0]);
                Integer mes = Integer.parseInt(dataNascimento[1]);
                Integer dia = Integer.parseInt(dataNascimento[2]);

                Medico m = new Medico(
                        Integer.valueOf(vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        vetor[4],
                        LocalDate.of(ano, mes, dia));
                
                medicos.add(m);
                
                linha = leitor.readLine();
            }
            
            leitor.close();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }

    }

    public static DefaultTableModel getTabelaMedicos() {

        String[] titulo = {"CÒDIGO", "CRM", "MÉDICO", "TELEFONE"};
        String[][] dados = new String[medicos.size()][4];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            
        }
        return new DefaultTableModel(dados, titulo);
    }
}
