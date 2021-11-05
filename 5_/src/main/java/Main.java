import java.util.Scanner;

public class Main {

    private static Scanner in;

    //13
    public static void recursive(){
        int a = in.nextInt();
        if(a == 0) return;
        System.out.println(a);
        int b = in.nextInt();
        if(b == 0) return;
        recursive();
    }

    //14
    public static void number(int a){
        if(a > 0) {
            number(a / 10);
            System.out.print(a % 10 + " ");
        }
    }

    //15
    public static void numberReverse(int a){
        if(a > 0) {
            System.out.print(a % 10 + " ");
            numberReverse(a / 10);
        }
    }

    //16
    public static void recursion(int max, int count) {
        int n = in.nextInt();
        if (n > 0)
            if (n > max)
                recursion(n, 1);
            else if (n == max)
                recursion(max, ++count);
            else
                recursion(max, count);
        else
            System.out.println(count);
    }

    public static void main(String[] args) {
        /*
        in = new Scanner(System.in);
        recursive();
         */
        //number(199);
        //numberReverse(199);

        in = new Scanner(System.in);
        recursion(0, 0);
    }
}
