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
public class EquipamentoSonoro extends Equipamento {
    private int volume;
    private boolean stereo;

    public EquipamentoSonoro() {
        ligado = false;
        this.volume = 0;
        this.stereo = true;
    }
    @Override
    public void liga(){
        volume = 5;
        ligado = true;
    }
    @Override
    public void desliga(){
        volume = 0;
        ligado = false;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        if(ligado==true){
            if(this.volume<=10)
                this.volume += 1;
            else
                System.out.println("Volume máximo");
            }
    }
    public void diminuirVolume() {
        if(ligado==true){
            if(this.volume>=0)
                this.volume -= 1;
            else
                System.out.println("Volume mínimo");
        }
    }    
    public String getStereo() {
        if(stereo==true)
            return "Stereo";
        return "Mono";
    }
    
    public void mono(){
        if(ligado==true){
            stereo = false;
        }    
    }
    public void stereo(){
        if(ligado==true){
            stereo = true;
        }    
    }


    public void Configuracoes() {
        System.out.println("---------------------");
        System.out.println("Configurações atuais:\nStatus: "+this.isLigado()+"\nModo: "+this.getStereo()+"\nVolume: "+this.getVolume());
        System.out.println("---------------------");
    }
    
    
}
