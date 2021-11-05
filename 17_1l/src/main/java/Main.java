import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Series s = new Series(a);

        a = s.getGarmonicSeries();

        for(double num : a)
            System.out.println(num);

    }

}
