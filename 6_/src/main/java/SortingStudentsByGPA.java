import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Integer> {

    String name;
    int score;

    public SortingStudentsByGPA(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return -1;
    }

    public void sort(SortingStudentsByGPA[] array, int low, int high){

        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle].score;

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (this.compare(array[i].score, 0) > 1) {
                i++;
            }

            while (array[j].score > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i].score;
                array[i] = array[j];
                array[j].score = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sort(array, low, j);

        if (high > i)
            sort(array, i, high);

    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
