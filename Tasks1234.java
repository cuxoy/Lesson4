package lesson4;

public class Tasks1234 {
    public static void methodWile (int a, int b) {
        System.out.println("Task 1 : ");
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
    public void methodFor (int a) {
        System.out.println("Task 2 : ");
        for (int i = 1; i < a; i++) {
            System.out.println(i);
        }
    }
    public static void methodWhile100To0 (int a){
        System.out.println("Task 3 : ");
        int b = 100;
        while (b >= a) {
            System.out.println(b);
            b -= 10;
        }
    }
    public static void methodFor100ToO (){
        System.out.println("Task 4 : ");
        for (int i =100; i >(-1) ; i-=10) {
            System.out.println(i);
        }
    }
}
