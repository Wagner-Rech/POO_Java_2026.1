public class Jogador{
    String nome;
    String posição;
    int nascimento[] = new int[3];
    String nacionalidade;
    double altura;
    double peso;
    public Jogador(String nome1, String posição1, int dia1, int mes1, int ano1, String nacionalidade1, double altura1,double peso1){
    	this.nome = new String(nome1);
	this.posição = new String(posição1);
	this.nascimento[0] = dia1;
	this.nascimento[1] = mes1;
	this.nascimento[2] = ano1;
	this.nacionalidade = new String(nacionalidade1);
	this.altura = altura1;
	this.peso = peso1;
    }
    public int[] calculaIdade(int dia,int mes,int ano){
	int idade[] = new int[3];
	idade[0] = dia - nascimento[0];
	idade[1] = mes - nascimento[1];
	idade[2] = ano - nascimento[2];
	if(mes == nascimento[1]){
		if(dia < nascimento[2]){
			idade[2]-=1;
			idade[0]+=30;
		}
	}
	else if(mes > nascimento[1]){
		if(dia < nascimento[2]) idade[2]*=-1;
	}
	else {
		idade[2]-=1;
		idade[1]+=12;
	}
	return idade;
    }
    public void calculaAposentadoria(int dia, int mes, int ano){
	    	int idade[] = calculaIdade(dia,mes,ano);
		int aposentar;
		if(posição == "defesa") aposentar = 40;
		else if (posição == "meio-campo") aposentar = 38;
		else aposentar = 35;
		if(idade[2] >= aposentar) System.out.println("O jogador já pode se aposentar");
		else if(aposentar - idade[0] == 1){
			int dias,meses;
			meses = 12 - idade[1];
			if(idade[2] > 0){
				dias = 30 - idade[2];
				meses-=1;
			}
			else dias = 0;
			System.out.println("Faltam " + dias + " dias e " + meses + " meses para ele se aposentar");
		}
		else System.out.println("Faltam " + (aposentar - idade[2]) + " anos para ele se aposentar");
    }
}
