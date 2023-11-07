import java.util.Scanner;

public class individu17_1 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("masukkan nilai N : ");
        int N = sc17.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int tempat = 1; tempat <= N-i; tempat++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                
                System.out.println();
            }
        }
    }
}
