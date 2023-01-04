import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Spiewak> nazwalist = new ArrayList<Spiewak>();
        Spiewak s1 = new Spiewak("Darrey"){
            @Override
            public String spiewaj() {
                return "eeae";
            }


        };

        Spiewak s2 = new Spiewak("Darrey"){
            @Override
            public String spiewaj() {
                return "bebe";
            }


        };

        Spiewak s3 = new Spiewak("Houston"){
            @Override
            public String spiewaj() {
                return "a4iBBiii";
            }


        };
        Spiewak s4 = new Spiewak("Carrey"){
            @Override
            public String spiewaj() {
                return "oaooooooooooo";
            }


        };
        Spiewak s5 = new Spiewak("Madonna"){
            @Override
            public String spiewaj() {
                return "aAa";
            }


        };
        nazwalist.add(s1);
        nazwalist.add(s2);
        nazwalist.add(s3);
        nazwalist.add(s4);
        nazwalist.add(s5);
        System.out.println("przed sortowaniem:");
        for(Spiewak a:nazwalist){
            System.out.println(a);
        }
        Collections.sort(nazwalist);
        System.out.println("po sortowaniu:");
        for(Spiewak a:nazwalist){
            System.out.println(a);
        }

    }
}
