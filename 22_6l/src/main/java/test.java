public class test {

    public static class A{
        public void a(){
            System.out.println("Это стандартная реализауция в А");
        }
    }

    public static class B extends A {
        //@Override
        public void a() {
            System.out.println("Это переопределенная реализауция в B");
        }
    }

    public static void print(A a){

        a.a();

    }

    public static void main(String[] args) {
        print(new A());
        print(new B());
    }
}
