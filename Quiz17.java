import java.util.Random;
import java.util.Scanner; 

public class Quiz17 {

    public static void main(String[] args) {
        Random random17 = new Random();
        Scanner sc17 = new Scanner(System.in);

    char menu ='y';
    do { 
        int number = random17.nextInt(10) + 1;
        boolean success = false;
        do{
            System.out.print("Tebak angka (1-10) : ");
            int answer = sc17.nextInt();
            sc17.nextLine();
            success = (answer == number);
            
        } while (!success);
        System.out.print("apakah anda ingin mengulang permainan (Y/y)?");
        menu = sc17.nextLine().charAt(0);
        } while(menu=='y' || menu=='Y');
    
}
}