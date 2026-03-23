public class Agenda{
	Pessoa ps[] = new Pessoa[15];
	int numPessoas = 0;

	public void cadastraPessoa(Pessoa pessoa){
		if(numPessoas < 15){
			ps[numPessoas] = new Pessoa(pessoa);	
		}
		else{
			System.out.println("Erro, Agenda já está cheia");
		}
	}
	public void listaPessoas(){
		for(int i = 0; i < numPessoas; i++){
			ps[i].listarDados();
		}
	}
	public Pessoa buscaPessoa(String nome){
		for (int i = 0; i < numPessoas; i++){
			if (ps[i].nome == nome){
				ps[i].listarDados();
				return ps[i];
			}
		}
		System.out.println("Erro, pessoa escolhida não foi encontrada");
	}
	public void deletaPessoa(String nome){
		if(numPessoas == 0) System.out.println("Erro, Agenda vazia, operação inválida");
		for(int i = 0; i < numPessoas; i++){
			if(ps[i].nome == nome){
				ps[i] = ps[numPessoas-1];
				ps[numPessoas-1] = new Pessoa();
				numPessoas-=1;
				return;
			}
		}
		System.out.println("Erro, pessoa escolhida não foi encontrada");
	}
	public void novoContato(String nome, Contato contatos[]){
		Pessoa altera = buscaPessoa(nome);
		altera.cadastraContato(contatos);	
	}
	public void retiraContato(String nome, int ordem){
		Pessoa altera = buscaPessoa(nome);
		altera.deletaContatos(ordem);
	}
}
