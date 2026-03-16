import java.util.Scanner;
public class Exer1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Autor aut = new Autor();
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        aut.nome = nome;
        System.out.print("Digite o id: ");
        int id = sc.nextInt();
        aut.id = id;
        System.out.println("Nome: " + aut.nome + "\nId: " + aut.id);
    }
}