import java.io.*;  // Import the File class
import java.util.Arrays;

public class S23184_p03 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("dane_razem.txt");
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kubal\\IdeaProjects\\s23184_p03\\src\\dane01.txt"));
            BufferedReader ba = new BufferedReader(new FileReader("C:\\Users\\kubal\\IdeaProjects\\s23184_p03\\src\\dane02.txt"));
            String line = br.readLine();
            String line2 = ba.readLine();
            while (line != null && line2 != null) {
                pw.println(line + line2);
                line = br.readLine();
                line2 = ba.readLine();
            }

            br.close();
            pw.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        String tab[] = new String[3];
        BufferedReader reader2;
        try {
            reader2 = new BufferedReader(new FileReader("C:\\Users\\kubal\\IdeaProjects\\s23184_p03\\dane_razem.txt"));
            String line = reader2.readLine();
            for (int i = 0; line != null; i++) {
                tab[i] = line;
                line = reader2.readLine();

            }
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            String tab2[];
            String tab3[];
            String tab4[];
            String tab5[];
            String tab6[];
            String tab7[];
        tab2= tab[0].split(" ");
        tab3= tab[1].split(" ");
        tab4= tab[2].split(" ");
        tab5=tab2[1].split("(?=\\p{Upper})");
        tab6=tab3[1].split("(?=\\p{Upper})");
        tab7=tab4[1].split("(?=\\p{Upper})");

        String pierwszy[]= {tab2[0],tab2[2],tab5[0],tab5[1]};
        String drugi[]={tab3[0],tab3[2],tab6[0],tab6[1]};
        String trzeci[]={tab4[0],tab4[2],tab7[0],tab7[1]};

        Student student1 = new Student(tab2[0],Integer.parseInt(tab2[2]),tab5[0],tab5[1]);
        Student student2 = new Student(tab3[0],Integer.parseInt(tab3[2]),tab6[0],tab6[1]);
        Student student3 = new Student(tab4[0],Integer.parseInt(tab4[2]),tab7[0],tab7[1]);

        student1.sortSka(tab2[0],tab3[0],tab4[0]);
        student1.sortName(tab5[0],tab6[0],tab7[0]);



        }

    }
class Osoba extends S23184_p03 {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(int rokUrodzenia, String imie, String nazwisko) {
        imie = this.imie;
        nazwisko = this.nazwisko;
        rokUrodzenia = this.rokUrodzenia;
    }

    public void sortName(String w, String e, String d) {

        String tab[] = {w, d, e};
        int size = tab.length;
        for (int a = 0; a < size - 1; a++) {
            for (int b = a + 1; b < tab.length; b++) {
                if (tab[a].compareTo(tab[b]) > 0) {
                    String temp = tab[a];
                    tab[a] = tab[b];
                    tab[b] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));

        try {
            FileWriter myWriter = new FileWriter("sortName.txt");
            myWriter.write(Arrays.toString(tab));
            myWriter.close();
        } catch (IOException u) {
            System.out.println("An error occurred.");
            u.printStackTrace();

        }
    }
}
class Student extends Osoba{
    private String numerIndeksu;

    public Student(String numerIndeksu, int rokUrodzenia, String imie,String nazwisko) {
        super(rokUrodzenia, imie, nazwisko);
        numerIndeksu=this.numerIndeksu;

    }
    public void sortSka(String x,String  z,String  q){
        String tab[]={x,z,q};
        int size= tab.length;
        for(int a = 0; a < size - 1; a++)
        {
            for(int b = a + 1; b < tab.length; b++)
            {
                if(tab[a].compareTo(tab[b]) > 0)
                {
                    String temp = tab[a];
                    tab[a] = tab[b];
                    tab[b] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
        try {
            FileWriter myWriter = new FileWriter("sortSka.txt");
            myWriter.write(Arrays.toString(tab));
            myWriter.close();
        } catch (IOException u) {
            System.out.println("An error occurred.");
            u.printStackTrace();

        }

    }

}








