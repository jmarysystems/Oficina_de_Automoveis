/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipo_de_documento_Estado_dos_TFs_CBs;

import home.Home;
import tipo_de_documento.Tipos_de_Documento_Home;

/**
 *
 * @author ana
 */
public class Tipo_de_Documentos_TFs_CBs_Inicio {
    
    Home Home;
    Tipos_de_Documento_Home Tipos_de_Documento_Home;
    
    public Tipo_de_Documentos_TFs_CBs_Inicio( Home Home2, Tipos_de_Documento_Home Tipos_de_Documento_Home2 ) {
        
        Home = Home2;
        Tipos_de_Documento_Home = Tipos_de_Documento_Home2;
        
        inicio();  
    }
            
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        tfs_CBs( true );
                        
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void tfs_CBs( boolean b ){
        try { 
                    
            Tipos_de_Documento_Home.Tipos_de_Documento.tfNome         .setEnabled( !b  );
            Tipos_de_Documento_Home.Tipos_de_Documento.cbTipoDeCusto  .setEnabled( !b );
            Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto   .setEnabled( !b  );

        }catch(Exception e) { }
    }
            
}
