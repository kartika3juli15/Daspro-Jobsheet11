import java.util.Scanner;

public class NestedLoop_2341760116 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in); 

    double angka [][] = new double [5][7];
    
    for (int i = 0; i < angka.length; i++){
        System.out.println("kota ke- " + (i+1));
        for (int j = 0; j < angka[0].length; j++){
            System.out.print("hari ke-" + (j+1) + ": ");
            angka [i][j] = sc17.nextDouble();
        }
        System.out.println();
        }
    for (int i = 0; i < angka.length; i++){
        System.out.print("kota ke-" + (i + 1) + ": ");
        for (int j = 0; j < angka[0].length; j++){
            System.out.print(angka [i][j] + " ");
        }
        System.out.println();
    }
    }
}