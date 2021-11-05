public class Main {

    public static void main(String[] args) {

        // 1 2 3 4
        Exception2 e = new Exception2();
        try {
            e.exceptionDemo();
        }catch (Exception e1){
            System.out.println(e1);
        }finally {
            System.out.println("finally");
        }
        // 5
        ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.printMessage(null);
        }catch (NullPointerException e1){
            e1.printStackTrace();
        }
        // 6 7
        try {
            demo.printDetails(null);
        }catch (Exception e1){
            System.out.println(e1);
        }

        ThrowsDemo2 demo2 = new ThrowsDemo2();

        try {
            demo2.printDetails(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
