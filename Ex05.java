import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite o numero base:   ");
        int num1 = scan.nextInt();

        System.out.println("resultado " + trib(num1));

        scan.close();
    }

    public static int trib(int x){
        int m = 1;
        int n = 1;
        int o = 0;
        int p = 0;
        
        if (x == 0){
            return 0;
        }

        if (x == 1 || x == 2){
            return 1;
        }  
        
        for (int i = 3; i <= x; i++){
            p = m + n + o;
            o = n;
            n = m;
            m = p;
        }

        return p;
    }
}
