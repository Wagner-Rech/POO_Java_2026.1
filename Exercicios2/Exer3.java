import java.util.Scanner;

public class Exer3{
	public static void main(String args[]){
		Agenda agd = new Agenda();
		Scanner sc = new Scanner(System.in);
		Pessoa ps_temp;
		Data data_temp;
		Contato cs_temp[] = new Contato[4];
		int data[] = new int[3];
		boolean redes[] = new boolean[2];
		int contatos = 0;
		int ordem = 0;
		int num_temp = 0;
		String nome_temp = new String();
		String numero_temp = new String();
		String lixo_temp = new String();
		int quantia = 0;
		System.out.print("Quantas pessoas gostaria de cadastrar, de 1 a 15?: ");
		quantia = sc.nextInt();
		lixo_temp = sc.nextLine();
		if(quantia < 1) System.out.println("0 não é um número válido. Por favor, tente novamente");
		else if(quantia > 15){
			System.out.println("Quantia grande demais. Serão adicionadas apenas as primeiras 15 pessoas");
			quantia = 15;
		}
		for(int i = 1; i <= quantia; i++){
			System.out.print("Digite o nome da pessoa número " + i + ": ");
			nome_temp = sc.nextLine();
			System.out.print("Digite o dia, mês e ano de nascimento da pessoa, separado por espaço: ");
			data[0] = sc.nextInt();
			data[1] = sc.nextInt();
			data[2] = sc.nextInt();
			data_temp = new Data(data[0],data[1],data[2]);
			System.out.print("Quantos contatos essa pessoa tem?: ");
			contatos = sc.nextInt();
			if(contatos > 4){
				contatos = 4;
				System.out.println("Erro, contatos demais inseridos. Serão admitidos apenas os primeiros 4 escolhidos");
			}
			cs_temp = new Contato[contatos];
			for(int j = 0; j < contatos; j++){
				System.out.print("Esse contato tem Whatsapp e/ou Telegram? Digite 1 para sim, e 0 para não, um para cada rede, separado por espaço: ");
				num_temp = sc.nextInt();
				if(num_temp > 0) redes[0] = true;
			       	else redes[0] = false;
				num_temp = sc.nextInt();
				if(num_temp > 0) redes[1] = true;
			       	else redes[1] = false;
				System.out.print("Digite o número desse contato: ");
				lixo_temp = sc.nextLine();
				numero_temp = sc.nextLine();
				cs_temp[j] = new Contato(numero_temp,redes[0],redes[1]);
			}
			ps_temp = new Pessoa(nome_temp,data_temp,cs_temp,contatos);
			agd.cadastraPessoa(ps_temp);
		}
		int choose = 0;
		while(true){
			System.out.print("Gostaria de 1) lista as pessoas, 2) buscar uma pessoa, 3) cadastrar um novo contato em uma pessoa, 4) deletar um contato em uma pessoa, ou 0) sair?:");
			choose = sc.nextInt();
			lixo_temp = sc.nextLine();
			switch(choose){
				case 0:
					break;
				case 1:
					agd.listar();
					continue;
				case 2:
					System.out.print("Que pessoa gostaria de buscar?: ");
					nome_temp = sc.nextLine();
					int print = agd.buscaPessoa(nome_temp);
					if(print > -1) agd.listarPessoa(print);
					continue;
				case 3:
					System.out.print("Em que pessoa gostaria de cadastrar o novo contato?: ");
					nome_temp = sc.nextLine();
					System.out.print("Quantos contatos gostaria de cadastrar?: ");
					contatos = sc.nextInt();
					lixo_temp = sc.nextLine();
					if(contatos > 4){
						contatos = 4;
						System.out.println("Erro, contatos demais inseridos. Serão admitidos apenas os primeiros 4 escolhidos");
					}
					cs_temp = new Contato[contatos];
					for(int i = 0; i < contatos; i++){
						System.out.print("Esse contato tem Whatsapp e/ou Telegram? Digite 1 para sim, e 0 para não, um para cada rede, separado por espaço: ");
						num_temp = sc.nextInt();
						if(num_temp > 0) redes[0] = true;
						else redes[0] = false;
						num_temp = sc.nextInt();
						if(num_temp > 0) redes[1] = true;
						else redes[1] = false;
						System.out.print("Digite o número desse contato: ");
						lixo_temp = sc.nextLine();
						numero_temp = sc.nextLine();
						cs_temp[i] = new Contato(numero_temp,redes[0],redes[1]);
					}
					agd.novoContato(nome_temp,cs_temp,contatos);
					continue;
				case 4:
					System.out.print("De que pessoa deseja deletar o contato?: ");
					nome_temp = sc.nextLine();
					System.out.print("De que posição deseja deletar o contato?: ");
					ordem = sc.nextInt();
					lixo_temp = sc.nextLine();
					agd.retiraContato(nome_temp,ordem);
					continue;					
			}
			break;
		}

	}
}
