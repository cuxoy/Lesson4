package lesson4;

public class Task78 {
    public static void hillelTheBest (){
        System.out.println("Task 7 : ");
        for (int i = 5; i >=0 ; i--) {
            if (i>=0) {
                continue;
            }
            if (i<0) {
                return;
            }
        }
        System.out.println("Hillel The Best");
    }

    public static void oddOrEven (int[] array2) {
        System.out.println("Task 8 : ");
        for (int i = 0; i <array2.length ; i++) {
            if (array2[i] % 2 == 0) {
                System.out.println(array2[i] + " : Четное");
            } else {
                System.out.println(array2[i] + " : Нечетное");
            }

        }
    }
}
