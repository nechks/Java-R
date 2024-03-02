
public class Ex08 {
    public static void main(String[] args) {
        Number [] array = {1, 3, 4, 6};
        
        System.out.println(somaR(array));
    }

    public static int somaR(Number[] array){
        int soma = 0;
        for (int i = 0; i < array.length; i++){
            soma += array[i].intValue();
        }
        return soma;
    }
}
