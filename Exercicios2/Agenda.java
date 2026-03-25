public class Agenda{
	Pessoa ps[] = new Pessoa[15];
	int numPessoas = 0;
	public void cadastraPessoa(Pessoa pessoa){
		if(numPessoas < 15){
			ps[numPessoas] = new Pessoa(pessoa);
			numPessoas++;
		}
		else{
			System.out.println("Erro, Agenda já está cheia");
		}
	}
	public void listar(){
		for(int i = 0; i < numPessoas; i++){
			ps[i].listarDados();
		}
	}
	public void listarPessoa(int i){
		ps[i].listarDados();
	}
	public int buscaPessoa(String nome){
		for (int i = 0; i < numPessoas; i++){
			if (ps[i].nome.equals(nome)){
				return i;
			}
		}
		System.out.println("Erro, pessoa escolhida não foi encontrada");
		return -1;
	}
	public void deletaPessoa(String nome){
		if(numPessoas == 0) System.out.println("Erro, Agenda vazia, operação inválida");
		int busca = buscaPessoa(nome);
		if(busca > -1){
			ps[busca] = ps[numPessoas-1];
			ps[numPessoas-1] = new Pessoa();
			numPessoas-=1;
			return;

		}
		System.out.println("Erro, pessoa escolhida não foi encontrada");
	}
	public void novoContato(String nome, Contato contatos[], int size){
		int altera = buscaPessoa(nome);
		ps[altera].cadastraContato(contatos,size);	
	}
	public void retiraContato(String nome, int ordem){
		int altera = buscaPessoa(nome);
		ps[altera].deletaContatos(ordem);
	}
}
