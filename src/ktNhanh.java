import java.util.Scanner;

public class ktNhanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhập vào n");
        n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("n[" + i + "]=");
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum = sum + a[i];
            }

        }
        System.out.println("tổng các số chẵn :" + sum);
        System.out.println("Nhập số nguyên cần tìm y: ");
        int y = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == y) {
                System.out.println("vị trí là : " + i);
            }
        }
    }
}




