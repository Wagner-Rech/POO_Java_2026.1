public class NumerosFibbonacci{
    public static void main(String args[]){
        int ordem[] = new int[3];
        ordem[0] = 0;
        ordem[1] = 1;
        ordem[2] = 1;
        int quantia = Integer.parseInt(args[0]);
        if(quantia <= 3 && quantia > 0){
            for(int i = 1; i <= quantia; i++){
                System.out.println("O número " + i + " da sequência Fibbonaci é " + ordem[i - 1]);
            }
        }
        else if(quantia > 3){
            for(int i = 1; i <= 3; i++){
                System.out.println("O número " + i + " da sequência Fibbonaci é " + ordem[i - 1]);
            }
            for(int i = 4; i <= quantia; i++){
                ordem[0] = ordem[1];
                ordem[1] = ordem[2];
                ordem[2] = ordem[0] + ordem[1];
                System.out.println("O número " + i + " da sequência Fibbonaci é " + ordem[2]);
            }
        }
        else{
            System.out.println("Número inserido é 0 ou inválido");
        }
    }
}