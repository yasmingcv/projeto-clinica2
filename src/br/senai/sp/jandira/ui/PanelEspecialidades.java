package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class PanelEspecialidades extends javax.swing.JPanel {

    //atributo
    private int linha;
    
    
    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonNovaEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 300));
        setLayout(null);

        buttonExcluirEspecialidade.setBackground(new java.awt.Color(255, 102, 102));
        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir especialidade");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(470, 250, 80, 40);

        buttonNovaEspecialidade.setBackground(new java.awt.Color(153, 255, 153));
        buttonNovaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plus32.png"))); // NOI18N
        buttonNovaEspecialidade.setToolTipText("Nova especialidade");
        buttonNovaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonNovaEspecialidade);
        buttonNovaEspecialidade.setBounds(650, 250, 80, 40);

        buttonEditarEspecialidade.setBackground(new java.awt.Color(51, 204, 255));
        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("Editar especialidade");
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(560, 250, 80, 40);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableEspecialidades);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 22, 720, 210);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja excluir.",
                    "ATENÇÃO!",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void editarEspecialidade(){
        
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadesDialog especialidadeDialog = 
                new EspecialidadesDialog(null, 
                    true, 
                    especialidade, 
                    OperacaoEnum.EDITAR);
        
        especialidadeDialog.setVisible(true);
        
        preencherTabela();
    }
    
    
    private void excluirEspecialidade() {
        

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza de que deseja excluir o item " + getCodigo() + "?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();

        }

    }
    
    private Integer getCodigo(){
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();  
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }


    private void buttonNovaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecialidadeActionPerformed
        EspecialidadesDialog d = new EspecialidadesDialog(
                null, 
                true,
                OperacaoEnum.ADICIONAR);
        
        d.setVisible(true);

        preencherTabela();
    }//GEN-LAST:event_buttonNovaEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed
        
        if(getLinha() != -1){
            editarEspecialidade();
        }else{
            JOptionPane.showConfirmDialog(
                    null, 
                    "Por favor, selecione a especialidade que você deseja editar", 
                    "Especialidades", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JButton buttonNovaEspecialidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTabela();

    }

    private void ajustarTabela() {
        //Impedir que o usuário movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);

        //Definir a largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(400);

    }

}
