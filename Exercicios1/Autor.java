import java.util.Scanner;
class Autor {
    String nome;
    int id;

    public void carregaDoTeclado(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        this.nome = nome;
        System.out.print("Digite o id: ");
        int id = sc.nextInt();
        this.id = id;
    }
}