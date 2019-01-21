/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Utilitarios.Conexao;
import Utilitarios.ControleVenda;
import Utilitarios.Tabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import modelo.ModeloVenda;

/**
 *
 * @author Augusto
 */
public class FrmVenda extends javax.swing.JFrame {

    Conexao conexao = new Conexao();
    ModeloVenda mod = new ModeloVenda();
    ControleVenda control = new ControleVenda();
    int flag = 1, codVenda;
    float preco_produto, total = 0;
    DecimalFormat dc = new DecimalFormat("#0.00");
    
    public FrmVenda() {
        initComponents();
        conexao.Conectar();
        
        try{
            MaskFormatter form = new MaskFormatter("##/##/####");
            txtDataVenda.setFormatterFactory(new DefaultFormatterFactory(form));
            
        } catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro no MaskFormatter!\nERRO:" + ex);
        }
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        txtDataVenda.setText(df.format(hoje));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        btPesquisaNome = new javax.swing.JButton();
        btBuscaProduto = new javax.swing.JButton();
        txtDataVenda = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtValorUnidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTabelaPesquisa = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtComboPagamento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTabelaVenda = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btFinalizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comanda");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulário de Vendas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("Data da Venda:");

        jLabel4.setText("Produto:");

        jLabel5.setText("Quantidade:");

        jLabel6.setText("Valor Unidade:");

