/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Vistas.*;

/**
 *
 * @author Jefferson Palacios Torres
 */
public class IniciarAplicacion {
    public static void main(String args[]) {
        
        CargarConfiguracionSistema oLoadSystem = new CargarConfiguracionSistema();
        oLoadSystem.cargarParametros();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }
}
