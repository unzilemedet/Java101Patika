package patika.dev;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Dizinin elemanlarını kullanıcıdan al
        for(int i = 0; i < n; i++){
            System.out.print((i+1) + ". Elemenı: ");
            arr[i] = scanner.nextInt();
        }
        // Diziyi küçükten büyüğe sırala
        Arrays.sort(arr);

        // Sıralanmış diziyi yazdır
        System.out.print("Sıralama: ");
        for(int i=0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
