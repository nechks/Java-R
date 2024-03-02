public class Ex07 {
    public static void main(String[] args) {
        Number[] array = {1, 2, 3, 3, 5};
        System.out.println(saoTodosInteiros(array, 0));
    }

    public static boolean saoTodosInteiros(Number[] array, int index) {
        if (index == array.length) {
            return true;
        }

        if (array[index].doubleValue() % 1 != 0) {
            return false;
        }

        return saoTodosInteiros(array, index + 1);
    }
}
