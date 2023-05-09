import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a placa do veículo: ");
        String placa = input.nextLine();

        System.out.print("Digite o valor do litro do combustível: ");
        double valorLitro = input.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 60 KM/H: ");
        double km60 = input.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 80 KM/H: ");
        double km80 = input.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 100 KM/H: ");
        double km100 = input.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 120 KM/H: ");
        double km120 = input.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 140 KM/H: ");
        double km140 = input.nextDouble();

        double consumo60 = km60 / 30.7;
        double consumo80 = km80 / 26.8;
        double consumo100 = km100 / 22.4;
        double consumo120 = km120 / 18.1;
        double consumo140 = km140 / 14.5;

        double totalCombustivel = consumo60 + consumo80 + consumo100 + consumo120 + consumo140;

        double distanciaTotal = km60 + km80 + km100 + km120 + km140;

        double velocidadeMediaPonderada = (km60 * 60 + km80 * 80 + km100 * 100
                + km120 * 120 + km140 * 140) / distanciaTotal;

        double custoTotal = totalCombustivel * valorLitro;

        System.out.println("Placa do veículo: " + placa);

        System.out.printf("Consumo total: %.2f litros%n", totalCombustivel);

        System.out.printf("Valor total: R$%,.2f%n", custoTotal);

        System.out.printf("Velocidade média ponderada: %.4f km/h%n", velocidadeMediaPonderada);

        input.close();
    }

}
