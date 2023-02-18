public class Operator1 {
    public static void main(String[] args) {
        int a = 17;
        int b = 4;
        int c = a + b; //=21
        System.out.println(c);
        c = a - b;     //=13
        System.out.println(c);
        c = a * b;     //=68
        System.out.println(c);
        c = a / b;     //=4 ponieważ 4*4=16 i zostaje reszty 1
        System.out.println(c);
        c = a % b;     //=1 reszta z dzielenia
        System.out.println(c);

        c=c+1;


        c++;

        c=c-1;

        c--;
    }
}
