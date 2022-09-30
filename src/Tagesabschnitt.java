public class Tagesabschnitt {

    public static void main(String[] args) {

        byte uhrzeit = 1;
        String abschnitt;

       abschnitt = getDayTimeName((byte) uhrzeit);
        System.out.println("abschnitt = " + abschnitt);
    }


    public static String getDayTimeName(byte time) {
        String abschnitt = "";
        if (time == 6 || time == 7 || time == 8) {
            abschnitt = "früh";
        } else if (time == 9 || time == 10 || time == 11) {
            abschnitt = "vormittag";
        } else if (time == 12 || time == 13 || time == 14 || time == 15 || time == 16) {
            abschnitt = "mittag";
        } else if (time == 17 || time == 18 || time == 19) {
            abschnitt = "abend";
        } else {
            abschnitt = "nacht";
        }
        return abschnitt;
    }
}


