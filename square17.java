import java.util.Scanner;

public class square17 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

    System.out.print("masukkan nilai N = ");
    int N = sc17.nextInt();

    for (int iOuter=1; iOuter<=N; iOuter++){ 
    for(int i=1; i <= N; i++){
        System.out.print("*");
    }
    System.out.println();
    }
    }
}
