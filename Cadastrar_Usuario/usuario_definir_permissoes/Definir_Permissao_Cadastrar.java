/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario_definir_permissoes;

/**
 *
 * @author ana
 */
public class Definir_Permissao_Cadastrar extends javax.swing.JPanel {

    /**
     * Creates new form Definir_Permissao_Cadastrar
     */
    public Definir_Permissao_Cadastrar() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpPermitirAcesso = new javax.swing.JPanel();
        chbGrupo = new javax.swing.JCheckBox();
        chbFornecedor = new javax.swing.JCheckBox();
        chbCliente = new javax.swing.JCheckBox();
        chbTransportador = new javax.swing.JCheckBox();
        chbServico = new javax.swing.JCheckBox();
        chbCategoria = new javax.swing.JCheckBox();
        chbProduto = new javax.swing.JCheckBox();
        chbTiposDeDocumentos = new javax.swing.JCheckBox();
        chbFormaDePagamento = new javax.swing.JCheckBox();
        chbAlterarFormaDePagamento = new javax.swing.JCheckBox();
        chbOS = new javax.swing.JCheckBox();
        chbUsuario = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jpPermitirAcesso.setBackground(new java.awt.Color(255, 255, 255));
        jpPermitirAcesso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chbGrupo.setBackground(new java.awt.Color(255, 255, 255));
        chbGrupo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbGrupo.setText("GRUPO");
        chbGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbGrupoMousePressed(evt);
            }
        });

        chbFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        chbFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbFornecedor.setText("FORNECEDOR");
        chbFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbFornecedorMousePressed(evt);
            }
        });

        chbCliente.setBackground(new java.awt.Color(255, 255, 255));
        chbCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbCliente.setText("CLIENTE");
        chbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbClienteMousePressed(evt);
            }
        });

        chbTransportador.setBackground(new java.awt.Color(255, 255, 255));
        chbTransportador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbTransportador.setText("TRANSPORTADOR");
        chbTransportador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbTransportadorMousePressed(evt);
            }
        });

        chbServico.setBackground(new java.awt.Color(255, 255, 255));
        chbServico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbServico.setText("SERVIÇO");
        chbServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbServicoMousePressed(evt);
            }
        });

        chbCategoria.setBackground(new java.awt.Color(255, 255, 255));
        chbCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbCategoria.setText("CATEGORIA");
        chbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbCategoriaMousePressed(evt);
            }
        });

        chbProduto.setBackground(new java.awt.Color(255, 255, 255));
        chbProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbProduto.setText("PRODUTO");
        chbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbProdutoMousePressed(evt);
            }
        });

        chbTiposDeDocumentos.setBackground(new java.awt.Color(255, 255, 255));
        chbTiposDeDocumentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbTiposDeDocumentos.setText("TIPOS DE DOCUMENTOS");
        chbTiposDeDocumentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbTiposDeDocumentosMousePressed(evt);
            }
        });
        chbTiposDeDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbTiposDeDocumentosActionPerformed(evt);
            }
        });

        chbFormaDePagamento.setBackground(new java.awt.Color(255, 255, 255));
        chbFormaDePagamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbFormaDePagamento.setText("FORMA DE PAGAMENTO");
        chbFormaDePagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbFormaDePagamentoMousePressed(evt);
            }
        });

        chbAlterarFormaDePagamento.setBackground(new java.awt.Color(255, 255, 255));
        chbAlterarFormaDePagamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbAlterarFormaDePagamento.setText("ALTERAR FORMA DE PAGAMENTO");
        chbAlterarFormaDePagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbAlterarFormaDePagamentoMousePressed(evt);
            }
        });

        chbOS.setBackground(new java.awt.Color(255, 255, 255));
        chbOS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbOS.setText("ORDEM DE SERVIÇO");
        chbOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbOSMousePressed(evt);
            }
        });

        chbUsuario.setBackground(new java.awt.Color(255, 255, 255));
        chbUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbUsuario.setText("USUARIO");
        chbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbUsuarioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpPermitirAcessoLayout = new javax.swing.GroupLayout(jpPermitirAcesso);
        jpPermitirAcesso.setLayout(jpPermitirAcessoLayout);
        jpPermitirAcessoLayout.setHorizontalGroup(
            jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPermitirAcessoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbTransportador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbAlterarFormaDePagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbFormaDePagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbTiposDeDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpPermitirAcessoLayout.setVerticalGroup(
            jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPermitirAcessoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbCliente)
                    .addComponent(chbTiposDeDocumentos)
                    .addComponent(chbCategoria)
                    .addComponent(chbProduto))
                .addGap(18, 18, 18)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbServico)
                    .addComponent(chbFornecedor)
                    .addComponent(chbFormaDePagamento)
                    .addComponent(chbGrupo))
                .addGap(18, 18, 18)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbTransportador)
                    .addComponent(chbAlterarFormaDePagamento)
                    .addComponent(chbOS)
                    .addComponent(chbUsuario))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar", jpPermitirAcesso);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alterar", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Excluir", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chbGrupoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbGrupoMousePressed

    }//GEN-LAST:event_chbGrupoMousePressed

    private void chbFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbFornecedorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbFornecedorMousePressed

    private void chbClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbClienteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbClienteMousePressed

    private void chbTransportadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbTransportadorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbTransportadorMousePressed

    private void chbServicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbServicoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbServicoMousePressed

    private void chbCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbCategoriaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbCategoriaMousePressed

    private void chbProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbProdutoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbProdutoMousePressed

    private void chbTiposDeDocumentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbTiposDeDocumentosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbTiposDeDocumentosMousePressed

    private void chbTiposDeDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbTiposDeDocumentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbTiposDeDocumentosActionPerformed

    private void chbFormaDePagamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbFormaDePagamentoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbFormaDePagamentoMousePressed

    private void chbAlterarFormaDePagamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbAlterarFormaDePagamentoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbAlterarFormaDePagamentoMousePressed

    private void chbOSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbOSMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbOSMousePressed

    private void chbUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbUsuarioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox chbAlterarFormaDePagamento;
    public javax.swing.JCheckBox chbCategoria;
    public javax.swing.JCheckBox chbCliente;
    public javax.swing.JCheckBox chbFormaDePagamento;
    public javax.swing.JCheckBox chbFornecedor;
    public javax.swing.JCheckBox chbGrupo;
    public javax.swing.JCheckBox chbOS;
    public javax.swing.JCheckBox chbProduto;
    public javax.swing.JCheckBox chbServico;
    public javax.swing.JCheckBox chbTiposDeDocumentos;
    public javax.swing.JCheckBox chbTransportador;
    public javax.swing.JCheckBox chbUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpPermitirAcesso;
    // End of variables declaration//GEN-END:variables
}