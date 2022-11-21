/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;


import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/calendar32.png")));
        initPanels();
  

    }

    //Atributos da classe:
    PanelEspecialidades panelEspecialidades;
    PanelPlanosDeSaude panelPlanosDeSaude;
    PanelMedicos panelMedicos;

    //Constantes:
    private final int POS_X = 30;
    private final int POS_Y = 150;
    private final int LARGURA = 740;
    private final int ALTURA = 300;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelIconeTitulo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelSisacon = new javax.swing.JLabel();
        labelSubtitle = new javax.swing.JLabel();
        panelLinha = new javax.swing.JPanel();
        labelContato = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelSite = new javax.swing.JLabel();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de agendamento");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(0, 204, 204));
        panelTitulo.setLayout(null);

        labelIconeTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        panelTitulo.add(labelIconeTitulo);
        labelIconeTitulo.setBounds(20, 10, 40, 40);

        labelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo.setText("Sistema para Agendamento de consultas");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(70, 10, 460, 40);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 800, 60);

        buttonHome.setBackground(new java.awt.Color(0, 153, 204));
        buttonHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/homet-32.png"))); // NOI18N
        buttonHome.setToolTipText("Home");
        buttonHome.setBorder(null);
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(30, 80, 70, 50);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 204, 204));
        buttonPlanoDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/id-card32.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de saúde");
        buttonPlanoDeSaude.setBorder(null);
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(570, 80, 100, 50);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        labelSisacon.setBackground(new java.awt.Color(0, 204, 204));
        labelSisacon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSisacon.setForeground(new java.awt.Color(0, 204, 204));
        labelSisacon.setText("SISACON");
        panelHome.add(labelSisacon);
        labelSisacon.setBounds(30, 60, 110, 32);

        labelSubtitle.setText("Sistema para agendamento de consultas");
        panelHome.add(labelSubtitle);
        labelSubtitle.setBounds(30, 90, 330, 16);

        panelLinha.setBackground(new java.awt.Color(0, 204, 204));
        panelHome.add(panelLinha);
        panelLinha.setBounds(30, 120, 680, 2);

        labelContato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelContato.setForeground(new java.awt.Color(0, 204, 204));
        labelContato.setText("Contato:");
        panelHome.add(labelContato);
        labelContato.setBounds(650, 130, 60, 20);

        labelEmail.setText("suporte@sisacon.com");
        panelHome.add(labelEmail);
        labelEmail.setBounds(587, 160, 180, 16);

        labelTelefone.setText("(11) 4002-8922");
        panelHome.add(labelTelefone);
        labelTelefone.setBounds(630, 180, 110, 16);

        labelSite.setText("www.sisacon.com");
        panelHome.add(labelSite);
        labelSite.setBounds(610, 200, 130, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(30, 150, 740, 300);

        buttonAgenda.setBackground(new java.awt.Color(204, 204, 204));
        buttonAgenda.setForeground(new java.awt.Color(255, 255, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendar32.png"))); // NOI18N
        buttonAgenda.setToolTipText("Novo agendamento");
        buttonAgenda.setBorder(null);
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(130, 80, 100, 50);

        buttonPaciente.setBackground(new java.awt.Color(204, 204, 204));
        buttonPaciente.setForeground(new java.awt.Color(255, 255, 255));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick32.png"))); // NOI18N
        buttonPaciente.setToolTipText("Cadastro de pacientes");
        buttonPaciente.setBorder(null);
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(240, 80, 100, 50);

        buttonMedico.setBackground(new java.awt.Color(204, 204, 204));
        buttonMedico.setForeground(new java.awt.Color(255, 255, 255));
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor32.png"))); // NOI18N
        buttonMedico.setToolTipText("Cadastro de médicos");
        buttonMedico.setBorder(null);
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(350, 80, 100, 50);

        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/estetoscopio32.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Nova especialidade");
        buttonEspecialidades.setBorder(null);
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(460, 80, 100, 50);

        buttonSair.setBackground(new java.awt.Color(255, 51, 0));
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/logout32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.setBorder(null);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(700, 80, 70, 50);

        setSize(new java.awt.Dimension(816, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed

        panelEspecialidades.setVisible(false);
        panelPlanosDeSaude.setVisible(false);
        panelHome.setVisible(true);
        buttonEspecialidades.setBackground(new Color(204,204,204));
        buttonPlanoDeSaude.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        buttonEspecialidades.setBackground(new Color(204,204,204));
        buttonPlanoDeSaude.setBackground(new Color(153, 153, 153, 153));
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanosDeSaude.setVisible(true);
        
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        panelEspecialidades.setVisible(false);
        panelPlanosDeSaude.setVisible(false);
        panelHome.setVisible(false);
        panelMedicos.setVisible(true);
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        buttonEspecialidades.setBackground(new Color(153,153,153));
        buttonPlanoDeSaude.setBackground(new Color(204,204,204,204));
        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
      

    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja sair?");
        if(a == 0 ){
            dispose();
        }
    }//GEN-LAST:event_buttonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIconeTitulo;
    private javax.swing.JLabel labelSisacon;
    private javax.swing.JLabel labelSite;
    private javax.swing.JLabel labelSubtitle;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelLinha;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        
        // 
        
        
        panelPlanosDeSaude = new PanelPlanosDeSaude();
        panelPlanosDeSaude.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA, 
                ALTURA);
        
        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setVisible(false);
        
        //
        
        panelMedicos = new PanelMedicos();
        panelMedicos.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA, 
                ALTURA);
        
        getContentPane().add(panelMedicos);
        panelMedicos.setVisible(false);
    }

}
