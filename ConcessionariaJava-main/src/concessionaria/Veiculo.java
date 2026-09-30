package concessionaria;

public class Veiculo {
    String modelo;
    String marca;
    int ano;
    double preco;

    public Veiculo(String modelo, String marca, int ano, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public void cadastar(String modelo, String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano
        this.preco = preco;
    }

    public void exibirDados() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Marca: " + marca);
    System.out.println("Ano: " + ano);
    System.out.println("Preço: R$ " + preco);
    }
    
    public double calcularDesconto (){
        return preco * 0,10;
    }

    public double calcularPrecoFinal (){

        return preco - desconto;
    }
}   



