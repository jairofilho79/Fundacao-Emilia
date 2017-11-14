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
public class Automovel extends Veiculo{
    private double potenciaDoMotor;

    public Automovel(double potenciaDoMotor, String marca, int qtdRodas, String modelo, int velocidade) {
        super(marca, qtdRodas, modelo, velocidade);
        this.potenciaDoMotor = potenciaDoMotor;
    }
    public Automovel(){
         this(70,"Grandes Marcas",1,"Atual",0);
    }
    
    @Override
    public void imprimirInformacoes() {
        System.out.println("Informações do Automóvel:");
        System.out.println("Marca: "+super.getMarca()+"\nQuantidade de Rodas: "+super.getQtdRodas()+"\nModelo: "+super.getModelo()+"\nVelocidade Atual: "+super.getVelocidade()+" km/h\nPotência do Motor: "+potenciaDoMotor+" cavalos");
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    
    
}
