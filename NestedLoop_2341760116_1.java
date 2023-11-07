import java.util.Scanner;

public class NestedLoop_2341760116_1 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in); 

    double angka [][] = new double [5][7];
    
    for (int i = 0; i < angka.length; i++){
        System.out.println("kota ke- " + (i+1));
        double totalsuhu = 0.0;
        for (int j = 0; j < angka[i].length; j++){
            System.out.print("hari ke-" + (j+1) + ": ");
            angka [i][j] = sc17.nextDouble();
            totalsuhu += angka[i][j];
        }
        double rataSuhuKota = totalsuhu / angka[i].length; 
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + ": " + rataSuhuKota);
            System.out.println();
    }
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double suhu : angka[i]) {
                System.out.print(suhu + " ");
        }
        System.out.println();
    }
    }
    }
