/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import definicao_forma_pgto_parcelas.Topo_Preenchimento_da_Lista;
import home.Home;

/**
 *
 * @author ana
 */
public class OS_Definir_Forma_de_Pagamento_Home extends javax.swing.JPanel {
        
    /**
     * Creates new form OS_Definir_Forma_de_Pagamento_Home
     * @param Home2
     * @param OS2
     * @param Total
     * @param Bean_Conta
     * @param Bean_Documento
     * @param Bean_Forma_Pgto
     */
    public OS_Definir_Forma_de_Pagamento_Home( 
            Home Home2, OS OS2, float Total, Bean_OS_Contas_Disponiveis Bean_Conta,
            Bean_OS_TipoDeDocumento Bean_Documento, Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto ) {
        
        initComponents();
                
        OS_Definir_Forma_de_Pagamento_Home_Inicio OS_Definir_Forma_de_Pagamento_Home_Inicio = new OS_Definir_Forma_de_Pagamento_Home_Inicio( 
                Home2, OS2, this, Total, Bean_Conta, Bean_Documento, Bean_Forma_Pgto );    
        
        OS_Definir_Forma_de_Pagamento_Home_Inicio.inicio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
