import java.util.Scanner;
public class Exer4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String dados_s[] = new String[3];
		int data[] = new int[3];
		double dados_d[] = new double[2];
		Jogador jog[] = new Jogador[2];
		for(int i = 0; i < 2; i++){
			System.out.println("Digite o nome e posição do jogador " + i + ":");
			dados_s[0] = sc.next();
			dados_s[1] = sc.next();
			System.out.println("Digite o dia, mes e ano de nascimento do jogador " + i + ":");
			for(int j = 0; j < 3; j++){
				data[j] = sc.nextInt();
			}
			System.out.println("Digite a nacionalidade do jogador " + i + ":");
			dados_s[2] = sc.next();
			System.out.println("Digite a altura e o peso do jogador " + i + ":");
			dados_d[0] = sc.nextDouble();
			dados_d[1] = sc.nextDouble();
			jog[i] = new Jogador(dados_s[0],dados_s[1],data[0],data[1],data[2],dados_s[2],dados_d[0],dados_d[1]);
		}
		System.out.println("Digite o dia, mes e ano atual");
		for(int i = 0; i<3; i++) data[i] = sc.nextInt();
		System.out.println("O jogador " + jog[0].nome + " tem " + jog[0].calculaIdade(data[0],data[1],data[2])[2] + " anos de idade.");
		jog[0].calculaAposentadoria(data[0],data[1],data[2]);
		System.out.println("O jogador " + jog[1].nome + " tem " + jog[1].calculaIdade(data[0],data[1],data[2])[2] + " anos de idade.");
		jog[1].calculaAposentadoria(data[0],data[1],data[2]);
	}
}
