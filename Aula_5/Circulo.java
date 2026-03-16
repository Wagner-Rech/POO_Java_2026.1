public class Circulo{
    double raio;
    public Circulo(double r){
        this.raio = r;
    }
    public double calculaArea(){
        return this.raio * this.raio * 3.14;
    }
    public void imprimeArea(){
        System.out.println("Area: " + calculaArea());
    }
}