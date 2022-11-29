package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MedicosDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicosDialog( //add
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public MedicosDialog( //editar
            java.awt.Frame parent,
            boolean modal,
            Medico medico,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        this.medico = medico;
        preencherTitulo();
    }

    private void preencherTitulo() {
        labelTItulo.setText(" Médicos - " + operacao);

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
        labelCrm = new javax.swing.JLabel();
        textFieldCrm = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelDataNascimento = new javax.swing.JLabel();
        textFieldDataNascimento = new javax.swing.JTextField();
        labelListaEspecialidades = new javax.swing.JLabel();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        listEspecialidades = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        listEspecialidadesDoMedico = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        buttonAdicionarEspecialidade = new javax.swing.JButton();
        buttonRemoverEspecialidade = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        labelTItulo.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        labelTItulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTItulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plus32.png"))); // NOI18N
        labelTItulo.setText(" Médicos - ADICIONAR");
        jPanel1.add(labelTItulo);
        labelTItulo.setBounds(20, 10, 450, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Médico:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        labelCodigo.setText("Código:");

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setText(" ");
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });

        labelCrm.setText("CRM:");

        textFieldCrm.setText(" ");
        textFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrmActionPerformed(evt);
            }
        });

        labelNome.setText("Nome do (a) médico (a):");

        textFieldNome.setText(" ");
        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        labelTelefone.setText("Telefone:");

        textFieldTelefone.setText(" ");
        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });

        labelEmail.setText("E mail:");

        textFieldEmail.setText(" ");
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        labelDataNascimento.setText("Data de nascimento:");

        textFieldDataNascimento.setText(" ");
        textFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataNascimentoActionPerformed(evt);
            }
        });

        labelListaEspecialidades.setText("Lista de especialidades:");

        labelEspecialidadesMedico.setText("Especialidades do médico:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEspecialidades.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEspecialidadesDoMedico.setViewportView(jList2);

        buttonAdicionarEspecialidade.setBackground(new java.awt.Color(0, 204, 102));
        buttonAdicionarEspecialidade.setForeground(new java.awt.Color(204, 255, 204));
        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-direita.png"))); // NOI18N
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });

        buttonRemoverEspecialidade.setBackground(new java.awt.Color(255, 0, 51));
        buttonRemoverEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-esquerda.png"))); // NOI18N
        buttonRemoverEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverEspecialidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCrm)
                            .addComponent(textFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefone)
                                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelEmail)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textFieldEmail))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelListaEspecialidades)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(listEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonAdicionarEspecialidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonRemoverEspecialidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(68, 68, 68)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataNascimento)
                            .addComponent(textFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listEspecialidadesDoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEspecialidadesMedico))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCrm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelListaEspecialidades, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEspecialidadesMedico, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listEspecialidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listEspecialidadesDoMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buttonAdicionarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRemoverEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 620, 370);

        buttonSalvar.setBackground(new java.awt.Color(0, 153, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(550, 460, 70, 40);

        buttonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar);
        buttonCancelar.setBounds(470, 460, 70, 40);

        setSize(new java.awt.Dimension(664, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrmActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataNascimentoActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void buttonRemoverEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRemoverEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (textFieldCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo CRM não pode estar vazio.");
            textFieldCrm.grabFocus();
        } else if (textFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo nome não pode estar vazio.");
            textFieldNome.grabFocus();
        } else if (textFieldTelefone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo telefone não pode estar vazio.");
            textFieldTelefone.grabFocus();
        } else if (textFieldEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio.");
            textFieldEmail.grabFocus();
        } else if(textFieldDataNascimento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo data de nascimento não pode estar vazio.");
        } else {
            if (operacao == OperacaoEnum.ADICIONAR){
                adicionar();
            } else {
                editar();
            }
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void adicionar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Medico novoMedico = new Medico();
        novoMedico.setCrm(textFieldCrm.getText());
        novoMedico.setNome(textFieldNome.getText());
        novoMedico.setTelefone(textFieldTelefone.getText());
        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setDataNascimento(LocalDate.parse(textFieldDataNascimento.getText(), formato));

        MedicoDAO.gravar(novoMedico);

        JOptionPane.showMessageDialog(
                this,
                "Médico gravado com sucesso!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();

    }

    
    private void editar(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRemoverEspecialidade;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListaEspecialidades;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTItulo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JScrollPane listEspecialidades;
    private javax.swing.JScrollPane listEspecialidadesDoMedico;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JTextField textFieldDataNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
