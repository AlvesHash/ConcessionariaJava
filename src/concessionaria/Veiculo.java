package concessionaria;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public Veiculo(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1950) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. O ano deve ser maior que 1950.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
             this.preco = preco;
        } else {
            System.out.println("Preço inválido. O preço deve ser maior que zero.");
         }
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
    }

    
}