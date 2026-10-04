package concessionaria;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Veiculo carro = new Veiculo();
        Carro carro = new Carro();
        
        Carro Carro = new Carro(
           "Corolla",
           "Toyota",
            2020,
            80000.0,
          4
        );

        System.out.println("");

        System.out.println("CADASTRO DE VEÍCULO");

        System.out.print("Modelo: ");
        carro.setModelo(entrada.nextLine());

        System.out.print("Marca: ");
        carro.setMarca(entrada.nextLine());

        System.out.print("Ano: ");
        carro.setAno(entrada.nextInt());

        System.out.print("Preço: ");
        carro.setPreco(entrada.nextDouble());

        System.out.println("Quanto portas tem o carro?");
        carro.setPortas(entrada.nextInt());

        System.out.println();

        carro.exibirDados();
        System.out.println("Portas: " + carro.getPortas());
        entrada.close();
    }
}