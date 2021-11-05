public class Main {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[10];
        for(int i = 0; i < iDNumber.length; i++) {
            iDNumber[i] = new Student("student" + i, (int)(Math.random() * 10));
        }
        for(Student student : iDNumber)
            System.out.println(student);

        Student.InsertionSort(iDNumber);

        System.out.println();

        for(Student student : iDNumber)
            System.out.println(student);

        SortingStudentsByGPA[] students = new SortingStudentsByGPA[10];
        for(int i = 0; i < students.length; i++)
            students[i] = new SortingStudentsByGPA("name" + i, (int)(Math.random() * 10));



    }
}
