package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        int[][] c = {
            {4,6,5}, 
            {5,9,7}, 
            {1,13,3}, 
            {5,5,8}
        };
        System.out.println(c[2][1]);
        
        
        String[][] quitanda = {
            {"Banana", "Maçã", "Uva", "Morango"},
            {"Alface", "Couve", "Pepino", "Salsinha", "Pimentão", "Brocólis"},
            {"Abacate", "Tomate", "Jiló", "Abobrinha"}
        };
        System.out.println(quitanda[1][4]);
        
        System.out.println("******************************");
        
        Especialidade especialidade1 = new Especialidade("Cardiologia");
        // especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao("Não deixa ter um ataque");
        
        
        EspecialidadeDAO.gravar(especialidade1);
       
        
        
        Especialidade especialidade2 = new Especialidade();
        especialidade2.setNome("Gastroemtrologia");
        especialidade2.setDescricao("Não deixa ter dor de barriga");
        
        
        EspecialidadeDAO.gravar(especialidade2);
        
        
        for(Especialidade ee : EspecialidadeDAO.getEspecialidades()){
            System.out.println(ee.getNome());
        }
        
        
        for(Especialidade ee : EspecialidadeDAO.getEspecialidades()){
            System.out.println(ee.getNome());
        }
        System.out.println("-----------BUSCA---------------");
        Especialidade procurada = EspecialidadeDAO.getEspecialidade(100);
        System.out.println("Procurada: " + procurada.getNome());
        
        
        System.out.println("-------------UPDATE-------------");
        Especialidade especialidadeAtualizada = new Especialidade();
        especialidadeAtualizada.setCodigo(100);
        especialidadeAtualizada.setNome("Otorrinolaringologia");
        especialidadeAtualizada.setDescricao("Nova descrição");
        EspecialidadeDAO.atualizar(especialidadeAtualizada);
        
        for(Especialidade ee : EspecialidadeDAO.getEspecialidades()){
            System.out.println(ee.getNome());
        }
        
        System.out.println("---------------------------------");
        
        Especialidade especialidade4 = new Especialidade("Clinico", "De tudo um pouco");

        EspecialidadeDAO.gravar(especialidade4);
        
        

        ArrayList<Especialidade> especialidadades = new ArrayList<>();
        especialidadades.add(especialidade1);
        especialidadades.add(especialidade2);
        especialidadades.add(especialidade4);
        System.out.println(especialidadades.size());

        // Imprimir no console o nome das especialidades que estão armazenadas no
        // arraylist
        int i = 0;
        while (i < especialidadades.size()) {
            System.out.println(especialidadades.get(i).getNome());
            i++;
        }

        // Utilizando o for para iteração no arraylist
        System.out.println("--------------------FOR-------------------");
        for (int x = 0; x < especialidadades.size(); x++) {
            System.out.println(especialidadades.get(x).getNome());
        }

        // FOR EACH
        System.out.println("----------------FOR EACH-----------------");
        for (Especialidade e : especialidadades) {
            System.out.println(e.getNome());
        }

        // Criar 3 planos de saude , e armazenar em um arraylist e exibir o nome de cada
        // um deles
        ArrayList<PlanoDeSaude> planos = new ArrayList<>();

        PlanoDeSaude plano1 = new PlanoDeSaude("Operadora de rico");

        PlanoDeSaude plano2 = new PlanoDeSaude();
        plano2.setOperadora("Operadora de pobre");

        PlanoDeSaude plano3 = new PlanoDeSaude();
        plano3.setOperadora("Operadora de classe média");

        planos.add(plano1);
        planos.add(plano2);
        planos.add(plano3);

        System.out.println("------------Planos de Saude----------------");
        for (PlanoDeSaude p : planos) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }

        System.out.println("--------" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);
        System.out.println("--------" + PlanoDeSaude.getQuantidade());

    }

}
