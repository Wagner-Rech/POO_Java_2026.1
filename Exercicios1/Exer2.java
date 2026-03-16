import java.util.Scanner;
public class Exer2{
    public static void main(String args[]){
        Autor aut = new Autor();
        aut.carregaDoTeclado();
        System.out.println("Nome: " + aut.nome + "\nId: " + aut.id);
    }
}