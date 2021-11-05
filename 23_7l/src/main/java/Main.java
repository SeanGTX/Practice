import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) list.add(i+1);

        for(int a : list) System.out.print(a + " ");
        System.out.println();

        list.remove(5);
        list.remove(8);

        for(int a : list) System.out.print(a + " ");
        System.out.println();

    }
}
