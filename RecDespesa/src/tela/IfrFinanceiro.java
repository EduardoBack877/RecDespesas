/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import apoio.ComboDescricao;
import apoio.CombosDAO;
import dao.CategoriaDAO;
import dao.FluxoDeCaixaDAO;
import entidade.Categoria;
import entidade.FluxoDeCaixa;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Back
 */
public class IfrFinanceiro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Financeiro
     */
    public IfrFinanceiro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfdDescricaoFinanceiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdValorFinanceiro = new javax.swing.JTextField();
        rbtnReceitas = new javax.swing.JRadioButton();
        rbtnDespesas = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tfdCategoriaFinanceiro = new javax.swing.JTextField();
        btnSalvarFinanceiro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TIdFinanceiro = new javax.swing.JTable();
        btnConsultarFinanceiro = new javax.swing.JButton();
        tfdConsultar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        label1.setText("label1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Receitas/Despesas");

        jLabel2.setText("Descrição");

        jLabel3.setText("Valor");

        rbtnReceitas.setText("Receita");
        rbtnReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnReceitasActionPerformed(evt);
            }
        });

        rbtnDespesas.setText("Despesa");
        rbtnDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDespesasActionPerformed(evt);
            }
        });

        jLabel4.setText("Categoria");

        btnSalvarFinanceiro.setText("Salvar");
        btnSalvarFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFinanceiroActionPerformed(evt);
            }
        });

        TIdFinanceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Valor", "Descricao", "Tipo", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(TIdFinanceiro);

        btnConsultarFinanceiro.setText("Consultar");
        btnConsultarFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFinanceiroActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarFinanceiro)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(32, 32, 32)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfdDescricaoFinanceiro)
                                            .addComponent(tfdValorFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfdCategoriaFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnReceitas)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnDespesas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarFinanceiro)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdDescricaoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdValorFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfdCategoriaFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnReceitas)
                    .addComponent(rbtnDespesas)
                    .addComponent(btnConsultarFinanceiro)
                    .addComponent(tfdConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnSalvarFinanceiro)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnReceitasActionPerformed
       if (rbtnReceitas.isSelected())
           rbtnDespesas.setSelected(false);
    }//GEN-LAST:event_rbtnReceitasActionPerformed
        public char recebeChar () {
        if (rbtnReceitas.isSelected()) {
            return 'R';
        } else {
        return 'P';
        }
        }
       
        
    private void rbtnDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDespesasActionPerformed
        if (rbtnDespesas.isSelected())
           rbtnReceitas.setSelected(false);
    }//GEN-LAST:event_rbtnDespesasActionPerformed

    private void btnSalvarFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFinanceiroActionPerformed
            FluxoDeCaixa f = new FluxoDeCaixa();
            Double num = Double.parseDouble( tfdValorFinanceiro.getText());
        f.setValor(num);
        f.setDescricao(tfdDescricaoFinanceiro.getText());
        f.setPagarreceber(recebeChar());
        f.setCategoria(tfdCategoriaFinanceiro.getText());
        
        if (new FluxoDeCaixaDAO().salvar(f)) {
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
        f.setDescricao("");
        f.setCategoria(tfdCategoriaFinanceiro.getText());
            tfdDescricaoFinanceiro.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");                                          
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarFinanceiroActionPerformed

    private void btnConsultarFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFinanceiroActionPerformed
      new FluxoDeCaixaDAO().popularTabela(TIdFinanceiro,tfdConsultar.getText());       // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarFinanceiroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TIdFinanceiro;
    private javax.swing.JButton btnConsultarFinanceiro;
    private javax.swing.JButton btnSalvarFinanceiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JRadioButton rbtnDespesas;
    private javax.swing.JRadioButton rbtnReceitas;
    private javax.swing.JTextField tfdCategoriaFinanceiro;
    private javax.swing.JTextField tfdConsultar;
    private javax.swing.JTextField tfdDescricaoFinanceiro;
    private javax.swing.JTextField tfdValorFinanceiro;
    // End of variables declaration//GEN-END:variables
}
