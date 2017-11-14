/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equip;

/**
 *
 * @author Jairo
 */
public class Equipamento {
    protected boolean ligado;

    public String isLigado() {
        if(ligado==true)
            return "Ligado";
        return "Desligado";
    }
     
    public void liga(){
        ligado = true;
    }
    public void desliga(){
        ligado = false;
    }

}
