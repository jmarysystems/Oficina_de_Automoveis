/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_incluir;

import home.Home;
import usuario.Usuario;

/**
 *
 * @author ana
 */
public class Incluir_Usuario {
    
    public Incluir_Usuario( Home Home2 ) {
        
        Home = Home2;
        
        incluir_Tipo_de_Usuario();
    }
    
    Home Home;
    
    boolean um = false;
    private void incluir_Tipo_de_Usuario(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        Home.ControleTabs.AddTabsAoHome( "Usuário do Sistema", "livroTp.gif", new Usuario( Home ) );
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
 
    
}
