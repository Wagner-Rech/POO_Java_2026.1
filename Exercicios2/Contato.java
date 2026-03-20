public Contato{
	boolean whats;
	boolean telegram;
	String numero;
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
		String answer = new String;
		if(whats == 1){
			if(telegram == 1){
				answer = "Whatsapp e Telegram";
			}
			else{
				answer = "Whatsapp";
			}
		}
		else if(telegram == 1) answer = "Telegram";
		else answer = "Nenhuma";
		return answer;
	}
	public String listar(){
		System.out.println(numero + " | " + redes());
	}
}

