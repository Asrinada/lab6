import java.util.Arrays;
public class scenario1 {
    public static int[] resizeRoster(int[] oldRoster, int newSize) {
        int[] newRoster = new int[newSize]; // yeni dizi oluştur
        System.arraycopy(oldRoster, 0, newRoster, 0, oldRoster.length);
        return newRoster;
    }

    public static void main(String[] args) {
        int[] oldRoster = new int[20];
        for (int i = 0; i < oldRoster.length; i++) {
            oldRoster[i] = 1000 + i;
        }
        int newSize = 42;
        int[] newRoster = resizeRoster(oldRoster, newSize);
        System.out.println("Old roster: " + Arrays.toString(oldRoster));
        System.out.println("New roster: " + Arrays.toString(newRoster));
    }
}