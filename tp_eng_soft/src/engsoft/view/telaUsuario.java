/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * telaUsuario.java --> Aqui são feitas as operações propostas após o usuário entrar com o seu login
 *
 * Created on 17/11/2013, 19:32:28
 */
package engsoft.view;

import engsoft.data.Fabricante_DAO;
import engsoft.data.Peca_DAO;
import org.jdesktop.application.Action;
import engsoft.control.Fabricante;
import engsoft.control.Peca;

/**
 *
 * @author gsnasc
 */
public class telaUsuario extends javax.swing.JFrame {

    /** Creates new form telaUsuario */
    public telaUsuario() {
        initComponents();
    }
    
           private void insertPiece() {
      
           Peca peca = new Peca();
           peca.setFabricante(end_cliente_field.getText());
           peca.setLote(tel_cliente_field.getText());
           peca.setNome(nome_cliente_field.getText());
           peca.setQtdade_estoque(Integer.parseInt(cpf_cliente_field.getText()));
           
           Peca_DAO p_dao = new Peca_DAO();
           p_dao.adPeca(peca);
           
           
       }   
           
       private void insertManufacturer() {
      
           Fabricante fab = new Fabricante();
           Fabricante_DAO fab_dao = new Fabricante_DAO();
           fab.setNome(nome_fab_field.getText());
           fab.setEndereço(end_fab_field.getText());
           fab.setTelefone(tel_fab_field.getText());
           fab_dao.adFabricante(fab);
           
           
           
       }   


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nome_cliente_field = new javax.swing.JTextField();
        end_cliente_field = new javax.swing.JTextField();
        tel_cliente_field = new javax.swing.JTextField();
        cpf_cliente_field = new javax.swing.JTextField();
        rg_cliente_field = new javax.swing.JTextField();
        nasc_cliente_field = new javax.swing.JTextField();
        cid_cliente_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        masc_radio = new javax.swing.JRadioButton();
        fem_radio = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        envia_cliente = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nome_fab_field = new javax.swing.JTextField();
        end_fab_field = new javax.swing.JTextField();
        tel_fab_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        envia_fab = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nome_peca_field = new javax.swing.JTextField();
        fab_peca_field = new javax.swing.JTextField();
        lote_peca_field = new javax.swing.JTextField();
        qt_peca_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        envia_peca = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N

        nome_cliente_field.setName("nome_cliente_field"); // NOI18N

        end_cliente_field.setName("end_cliente_field"); // NOI18N

        tel_cliente_field.setName("tel_cliente_field"); // NOI18N

        cpf_cliente_field.setName("cpf_cliente_field"); // NOI18N

        rg_cliente_field.setName("rg_cliente_field"); // NOI18N

