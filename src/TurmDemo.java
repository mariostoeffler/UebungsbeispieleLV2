import java.util.Scanner;

public class TurmDemo {


    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Gib einen Integer-Wert ein: ");
        int input2 = scanner1.nextInt();
        int ergebnis = getTurmRechnung(input2);

        System.out.println("Endergebnis = " + ergebnis);
    }


    public static int getTurmRechnung(int input) {
        for (int i = 2; i < 10; i++) {
            System.out.print(input + " * " + i + " = ");
            input = input * i;
            System.out.println(input);

        }
        for (int i = 2; i < 10; i++) {
            System.out.print(input + " / " + i + " = ");
            input = input / i;
            System.out.println(input);
        }
        return input;
    }


}
