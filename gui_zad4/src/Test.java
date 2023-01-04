abstract class Spiewak {
    static int numer_startowy=1;

    int numer_zmienny;

    String nazwisko;

    Spiewak(String nazwisko){
        this.nazwisko=nazwisko;
        numer_zmienny=numer_startowy++;
    }

    public String toString(){
        return " ("+numer_zmienny+") "+nazwisko+": "+spiewaj();
    }

    public static Spiewak najglosniej(Spiewak [] spiewacy){
        Spiewak naj=spiewacy[0];
        int max=0;
        int temp=0;
        for(Spiewak z: spiewacy){
            String zmienna=z.spiewaj();
            for(int i=0;i<zmienna.length();i++){
                for(int j=1;j<zmienna.length();j++){
                    //sprawdza czy to nie jest litera
                    if(!((zmienna.charAt(i)>=65 && zmienna.charAt(i) <=90) || (zmienna.charAt(i)>=97 && zmienna.charAt(i) <=122)))
                        break;
                    //sprawdza czy nie sa takie same
                    if(zmienna.charAt(i)==zmienna.charAt(j))
                        break;
                    //sprawdza czy to nie jest duza litera
                    if((zmienna.charAt(i)>=65 && zmienna.charAt(i) <=90) && (zmienna.charAt(i)+32==zmienna.charAt(j)))
                        break;
                    if(j==zmienna.length()-1)
                        temp++;

                }
            }
            if(temp>max){
                max=temp;
                naj=z;
            }
            temp=0;
        }
        return naj;
    }

    abstract String spiewaj();


}
public class Test{

        public static void main(String[] args)
        {
            Spiewak s1 = new Spiewak("Dietrich"){
                @Override
                protected String spiewaj() {
                    return "oooooooooooo";
                }
            };

            Spiewak s2 = new Spiewak("Piaf"){
                @Override
                protected String spiewaj() {
                    return "a4iBBiii";
                }
            };

            Spiewak s3 = new Spiewak("Adele"){
                @Override
                protected String spiewaj() {
                    return "aAa";
                }
            };

            Spiewak sp[] = {s1, s2, s3};

            for (Spiewak s : sp)
                System.out.println(s);

            System.out.println("\n" + Spiewak.najglosniej(sp));
        }
    }


