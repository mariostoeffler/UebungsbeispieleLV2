

public class WinterreifenpflichtDemo {

    public static void main(String[] args) {

        boolean sommerreifen = isWinterreifenPflicht(14, false);
        System.out.println("Winterreifen sind nicht erforderlich");


        boolean Winterreifen = isWinterreifenPflicht(3, false);
        System.out.println("Bitte Winterreifen verwenden");

        boolean Winterreifen2 = isWinterreifenPflicht(6, true);
        System.out.println("Bitte Winterreifen verwenden");

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        boolean Winterreifen;

        if (temperatur < 10 && rutschigeFahrbahn == true || temperatur < 4) {
            return Winterreifen = true;
        } else
            return Winterreifen = false;
    }
}
