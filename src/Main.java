import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        if (n <= k) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);

        int[] dif = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            dif[i] = arr[i + 1] - arr[i];
        }
        Arrays.sort(dif);

        int answer = 0;
        for (int i = 0; i < n - k; i++) {
            answer += dif[i];
        }

        System.out.println(answer);
    }
}