public class NotenDemo {

    public static void main(String[] args) {
        getNotentext(87);
    }


    public static void getNotentext(int punkte) {


        if (punkte <= 50) {
            System.out.println("Nicht genügend! " + punkte);
        } else if (punkte > 50 && punkte <= 64) {
            System.out.println("Genügend " + punkte);
        } else if (punkte > 64 && punkte <= 77) {
            System.out.println("Befriedigend " + punkte);
        } else if (punkte > 77 && punkte <= 89) {
            System.out.println("Gut! " + punkte);
        } else if (punkte >= 90) {
            System.out.println("Sehr gut!! " + punkte);
        }

    }
}
