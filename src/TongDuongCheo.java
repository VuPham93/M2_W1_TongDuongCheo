import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận: ");
        int size = sc.nextInt();

        int[][] array = new int[size][size];
        int total = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhâp phần tử [" + i + "][" + j + "] của ma trận: " );
                array[i][j] = sc.nextInt();
                if (i == j) {
                    total += array[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo của ma trận vuông là: " + total);
    }
}
