package concessionaria;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a concessionaria Java!");

        Veiculo carro = new Veiculo();
        carro.modelo = "Civic";
        carro.marca = "Honda";
        carro.ano = 2020;
        carro.preco = 80000.0;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Preço: R$ " + carro.preco);
    
    }

}