        nasc_cliente_field.setName("nasc_cliente_field"); // NOI18N
        nasc_cliente_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasc_cliente_fieldActionPerformed(evt);
            }
        });

        cid_cliente_field.setName("cid_cliente_field"); // NOI18N

        jLabel1.setText("Nome:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Endereço:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Telefone:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("CPF:");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("RG:");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText("Data de Nascimento:");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText("Cidade:");
        jLabel7.setName("jLabel7"); // NOI18N

        masc_radio.setText("Masculino");
        masc_radio.setName("masc_radio"); // NOI18N
        masc_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masc_radioActionPerformed(evt);
            }
        });

        fem_radio.setText("Feminino");
        fem_radio.setName("fem_radio"); // NOI18N

        jLabel15.setText("Sexo:");
        jLabel15.setName("jLabel15"); // NOI18N

        envia_cliente.setText("Enviar");
        envia_cliente.setName("envia_cliente"); // NOI18N

        jLabel16.setText("Cadastro de clientes no Sistema");
        jLabel16.setName("jLabel16"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(envia_cliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cid_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(rg_cliente_field, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nasc_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(116, 116, 116))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nome_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(end_cliente_field, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tel_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf_cliente_field, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                            .addComponent(jLabel16))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(masc_radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fem_radio)))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(end_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tel_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cpf_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rg_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nasc_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cid_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(masc_radio)
                        .addComponent(fem_radio)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(envia_cliente))
        );

        jTabbedPane1.addTab("Cadastrar Cliente", jPanel1);

        jPanel3.setName("jPanel3"); // NOI18N

        nome_fab_field.setName("nome_fab_field"); // NOI18N
        nome_fab_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_fab_fieldActionPerformed(evt);
            }
        });

        end_fab_field.setName("end_fab_field"); // NOI18N

        tel_fab_field.setName("tel_fab_field"); // NOI18N
        tel_fab_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_fab_fieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Nome:");
        jLabel12.setName("jLabel12"); // NOI18N

        jLabel13.setText("Endereço:");
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel14.setText("Telefone:");
        jLabel14.setName("jLabel14"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance().getContext().getActionMap(telaUsuario.class, this);
        envia_fab.setAction(actionMap.get("sendMan")); // NOI18N
        envia_fab.setName("envia_fab"); // NOI18N

        jLabel17.setText("Cadastro de fabricantes de peças e eletrodomésticos no sistema");
        jLabel17.setName("jLabel17"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(677, Short.MAX_VALUE)
                .addComponent(envia_fab)
                .addGap(106, 106, 106))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(11, 11, 11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tel_fab_field, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_fab_field, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(end_fab_field, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel17)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel17)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_fab_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(end_fab_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel_fab_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(envia_fab))
        );

        jTabbedPane1.addTab("Cadastrar Fabricante", jPanel3);

        jPanel2.setName("jPanel2"); // NOI18N

        nome_peca_field.setName("nome_peca_field"); // NOI18N

        fab_peca_field.setName("fab_peca_field"); // NOI18N

        lote_peca_field.setName("lote_peca_field"); // NOI18N

        qt_peca_field.setName("qt_peca_field"); // NOI18N

        jLabel8.setText("Nome:");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setText("Fabricante:");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setText("Lote:");
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel11.setText("Quantidade em estoque:");
        jLabel11.setName("jLabel11"); // NOI18N

        envia_peca.setText("Enviar");
        envia_peca.setName("envia_peca"); // NOI18N

        jLabel18.setText("Cadastro de peças no sistema ");
        jLabel18.setName("jLabel18"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(lote_peca_field, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(16, 16, 16)
                        .addComponent(qt_peca_field, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(nome_peca_field, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fab_peca_field)))
                .addContainerGap(496, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(673, Short.MAX_VALUE)
                .addComponent(envia_peca)
                .addGap(110, 110, 110))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel18)
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nome_peca_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fab_peca_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lote_peca_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(qt_peca_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(envia_peca))
        );

        jTabbedPane1.addTab("Cadastrar Peça", jPanel2);

        jPanel4.setName("jPanel4"); // NOI18N

        jButton4.setText("Imprimir");
        jButton4.setName("jButton4"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(678, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(91, 91, 91))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        jTabbedPane1.addTab("Gerar Orçamento", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_fab_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_fab_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_fab_fieldActionPerformed

    private void tel_fab_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_fab_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_fab_fieldActionPerformed

    private void nasc_cliente_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasc_cliente_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nasc_cliente_fieldActionPerformed

    private void masc_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masc_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masc_radioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new telaUsuario().setVisible(true);
            }
        });
    }

    @Action
    public void sendMan() {
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cid_cliente_field;
    private javax.swing.JTextField cpf_cliente_field;
    private javax.swing.JTextField end_cliente_field;
    private javax.swing.JTextField end_fab_field;
    private javax.swing.JButton envia_cliente;
    private javax.swing.JButton envia_fab;
    private javax.swing.JButton envia_peca;
    private javax.swing.JTextField fab_peca_field;
    private javax.swing.JRadioButton fem_radio;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lote_peca_field;
    private javax.swing.JRadioButton masc_radio;
    private javax.swing.JTextField nasc_cliente_field;
    private javax.swing.JTextField nome_cliente_field;
    private javax.swing.JTextField nome_fab_field;
    private javax.swing.JTextField nome_peca_field;
    private javax.swing.JTextField qt_peca_field;
    private javax.swing.JTextField rg_cliente_field;
    private javax.swing.JTextField tel_cliente_field;
    private javax.swing.JTextField tel_fab_field;
    // End of variables declaration//GEN-END:variables
}