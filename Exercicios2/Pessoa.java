public class Pessoa{
	String nome;
	Data data_nascimento;
	Contato contatos[] = new Contato[4];
	int count;
	public Pessoa(){
		this.nome = new String();
		this.data_nascimento = new Data();
		this.contatos = new Contato[4];
	}
	public Pessoa(String name, Data data, Contato cont[], int size){
		this.nome = new String(name);
		this.data_nascimento = new Data(data);
		this.contatos = new Contato[4];
		if(size > 4){
			size = 4;
			System.out.println("Erro, contatos demais configurados. Apenas os quatro primeiros foram configurados");
		}
		for(int i = 0; i < size; i++){
			this.contatos[i] = cont[i];
		}
		this.count = size;
	}
	public Pessoa(String name, Data data, Contato cont){
		this.contatos = new Contato[4];
		this.nome = new String(name);
		this.data_nascimento = new Data(data);
		this.contatos[0] = new Contato(cont);
		count = 1;
	}
	public Pessoa(Pessoa pessoa){
		this.contatos = new Contato[4];
		this.nome = new String(pessoa.nome);
		this.data_nascimento = new Data(pessoa.data_nascimento);
		this.count = pessoa.count;
		for(int i = 0; i < pessoa.count; i++){
			contatos[i] = new Contato(pessoa.contatos[i]);
		}
	}
	public void cadastraContato(Contato cont[], int size){
		for(int i = 0; i + this.count < 4 && i < size; i++){
			contatos[i + this.count] = cont[i];
		}
		if(this.count >= 4){
			System.out.println("Erro, já existem 4 contatos, delete um antes de prosseguir");
		}
		else if(size + this.count > 4){
			if(size > 4) System.out.println("Erro, tentativa de cadastrar mais de 4 contatos");
			int registrados = 4 - this.count;
			System.out.println("Erro, foi possivel registrar apenas os primeiros " + registrados + " contatos");
			this.count = 4;
		}
		else this.count+= size;
	}
	public void cadastraContato(Contato cont){
		if(this.count >= 4){
			System.out.println("Erro, já existem 4 contatos, delete um antes de prosseguir");
		}
		else{
			contatos[this.count + 1] = new Contato(cont);
			this.count++;
		}
	}
	public void listarContatos(){
		for(int i = 0; i < count; i++){
			contatos[i].listar();
		}
	}
	public void deletaContatos(int ordem){
		if(ordem > this.count) System.out.println("Erro, esse contato não está preenchido");
		else if(ordem < this.count){
			contatos[ordem-1] = contatos[this.count-1];
			contatos[this.count-1] = new Contato();
			this.count-=1;
		}
		else{
			if(ordem == 1){
				System.out.println("Erro, uma pessoa deve ter no minimo um contato. Adicione um segundo contato antes de prosseguir");
				return;
			}
			contatos[ordem-1] = new Contato();
			this.count-=1;
		}
	}
	public void listarPessoa(){
		System.out.println(this.nome + " | " + data_nascimento.passarData());
	}
	public void listarDados(){
		listarPessoa();
		listarContatos();
	}
}
