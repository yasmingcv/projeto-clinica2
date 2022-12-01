package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class PanelMedicos extends javax.swing.JPanel {

    int linha;

    public PanelMedicos() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();

        preencherTabela();

    }

    @SuppressWarnings("unchecked")

    private Integer getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonNovoMedico = new javax.swing.JButton();
        buttonEditarMedico = new javax.swing.JButton();
        buttonExcluirMedico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(740, 300));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 300));
        jPanel1.setLayout(null);

        buttonNovoMedico.setBackground(new java.awt.Color(153, 255, 153));
        buttonNovoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plus32.png"))); // NOI18N
        buttonNovoMedico.setToolTipText("Novo médico");
        buttonNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonNovoMedico);
        buttonNovoMedico.setBounds(650, 250, 80, 40);

        buttonEditarMedico.setBackground(new java.awt.Color(51, 204, 255));
        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonEditarMedico.setToolTipText("Editar médico");
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEditarMedico);
        buttonEditarMedico.setBounds(560, 250, 80, 40);

        buttonExcluirMedico.setBackground(new java.awt.Color(255, 102, 102));
        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir médico");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(470, 250, 80, 40);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableMedicos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 22, 720, 210);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 300);
    }// </editor-fold>//GEN-END:initComponents

    public void editarMedico() {
        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicosDialog medicoDialog = new MedicosDialog(
                null,
                true,
                medico,
                OperacaoEnum.EDITAR);

        medicoDialog.setVisible(true);
        preencherTabela();
    }

    public void excluirMedico() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza de que deseja excluir?",
                "ATENÇÃO!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            preencherTabela();
        }
    }


    private void buttonNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoMedicoActionPerformed
        MedicosDialog m = new MedicosDialog(null, true, OperacaoEnum.ADICIONAR);
        m.setVisible(true);

        preencherTabela();

    }//GEN-LAST:event_buttonNovoMedicoActionPerformed

    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Por favor, selecione o  médico que deseja editar.",
                    "Médicos",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_buttonEditarMedicoActionPerformed

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed
        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Por favor, selecione o  médico que deseja excluir.",
                    "Médicos",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JButton buttonNovoMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        tableMedicos.setModel(MedicoDAO.getTabelaMedicos());
        ajustarTabela();
    }

    private void ajustarTabela() {
        //Impedir que o usuário movimente as colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableMedicos.setDefaultEditor(Object.class, null);

    }
}
