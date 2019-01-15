public class MyExc2 extends RuntimeException {
    MyExc2(int a) {
        if (a < 0) {
            System.out.println("Возвраст должен быть больше 0");
            System.exit(0);
        }
    }
}
