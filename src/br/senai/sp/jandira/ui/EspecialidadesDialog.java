package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;
 
    public EspecialidadesDialog( //criar nova especialidade 
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) 
    {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();

    }

    public EspecialidadesDialog( // editar especialidade
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao
    ) {

        super(parent, modal);
        initComponents();

        especialidade = e;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();

    }
    
    //

    private void preencherFormulario() {

        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeDaEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoDaEspecialidade.setText(especialidade.getDescricao());

    }

    private void preencherTitulo() {
        labelTItulo.setText(" Especialidades - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTItulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        } else {
            labelTItulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plus32.png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTItulo = new javax.swing.JLabel();
        panelDetalhesDaEspecialidade = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        textFieldNomeDaEspecialidade = new javax.swing.JTextField();
        labelDescricaoDaEspecialidade = new javax.swing.JLabel();
        textFieldDescricaoDaEspecialidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar nova especialidade");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        labelTItulo.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        labelTItulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTItulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plus32.png"))); // NOI18N
        labelTItulo.setText(" Especialidades - adicionar");
        jPanel1.add(labelTItulo);
        labelTItulo.setBounds(20, 10, 450, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 50);

        panelDetalhesDaEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        panelDetalhesDaEspecialidade.setLayout(null);

        labelCodigo.setText("Código");
        panelDetalhesDaEspecialidade.add(labelCodigo);
        labelCodigo.setBounds(30, 50, 70, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhesDaEspecialidade.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 70, 80, 22);

        labelNomeDaEspecialidade.setText("Nome da especialidade");
        panelDetalhesDaEspecialidade.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(30, 120, 210, 16);

        textFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhesDaEspecialidade.add(textFieldNomeDaEspecialidade);
        textFieldNomeDaEspecialidade.setBounds(30, 140, 230, 22);

        labelDescricaoDaEspecialidade.setText("Descrição da especialidade");
        panelDetalhesDaEspecialidade.add(labelDescricaoDaEspecialidade);
        labelDescricaoDaEspecialidade.setBounds(30, 190, 180, 16);

        textFieldDescricaoDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoDaEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhesDaEspecialidade.add(textFieldDescricaoDaEspecialidade);
        textFieldDescricaoDaEspecialidade.setBounds(30, 210, 400, 20);

        buttonSalvar.setBackground(new java.awt.Color(0, 153, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhesDaEspecialidade.add(buttonSalvar);
        buttonSalvar.setBounds(460, 280, 70, 40);

        buttonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDetalhesDaEspecialidade.add(buttonCancelar);
        buttonCancelar.setBounds(380, 280, 70, 40);

        getContentPane().add(panelDetalhesDaEspecialidade);
        panelDetalhesDaEspecialidade.setBounds(20, 80, 560, 330);

        setSize(new java.awt.Dimension(618, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void editar() {
        especialidade.setNome(textFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricaoDaEspecialidade.getText());

        EspecialidadeDAO.atualizar(especialidade);

        JOptionPane.showMessageDialog(
                this,
                "Especialidade atualizada com sucesso!",
                "Editar especialidade",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void adicionar() {
        // Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoDaEspecialidade.getText());

        // Gravar um objeto, através do DAO
        EspecialidadeDAO.gravar(novaEspecialidade);

        JOptionPane.showMessageDialog(
                this,
                "Especialidade gravada com sucesso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecialidadeActionPerformed

    }//GEN-LAST:event_textFieldNomeDaEspecialidadeActionPerformed

    private void textFieldDescricaoDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoDaEspecialidadeActionPerformed

    }//GEN-LAST:event_textFieldDescricaoDaEspecialidadeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTItulo;
    private javax.swing.JPanel panelDetalhesDaEspecialidade;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoDaEspecialidade;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