        btPesquisaNome.setText("Buscar");
        btPesquisaNome.setToolTipText("clique para buscar um cliente");
        btPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaNomeActionPerformed(evt);
            }
        });

        btBuscaProduto.setText("Buscar");
        btBuscaProduto.setToolTipText("clique para adicionar um produto");
        btBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaProdutoActionPerformed(evt);
            }
        });

        txtDataVenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDataVenda.setEnabled(false);
        txtDataVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataVendaFocusGained(evt);
            }
        });
        txtDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataVendaActionPerformed(evt);
            }
        });

        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusGained(evt);
            }
        });

        txtValorUnidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtValorUnidade.setEnabled(false);

        jLabel7.setText("Valor Total:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        txtTabelaPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTabelaPesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtTabelaPesquisa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel8.setText("Forma de Pagamento:");

        txtComboPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Credito", "Debito" }));

        jLabel9.setText("Tabela de Pesquisa:");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        txtTabelaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTabelaVendaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtTabelaVenda);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        jLabel10.setText("Itens da venda:");

        btFinalizar.setText("Finalizar Venda");
        btFinalizar.setToolTipText("clique para finalizar a venda");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar Venda");
        btCancelar.setToolTipText("clique para cancelar a venda");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_voltar.png"))); // NOI18N
        btVoltar.setToolTipText("clique para voltar para a janela anterior");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.setToolTipText("use para adicionar um produto");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(txtComboPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btPesquisaNome))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtValorUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscaProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisaNome)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscaProduto)))
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComboPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btFinalizar)
                        .addComponent(btCancelar)))
                .addGap(181, 181, 181))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(616, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataVendaActionPerformed

    private void btPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaNomeActionPerformed
    try {
            PreparedStatement pst = conexao.conn.prepareStatement("INSERT INTO comanda (valor_venda) VALUES (?)");
            pst.setFloat(1,0);
            pst.execute();
            conexao.executaSQL("SELECT * FROM comanda");
            conexao.rs.last();
            codVenda = conexao.rs.getInt("cod_comanda");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: ao iniciar venda!\nERRO:" + ex);
        }
        flag = 1;
        preencherTabelaPesquisa("SELECT * FROM cliente WHERE nome LIKE '%" + txtNomeCliente.getText() + "%'");
    }//GEN-LAST:event_btPesquisaNomeActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtTabelaPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabelaPesquisaMouseClicked
   
        if(flag==1){
        try {
            conexao.Conectar();
            String nome = ""+txtTabelaPesquisa.getValueAt(txtTabelaPesquisa.getSelectedRow(), 1);
            conexao.executaSQL("SELECT * FROM cliente WHERE nome = '" +nome+ "'");
            conexao.rs.first();
            txtNomeCliente.setText(conexao.rs.getString("nome"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Cliente não cadastrado!\nERRO:" + ex);
        }
        } else {
        try {
            conexao.Conectar();
            String nome = ""+txtTabelaPesquisa.getValueAt(txtTabelaPesquisa.getSelectedRow(), 1);
            conexao.executaSQL("SELECT * FROM produto WHERE nome = '" +nome+ "'");
            conexao.rs.first();
            preco_produto = conexao.rs.getFloat("valor_venda");
            txtProduto.setText(conexao.rs.getString("nome"));
            txtValorUnidade.setText(String.valueOf(preco_produto));
            txtQuantidade.setText("1");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Produto não cadastrado!\nERRO:" + ex);
        }
        }
    }//GEN-LAST:event_txtTabelaPesquisaMouseClicked

    private void btBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaProdutoActionPerformed
   
        flag = 2;
        preencherTabelaProduto("SELECT * FROM produto WHERE nome LIKE '%" + txtProduto.getText() + "%'");
    }//GEN-LAST:event_btBuscaProdutoActionPerformed

    private void txtTabelaVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabelaVendaMouseClicked
    
    }//GEN-LAST:event_txtTabelaVendaMouseClicked

    private void txtQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusGained
    float valorTotal;
    valorTotal = Float.parseFloat(txtValorUnidade.getText())*Integer.parseInt(txtQuantidade.getText());
    txtValorTotal.setText(String.valueOf(valorTotal));
    }//GEN-LAST:event_txtQuantidadeFocusGained

    private void txtDataVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataVendaFocusGained
    float valorTotal;
    valorTotal = Float.parseFloat(txtValorUnidade.getText())* Integer.parseInt(txtQuantidade.getText());
  //  txtValorTotal.setText(String.valueOf(valorTotal));
    }//GEN-LAST:event_txtDataVendaFocusGained

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
    
        try {
            int quantidade = 0;
            conexao.Conectar();
            conexao.executaSQL("SELECT * FROM produto WHERE nome ='"+ txtProduto.getText()+"'");
            conexao.rs.first();
            quantidade = conexao.rs.getInt("quantidade");
            if(quantidade >= Integer.parseInt(txtQuantidade.getText())){
                mod.setNomeProduto(txtProduto.getText());
                mod.setQtdItem(Integer.parseInt(txtQuantidade.getText()));
                mod.setIdComanda(codVenda);
                control.adicionaItem(mod);
                preencherTabelaVenda("select * from produto inner join compra on produto.cod_produto = compra.cod_produto "
                    + "inner join comanda on comanda.cod_comanda = compra.cod_compra where comanda.cod_comanda=" + codVenda);
            }else {
                JOptionPane.showMessageDialog(null, "produto indisponivel no estoque!");
            }
        //   total = total+Float.parseFloat(txtValorUnidade.getText())*Integer.parseInt(txtQuantidade.getText());
        //   txtValorTotal.setText(String.valueOf(total));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar quantidade!\nERRO:" + ex);
        }
    
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        mod.setIdComanda(codVenda);
        mod.setNomeCliente(txtNomeCliente.getText());
        mod.setData(txtDataVenda.getText());
        mod.setValorVenda(Float.parseFloat(txtValorTotal.getText()));
        mod.setFormaPagamento(txtComboPagamento.getSelectedItem().toString());
        control.FechaVenda(mod);
        dispose();
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    control.CancelaVenda();
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed
public void preencherTabelaPesquisa(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Codigo", "Nome", "Endereço"};
        
        conexao.executaSQL(SQL);
        try {
            conexao.rs.first();
            do{
            dados.add(new Object[]{conexao.rs.getInt("codigocliente"), conexao.rs.getString("nome"), conexao.rs.getString("endereco")});
        }while(conexao.rs.next());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ArrayList!\nERRO: " + ex);
        }
        Tabela modelo = new Tabela(dados, Colunas);
        txtTabelaPesquisa.setModel(modelo);
        txtTabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(100);
        txtTabelaPesquisa.getColumnModel().getColumn(0).setResizable(false);
        txtTabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(200);
        txtTabelaPesquisa.getColumnModel().getColumn(1).setResizable(false);
        txtTabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(260);
        txtTabelaPesquisa.getColumnModel().getColumn(2).setResizable(false);
        txtTabelaPesquisa.getTableHeader().setReorderingAllowed(false);
        txtTabelaPesquisa.setAutoResizeMode(txtTabelaPesquisa.AUTO_RESIZE_OFF);
        txtTabelaPesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
            
        
    }
