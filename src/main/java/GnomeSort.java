import java.util.Random;

//TODO: reverse this string: "this string will be reversed"

public class GnomeSort {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        int index = 0;
        while (index < arr.length) {
            if (index + 1 == arr.length) {
                break;
            }
            int currentElement = arr[index];
            int nextElement = arr[index + 1];

            if (currentElement > nextElement) {
                arr[index] = nextElement;
                arr[index + 1] = currentElement;
                index--;
            } else {
                index++;
            }
            if (index < 0){
                index = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
