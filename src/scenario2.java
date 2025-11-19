import java.util.Arrays;
import java.util.Random;
public class scenario2 {
    public static int[] rotateRightByOne(int[] arr) {
        int last = arr[arr.length - 1]; // son elemanı sakla
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        return arr;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(11) + 10; // 10–20 arası
        int[] myArr = new int[size];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rand.nextInt(100);
        }
        System.out.println("Original array: " + Arrays.toString(myArr));
        int[] rotated = rotateRightByOne(myArr);
        System.out.println("Rotated array: " + Arrays.toString(rotated));
    }
}