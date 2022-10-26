package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanosDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanosDeSaudeDialog( //add
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public PlanosDeSaudeDialog( //editar
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude plano,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        this.planoDeSaude = plano;
        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadora.setText(planoDeSaude.getOperadora());
        textFieldCategoria.setText(planoDeSaude.getCategoria());
        textFieldNumero.setText(planoDeSaude.getNumero());
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        textFieldValidade.setText(planoDeSaude.getValidade().format(formato));
    }

    private void preencherTitulo() {
        labelTItulo.setText(" Planos de saúde - " + operacao);

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
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textFieldValidade = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(612, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        labelTItulo.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        labelTItulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTItulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plus32.png"))); // NOI18N
        labelTItulo.setText("Planos de saúde - ADICIONAR");
        jPanel1.add(labelTItulo);
        labelTItulo.setBounds(20, 10, 450, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(null);

        labelCodigo.setText("Código");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(30, 60, 60, 16);

        textFieldCodigo.setEditable(false);
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 80, 60, 22);

        labelOperadora.setText("Operadora");
        jPanel2.add(labelOperadora);
        labelOperadora.setBounds(30, 130, 140, 16);

        textFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldOperadora);
        textFieldOperadora.setBounds(30, 150, 180, 22);

        labelCategoria.setText("Categoria");
        jPanel2.add(labelCategoria);
        labelCategoria.setBounds(310, 130, 160, 16);

        textFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCategoria);
        textFieldCategoria.setBounds(310, 150, 180, 22);

        labelNumero.setText("Número");
        jPanel2.add(labelNumero);
        labelNumero.setBounds(30, 200, 130, 16);

        textFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNumero);
        textFieldNumero.setBounds(30, 220, 180, 22);

        labelValidade.setText("Validade");
        jPanel2.add(labelValidade);
        labelValidade.setBounds(310, 200, 210, 16);

        textFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldValidade);
        textFieldValidade.setBounds(310, 220, 180, 22);

        buttonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(390, 280, 70, 40);

        buttonSalvar.setBackground(new java.awt.Color(0, 153, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(470, 280, 70, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 70, 560, 340);

        setSize(new java.awt.Dimension(617, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    private void textFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCategoriaActionPerformed

    private void textFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroActionPerformed

    private void textFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadeActionPerformed
       
    }//GEN-LAST:event_textFieldValidadeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (textFieldOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'operadora' não pode estar vazio.");
            textFieldOperadora.grabFocus();
        } else if (textFieldCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'categoria' não pode estar vazio.");
            textFieldCategoria.grabFocus();
        } else if (textFieldNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'número' não pode estar vazio.");
            textFieldNumero.grabFocus();
        } else if (textFieldValidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'validade' não pode estar vazio.");
            textFieldValidade.grabFocus();
        }else{
            if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
        }

        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void adicionar() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        
        PlanoDeSaude novoPlano = new PlanoDeSaude();
        novoPlano.setOperadora(textFieldOperadora.getText());
        novoPlano.setCategoria(textFieldCategoria.getText());
        novoPlano.setNumero(textFieldNumero.getText());
        novoPlano.setValidade(LocalDate.parse(textFieldValidade.getText(), formato));

        PlanoDeSaudeDAO.gravar(novoPlano);

        JOptionPane.showMessageDialog(
                this,
                "Plano de Saúde gravado com sucesso!",
                "Planos de Saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void editar() {

        planoDeSaude.setOperadora(textFieldOperadora.getText());
        planoDeSaude.setCategoria(textFieldCategoria.getText());
        planoDeSaude.setNumero(textFieldNumero.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidade.getText()));

        PlanoDeSaudeDAO.atualizar(planoDeSaude);

        JOptionPane.showMessageDialog(
                this,
                "Plano de saúde atualizado com sucesso!",
                "Editar plano de saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTItulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JTextField textFieldValidade;
    // End of variables declaration//GEN-END:variables
}
