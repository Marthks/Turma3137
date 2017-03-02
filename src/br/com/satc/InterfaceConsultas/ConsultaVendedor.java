/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.InterfaceConsultas;

import br.com.satc.singleton.BancoVendedor;
import br.com.satc.Tabela.VendedorTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Edutec
 */
public class ConsultaVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaFuncionario
     */
    public ConsultaVendedor() {
        initComponents();
        jRBCodigo.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaPesquisa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTFPesquisa = new javax.swing.JTextField();
        jRBNome = new javax.swing.JRadioButton();
        jRBCodigo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jBPesquisar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        jTabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabelaPesquisa);

        jRBNome.setText("Nome");
        jRBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNomeActionPerformed(evt);
            }
        });

        jRBCodigo.setText("Codigo");
        jRBCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCodigoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Pesquisa");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesquisar))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRBNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBCodigo))
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNome)
                    .addComponent(jRBCodigo))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSair)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
    VendedorTableModel novaTabela;
        if(jRBCodigo.isSelected()){
        int codigo;
        try{
            codigo = Integer.parseInt(jTFPesquisa.getText());
            novaTabela = new VendedorTableModel(BancoVendedor.getInstance().pesquisaCodigo(codigo,BancoVendedor.getInstance().vendedores));
            jTabelaPesquisa.setModel(novaTabela);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this,"Você digitou um código inválido!!\n"+nfe);
            }
        }else{
        if(!(jTFPesquisa.getText().equals(""))){
            String nome = jTFPesquisa.getText();
            novaTabela = new VendedorTableModel(BancoVendedor.getInstance().pesquisaNome(nome,BancoVendedor.getInstance().vendedores));
            jTabelaPesquisa.setModel(novaTabela);
        }else{
            JOptionPane.showMessageDialog(this,"O campo de texto esta em branco!!");
        }
    }                
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jRBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNomeActionPerformed
        jRBCodigo.setSelected(false);
        jTFPesquisa.setText("");
    }//GEN-LAST:event_jRBNomeActionPerformed

    private void jRBCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCodigoActionPerformed
        jRBNome.setSelected(false);
        jTFPesquisa.setText("");
    }//GEN-LAST:event_jRBCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBCodigo;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTable jTabelaPesquisa;
    // End of variables declaration//GEN-END:variables
}