package concessionaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Bem-vindo a concessionaria Java!");
        System.out.println("-----------------------------------");

        System.out.print("Cadastro de Veiculo\n");
        System.out.println("");

        System.out.print("Digite o modelo do veiculo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a marca do veiculo: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o ano do veiculo: ");
        int ano = scanner.nextInt();

        System.out.print("Digite o preco do veiculo: ");
        double preco = scanner.nextDouble();

        System.out.println("");

        System.out.println("Veiculo cadastrado com sucesso!");
        System.out.println("-----------------------------------");

        Veiculo veiculo = new Veiculo(modelo, marca, ano, preco);
        
        //System.out.println("Modelo: " + veiculo.modelo);
        //System.out.println("Marca: " + veiculo.marca);
        //System.out.println("Ano: " + veiculo.ano);
        //System.out.println("Preco: " + veiculo.preco);

      

        veiculo.exibirDados ();
        scanner.close();

    }
}
