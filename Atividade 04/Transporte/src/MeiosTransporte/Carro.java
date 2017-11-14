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
public class Carro extends Automovel{
    private int qtdPortas;

    public Carro(int qtdPortas, double potenciaDoMotor, String marca, int qtdRodas, String modelo, int velocidade) {
        super(potenciaDoMotor, marca, qtdRodas, modelo, velocidade);
        this.qtdPortas = qtdPortas;
    }
    
    public Carro(){
         this(2,70,"Grandes Marcas",4,"Atual",0);
    }
    @Override
    public void imprimirInformacoes() {
        System.out.println("Informações do Carro:");
        System.out.println("Marca: "+super.getMarca()+"\nQuantidade de Rodas: "+super.getQtdRodas()+"\nModelo: "+super.getModelo()+"\nVelocidade Atual: "+super.getVelocidade()+" km/h\nPotência do Motor: "+super.getPotenciaDoMotor()+" cavalos"+"\nQuantidade de Portas: "+qtdPortas);
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
}
