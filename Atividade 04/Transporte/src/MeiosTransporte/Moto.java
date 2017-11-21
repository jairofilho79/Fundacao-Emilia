/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeiosTransporte;

/**
 *
 * @author Jairo
 */
public class Moto extends Automovel{
    private boolean partidaEletrica;

    public Moto(boolean partidaEletrica) {
        super();
        this.partidaEletrica = partidaEletrica;
    }
    
    public Moto(){
         this(false);
    }
    
    @Override
    public void imprimirInformacoes() {
        System.out.println("Informações da Moto:");
        System.out.println("Marca: "+super.getMarca()+"\nQuantidade de Rodas: "+super.getQtdRodas()+"\nModelo: "+super.getModelo()+"\nVelocidade Atual: "+super.getVelocidade()+" km/h\nPotência do Motor: "+super.getPotenciaDoMotor()+" cilindradas"+"\nTipo de Partida: "+partida());
    }
    public String partida(){
        if(partidaEletrica==true)
            return "Elétrica";
        return "Manual";            
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    
}
