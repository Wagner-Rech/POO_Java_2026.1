public class Data{
	int dia,mes,ano;
	public Data(){
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}
	public Data(int dia1, int mes1, int ano1){
		this.dia = dia1;
		this.mes = mes1;
		this.ano = ano1;
	}
	public Data(Data data){
		this.dia = data.dia;
		this.mes = data.mes;
		this.ano = data.ano;
	}
	public String passarData(){
		String st = this.dia + "/" + this.mes + "/" + this.ano; 
		return st;
	}
}
