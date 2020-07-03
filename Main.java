package lesson4;

public class Main {
    public static void main(String[] args) {
        Tasks1234.methodWile(1, 10);

        Tasks1234 task1 = new Tasks1234();
        task1.methodFor(11);

        Tasks1234.methodWhile100To0(0);

        Tasks1234.methodFor100ToO();

        Tasks56 tasks56 = new Tasks56();
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         tasks56.arrayMax(array1);
        int result = Tasks56.arrayMin(array1);
        System.out.println(result);


        Task78.hillelTheBest();
        Task78.oddOrEven(array1);




    }
}
