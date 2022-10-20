package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) { //CREATE
        planosDeSaude.add(p);
    }

    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() { //READ
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigoP) { //READ
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigoP() == codigoP) {
                return p;
            }
        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) { //UPDATE
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigoP() == planoDeSaudeAtualizado.getCodigoP()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }
        }
    }

    public static void excluir(Integer codigoP) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigoP() == codigoP) {
                planosDeSaude.remove(p);
                break;
            }
        }
    }

    // criar lista inicial de planos de saúde
    public void criarListaDePlanosDeSaude() {
        PlanoDeSaude p1 = new PlanoDeSaude("Bradesco", "Gold", "177-123", LocalDate.of(2025, Month.MARCH, 25));
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco", "Gold", "177-123", LocalDate.of(2026, Month.JANUARY, 17));
        PlanoDeSaude p3 = new PlanoDeSaude("Bradesco", "Gold", "177-123", LocalDate.of(2027, Month.MAY, 22));
        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Gold", "177-123", LocalDate.of(2028, Month.JULY, 13));

        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);
        planosDeSaude.add(p4);
    }

    public static DefaultTableModel getTabelaPlanosDeSaude() {

        String[] titulo = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][5];

        for (PlanoDeSaude p : planosDeSaude) {
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigoP().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getNumero();
            dados[i][4] = p.getValidade().toString();
        }

        return new DefaultTableModel(dados, titulo);

    }

}
