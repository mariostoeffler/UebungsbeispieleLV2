public class TurmDemo {

    public static void main(String[] args) {
        
        int ergebnis = getTurmRechnung(114);
        System.out.println("Endergebnis = " + ergebnis);
        
    }

    
    
    public static int getTurmRechnung (int input) {
        for (int i = 2; i < 10 ; i++) {
            System.out.print(input + " * " + i + " = ");
            input = input * i;
            System.out.println(input);

        }
        for (int i = 2; i < 10 ; i++) {
            System.out.print(input + " / " + i + " = ");
            input = input / i;
            System.out.println(input);
        }
        return input;
    }


}
