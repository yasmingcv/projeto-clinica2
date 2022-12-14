package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanosDeSaude extends javax.swing.JPanel {

    int linha;

    public PanelPlanosDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaude();
        preencherTabela();
    }

    private int getLinha() {
        linha = tablePlanosDeSaude.getSelectedRow();
        return linha;
    }
    
    private Integer getCodigo(){
        String codigoStr = tablePlanosDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonNovoPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saude:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 300));
        setLayout(null);

        buttonNovoPlanoDeSaude.setBackground(new java.awt.Color(153, 255, 153));
        buttonNovoPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plus32.png"))); // NOI18N
        buttonNovoPlanoDeSaude.setToolTipText("Novo plano de saúde");
        buttonNovoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonNovoPlanoDeSaude);
        buttonNovoPlanoDeSaude.setBounds(650, 250, 80, 40);

        buttonEditarPlanoDeSaude.setBackground(new java.awt.Color(51, 204, 255));
        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar plano de saúde");
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(560, 250, 80, 40);

        buttonExcluirPlanoDeSaude.setBackground(new java.awt.Color(255, 102, 102));
        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(470, 250, 80, 40);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablePlanosDeSaude);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 22, 720, 210);
    }// </editor-fold>//GEN-END:initComponents

    private void editarPlanoDeSaude(){
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanosDeSaudeDialog planoDeSaudeDialog = new PlanosDeSaudeDialog(
                null, 
                true, 
                planoDeSaude, 
                OperacaoEnum.EDITAR);
        
        planoDeSaudeDialog.setVisible(true);
        
        preencherTabela();
    }
        
    
    
    private void excluirPlanoDeSaude(){
        int resposta = JOptionPane.showConfirmDialog(
                this, 
                "Tem certeza de que deseja excluir?", 
                "ATENÇÃO!", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if(resposta == 0){
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
            
    
    private void buttonNovoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoPlanoDeSaudeActionPerformed
        PlanosDeSaudeDialog d = new PlanosDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        d.setVisible(true);

        preencherTabela();
    }//GEN-LAST:event_buttonNovoPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed
        if(getLinha() != -1){
            editarPlanoDeSaude();
        }else{
            JOptionPane.showMessageDialog(
                    null, 
                    "Por favor, selecione o plano de saúde que deseja editar.", 
                    "Planos de saúde", 
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
        if(getLinha() != -1){
            excluirPlanoDeSaude();
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano de saúde que deseja excluir.",
                    "Planos de saúde",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonNovoPlanoDeSaude;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTabelaPlanosDeSaude());
        ajustarTabela();

    }

    private void ajustarTabela() {
        //Impedir que o usuário movimente as colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);
        
    }

}
