import java.util.ArrayList;
import java.util.List;

public class Main {

    static <T> List<T> asList(T[] a){

        List<T> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++)
            list.add(a[i]);

        return list;

    }

    public static void main(String[] args) {
        Integer[] a = {3, 5, 3, 2, 0, 4, -9};
        List<Integer> list = asList(a);

        for(int n : list)
            System.out.print(n + " ");

        System.out.println();

        String[] s = {"Lorem", "ispudm", "dfsd", "df"};

        List<String> list1 = asList(s);

        for(String n : list1)
            System.out.print(n + " ");


        AnyData<Integer> integers = new AnyData<>(a);
        System.out.println(integers);
        AnyData<String> strings = new AnyData<>(s);
        System.out.println(strings);

        System.out.println(integers.get(0));
        System.out.println(strings.get(2));


    }

}
