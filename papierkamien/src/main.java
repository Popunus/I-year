import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int flag=1;
        int opcja2=0;
        int paper=0;
        int kamien=0;
        int nozyce=0;
        int remis=0;
        int wygrana=0;
        int przegrana=0;
        while(flag>0){
            System.out.println("wybierz 1 jezeli paper 2 kamien 3 nozyce");
            Scanner scan = new Scanner(System.in);
            int opcja = scan.nextInt();



                double komputer = Math.random();
                if (komputer < 0.33) {
                    opcja2 = 1;
                    System.out.println("papier");
                    paper++;
                } else if (komputer <= 0.66) {
                    opcja2 = 2;
                    System.out.println("kamien");
                    kamien++;
                } else {
                    opcja2 = 3;
                    System.out.println("nozyce");
                    nozyce++;
                }
                if (opcja == opcja2) {
                    System.out.println("remis");
                    flag++;
                    remis++;
                } else if ((opcja == 1 && opcja2 == 2) || (opcja == 2 && opcja2 == 3) || (opcja == 3 && opcja2 == 1)) {
                    System.out.println("wygrales");
                    wygrana++;
                }
                else {
                    System.out.println("przegrales!");
                    przegrana++;
                }
                flag--;

        }

    }

}
