package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    //Essa classe será responsável pela persistência de dados das especialidades, 
    //por exemplo: adicionar, excluir etc.
    private final static String URL = "C:\\Users\\22282215\\java\\especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282215\\java\\especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    public static DefaultListModel<String> listaEspecialidades = new DefaultListModel<>();

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) { //CREATE
        especialidades.add(e);

        // GRAVAR EM ARQUIVO:
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }

    }

    public static ArrayList<Especialidade> getEspecialidades() { //READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { //READ
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) { //UPDATE
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidadeAtualizada.getCodigo())){
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
        
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) { //DELETE

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        atualizarArquivo();

    }

    private static void atualizarArquivo() {

        //PASSO 01 - Criar representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            /* Iterar (loop) na lista para adicionar as especialidades no arquivo
            temporário, exceto o registro que não queremos mais */
            for(Especialidade e : especialidades){
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();

            
            //Excluir o arquivo atual
            arquivoAtual.delete();
            
            //Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                // Guardar a especialidade na lista
                especialidades.add(e);

                // Ler a próxima linha 
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }

    }

    public static DefaultTableModel getTabelaEspecialidades() {

        String[] titulo = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
        }

        return new DefaultTableModel(dados, titulo);

    }
    
    
    public static DefaultListModel<String> getListaEspecialidades(){
        
        for(Especialidade especialidade : especialidades){
            listaEspecialidades.addElement(especialidade.getCodigo() + " - " + especialidade.getNome());
        }
        
        return listaEspecialidades;
    }
    
    public static void adicionarEspecialidadeNaLista(Integer codigo){
        
        ArrayList<Especialidade> especialidadesDoMedico = new ArrayList<>();
        
        for(Especialidade e : especialidades){
            if(e.getCodigo().equals(codigo)){
                especialidadesDoMedico.add(e);
                break;
            }
        }
        
    }

}
