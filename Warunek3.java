public class Warunek3 {
    public static void main(String[] args) {
        int time = 22;
        if (time < 12) {
            System.out.println("Przed południem");
        } else if (time == 12) {
            System.out.println("Południe.");

        } else if (time <= 18) {
            System.out.println("Po południu.");

        } else {
            System.out.println("Wieczór.");
        }

    }
}