public void preencherTabelaProduto(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Codigo", "Nome", "Descrição", "quantidade"};
        
        conexao.executaSQL(SQL);
        try {
            conexao.rs.first();
            do{
            dados.add(new Object[]{conexao.rs.getInt("cod_produto"), conexao.rs.getString("nome"), conexao.rs.getString("descricao"),conexao.rs.getString("quantidade")});
        }while(conexao.rs.next());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ArrayList!\nERRO: " + ex);
        }
        Tabela modelo = new Tabela(dados, Colunas);
        txtTabelaPesquisa.setModel(modelo);
        txtTabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(100);
        txtTabelaPesquisa.getColumnModel().getColumn(0).setResizable(false);
        txtTabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(200);
        txtTabelaPesquisa.getColumnModel().getColumn(1).setResizable(false);
        txtTabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(180);
        txtTabelaPesquisa.getColumnModel().getColumn(2).setResizable(false);
        txtTabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(80);
        txtTabelaPesquisa.getColumnModel().getColumn(3).setResizable(false);
        txtTabelaPesquisa.getTableHeader().setReorderingAllowed(false);
        txtTabelaPesquisa.setAutoResizeMode(txtTabelaPesquisa.AUTO_RESIZE_OFF);
        txtTabelaPesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
            
        
    }
public void preencherTabelaVenda(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Descrição", "Quantidade", "ValorTotal"};
        conexao.Conectar();
        conexao.executaSQL(SQL);
        try {
            conexao.rs.first();
            do{
                float valorProduto = conexao.rs.getFloat("valor_venda");
                int qtdVendida = conexao.rs.getInt("quantidade_produto");
                dados.add(new Object[]{conexao.rs.getString("nome"), conexao.rs.getString("quantidade_produto"), dc.format(valorProduto * qtdVendida)});
                
        }while(conexao.rs.next());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ArrayList!\nERRO: " + ex);
        }
        Tabela modelo = new Tabela(dados, Colunas);
        txtTabelaVenda.setModel(modelo);
        txtTabelaVenda.getColumnModel().getColumn(0).setPreferredWidth(200);
        txtTabelaVenda.getColumnModel().getColumn(0).setResizable(false);
        txtTabelaVenda.getColumnModel().getColumn(1).setPreferredWidth(200);
        txtTabelaVenda.getColumnModel().getColumn(1).setResizable(false);
        txtTabelaVenda.getColumnModel().getColumn(2).setPreferredWidth(160);
        txtTabelaVenda.getColumnModel().getColumn(2).setResizable(false);
        txtTabelaVenda.getTableHeader().setReorderingAllowed(false);
        txtTabelaVenda.setAutoResizeMode(txtTabelaVenda.AUTO_RESIZE_OFF);
        txtTabelaVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        SomaProduto();
            
        
    }
public void SomaProduto(){
    total = 0;
    int qtd = 0;
    float valor = 0;
    conexao.executaSQL("select * from compra inner join produto on compra.cod_produto = produto.cod_produto where cod_compra=" + codVenda);
        try {
            
            //conexao.rs.first();
            while(conexao.rs.next()){
                qtd = conexao.rs.getInt("quantidade");
                valor = conexao.rs.getFloat("valor_venda");
                total = total + conexao.rs.getFloat("valor_venda") * conexao.rs.getInt("quantidade_produto");
            }
            txtValorTotal.setText(String.valueOf(total));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar soma do total!\nERRO: " + ex);
        }
}
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
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btBuscaProduto;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btPesquisaNome;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> txtComboPagamento;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTable txtTabelaPesquisa;
    private javax.swing.JTable txtTabelaVenda;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorUnidade;
    // End of variables declaration//GEN-END:variables
}