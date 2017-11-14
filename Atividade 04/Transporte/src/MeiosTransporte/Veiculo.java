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
public class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;

    public Veiculo(String marca, int qtdRodas, String modelo, int velocidade) {
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    
     public Veiculo(){
        this("Grandes Marcas",1,"Atual",0);
    }
     
     public void acelerar(int valor){
         velocidade += valor;
         System.out.println("Você acelerou. Agora está a "+velocidade+" km/h");
     }
     
    public void frear(int valor){
        if(velocidade<=0){
            System.out.println("Você já está parado.");
            velocidade=0;
        }else{         
            if(velocidade<=valor){             
                System.out.println("Freiada brusca. Tome cuidado");
                velocidade = 0;
            }
            else{
                velocidade -=valor;
                System.out.println("Você freiou. Agora está a "+velocidade+" km/h");
            }
        }
    }
    public void imprimirInformacoes() {
        System.out.println("Informações do Veículo:");
        System.out.println("Marca: "+marca+"\nQuantidade de Rodas: "+qtdRodas+"\nModelo: "+modelo+"\nVelocidade Atual: "+velocidade);
    }
     

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
