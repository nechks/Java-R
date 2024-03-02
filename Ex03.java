public class Ex03 {

    public static int fatoriaL (int n){
        if (n == 1){
            return 1;
        } else {
            return fatoriaL(n - 1)*n;
        }
    }

    public static void main(String[] args) {
        System.out.println(fatoriaL(1));
        System.out.println(fatoriaL(2));
        System.out.println(fatoriaL(3));
        System.out.println(fatoriaL(4));
    }

}
