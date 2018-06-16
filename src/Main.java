import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<String> alisonTora = new ArrayList();

        alisonTora.add("Alison");
        alisonTora.add("cep:86750-000");
        alisonTora.add("Av. Brasil");
        alisonTora.add("centro");
        alisonTora.add("Iguarasitio");
        alisonTora.add("Paraná");
        alisonTora.add("3248-1151");

        alisonTora.set(0,"Alison Tadeu Veloza");
        alisonTora.remove(6);

        alisonTora.stream().forEach((item)->{
            System.out.println(item);
        });

    }
}

