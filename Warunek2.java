import java.util.Scanner;

public class Warunek2 {
    public static void main(String[] args) {

        Scanner odczytGodziny = new Scanner(System.in);
        System.out.println("Podaj godzinę");
        int time = odczytGodziny.nextInt();
        System.out.println(time);
        if (time < 18) {
            System.out.println("Dzień Dobry.");
        } else if (time>=18 && time<23){
            System.out.println("Dobry wieczór");

        } else {
            System.out.println("Dobranoc");
        }

    }
}
