public class ArraysOfStrings {
    public static void main(String[] args){
        int[] array1 = new int[3];
        array1[0] = 5;
        for (int i = 1; i < array1.length; i++){
            array1[i] = array1[i-1]  + 4;
        }
        int sumArray1 = 0;
        // выполняет с каждым элементом массива операцию(тип данных, название нового массива: по какому массиву пробегаться)
        for(int numbers: array1){
            sumArray1 = numbers;
            System.out.println(numbers);
        }
        String[] array2 = new String[4];
        array2[0] = "vvaavv";
        for (int i = 1; i < array2.length; i++){
            array2[i] = array2[i-1]  + "asad";

        }
        for(String xxx:array2){
            System.out.println(xxx);
        }

        String s; // переменная s указывает на null (ничто)


    }
}
