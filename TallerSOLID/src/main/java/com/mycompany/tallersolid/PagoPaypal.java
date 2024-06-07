/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author CltControl
 */
public class PagoPaypal extends Pago {
    private boolean loggedIn;

    @Override
    public void realizarCobro() {
        if (!loggedIn) {
            connect();
        }
        // realizar pago
    }
    
    private void connect(){
        // connect
    }
    
    
}
