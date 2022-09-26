public class NotenDemo {

    public static void main(String[] args) {


        String verygood = getNotentext(91);
        System.out.println(verygood);

        String good = getNotentext(87);
        System.out.println(good);

        String satisfying = getNotentext(73);
        System.out.println(satisfying);

        String enough = getNotentext(62);
        System.out.println(enough);

        String notenough = getNotentext(0);
        System.out.println(notenough);
    }

    public static String getNotentext(int punkte) {
        String verygood = "Sehr gut1!";
        String good = "gut!";
        String satisfying = "Befriedigend!";
        String enough = "Genügend!";
        String notenough = "Nicht Genügend!";

        if (punkte <= 50) {
        } else if (punkte > 50 && punkte <= 64) {
            return enough;
        } else if (punkte > 64 && punkte <= 77) {
            return satisfying;
        } else if (punkte > 77 && punkte <= 89) {
            return good;
        } else if (punkte >= 90) {
            return verygood;
        }
        return notenough;
    }
}
