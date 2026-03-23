public class Data{
	int dia,mes,ano;
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
	}
}
