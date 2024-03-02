import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite o numero base:   ");
        int num1 = scan.nextInt();

        System.out.println("Digite a potencia:  ");
        int num2 = scan.nextInt();
        
        System.out.println("resultado "+ expo(num1, num2));

        scan.close();

    }

    public static double expo(double x, double k){
        double total = 1;
        if (k == 0){
            return 1;
        }

        if (k == 1){
            return x;
        }  

        if (k < 0){
            x = 1/x;
            k = -k;
        }

        for (double i = 0; i < k; i++){
            total *= x;
        }

        return total;
    }
}
