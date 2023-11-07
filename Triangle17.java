import java.util.Scanner;

public class Triangle17 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("masukkan nilai N = ");

    int N = sc17.nextInt();
    int i = 0;

    while (i <= N){
        int j = 0;
        while (j<i){
            System.out.print("*");
            j++;
        }
        i++;

    }
}
}