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
public class Bicicleta extends Veiculo{
    private int numMarchas;
    private boolean bagageiro;

    public Bicicleta(int numMarchas, boolean bagageiro) {
        super();
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }
    
    public Bicicleta(){
        this(1,false);
    }
    
    @Override
    public void imprimirInformacoes() {
        System.out.println("Informações da Bicicleta:");
        System.out.println("Marca: "+super.getMarca()+"\nQuantidade de Rodas: "+super.getQtdRodas()+"\nModelo: "+super.getModelo()+"\nVelocidade Atual: "+super.getVelocidade()+"km/h\nNúmero de marchas: "+numMarchas+"\nBagageiro: "+bagageiro());
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }
    public String bagageiro(){
        if(bagageiro==true)
            return "Incluso";
        return "Não Incluso";
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }
    
}
