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
public class Main {
    public static void main(String[] args) {
        EquipamentoSonoro eq = new EquipamentoSonoro();
        
        eq.Configuracoes();
        eq.aumentarVolume();//não funciona, pois está desligado ;)
        eq.liga();
        eq.Configuracoes();
        eq.liga();
        eq.aumentarVolume();
        eq.aumentarVolume();
        eq.Configuracoes();
        eq.mono();
        eq.diminuirVolume();
        eq.diminuirVolume();
        eq.diminuirVolume();
        eq.diminuirVolume();
        eq.Configuracoes();
        eq.desliga();
        
                
        
        
    }
    
}
