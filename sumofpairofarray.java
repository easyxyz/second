import java.util.ArrayList;
import java.util.Scanner;

/**
 * sumofpairofarray
 */
public class sumofpairofarray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        ArrayList<Integer> list = sumofpairarray(arr);
        for (Integer l : list) {
            System.out.print(l + " ");
        }

    }

    public static ArrayList<Integer> sumofpairarray(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            list.add(arr[i] + arr[i + 1]);
        }

        return list;

    }

}