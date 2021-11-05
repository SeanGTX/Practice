import java.util.Stack;

public class Main {

    public static void main(String[] args) {
       /* BoundedWaitList<Integer> list = new BoundedWaitList<>(10);

        for(int i = 0; i <= 10; i++)
                list.add(i);*/

        UnfairWaitList<Integer> list = new UnfairWaitList<>();

        for(int i = 0; i < 10; i++)
            list.add(i);

        try {
            list.remove(8);
            list.add(8);
        }catch(RuntimeException e) {
            System.out.println("Не можем добавить тот который был удален(((");
            System.out.println(list);
        }

        try {
            list.remove(0);
        }catch (RuntimeException e){
            System.out.println("Не можем удалить первый(((");
            System.out.println(list);
        }
        list.firstMakeLast();

        list.remove(0);

        System.out.println(list);

    }

}
