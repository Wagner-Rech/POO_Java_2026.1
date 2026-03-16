import java.util.Scanner;

public class ExemploVariaveis{
    public static void main(String[] args){
        String msg = "Esse print dirá a soma dos números escritos na hora de executar: ";
        int num = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(msg + num);
        System.out.print("Escreva seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Escreva dois números para a comparação: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(name + ", " + n1 + " <= " + n2 + "-1 :" + (n1 <= --n2));
        if(n1 <= n2){
            System.out.println("Correto, parabéns");
        }
        else{
            System.out.println("Infelizmente não. n2: " + n2);
        }
        System.out.print("Agora, escolha um número para o fatorial: ");
        int fatorial = scanner.nextInt();
        int resultado = 1;
        for(int i = 2; i <= fatorial; i++){
            resultado *= i;
        }
        System.out.println("O resultado do fatorial de " + fatorial + " é: " + resultado);
        System.out.println("Agora, forneça números para somar, digitando 0 quando quiser o resultado");
        int input = scanner.nextInt();
        resultado = 0;
        while(input != 0){
            resultado += input;
            input = scanner.nextInt();
        }
        System.out.println("O resultado das somas foi: " + resultado);

        sc.close();
    }
}