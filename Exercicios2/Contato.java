public class Contato{
	boolean whats;
	boolean telegram;
	String numero;
	public Contato(){
		this.whats = false;
		this.telegram = false;
		this.numero = new String();
	}
	public Contato(String num, boolean wht, boolean tele){
		this.numero = new String(num);
		this.whats = wht;
		this.telegram = tele;
	}
	public Contato(Contato cont){
		this.numero = new String(cont.numero);
		this.whats = cont.whats;
		this.telegram = cont.telegram;
	}
	public String redes(){
		String answer = new String();
		if(whats == true){
			if(telegram == true){
				answer = "Whatsapp e Telegram";
			}
			else{
				answer = "Whatsapp";
			}
		}
		else if(telegram == true) answer = "Telegram";
		else answer = "Nenhuma";
		return answer;
	}
	public void listar(){
		System.out.println(numero + " | " + redes());
	}
}

