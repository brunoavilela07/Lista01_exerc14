import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // João precisa que você faça um programa que leia a variável peso (peso de
        // peixes
        double peso;
        double multa;
        double excesso;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o peso do peixe: ");
        peso = input.nextDouble();
        // quantidade de quilos além do limite e na variável multa o valor da multa que
        // João deverá pagar
        if (peso <= 50) {
            excesso = 0;
            multa = 0;
            System.out.println(
                    "João não passou do limite, então seu excesso é " + excesso + ", e sua multa é de R$" + multa);
        } else if (peso > 50) {

            excesso = peso - 50;
            multa = excesso * 4;

            System.out.println("O excesso de peso do peixe de joão é " + excesso
                    + ", e a multa que ele devera pagar é de " + multa + "R$");

        }
    }
}

