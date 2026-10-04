package concessionaria;

public class Carro extends Veiculo {

    private int portas;

    public Carro() {
    }

    public Carro(String modelo,
                 String marca,
                 int ano,
                 double preco,
                 int portas) {

        super(modelo, marca, ano, preco);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}