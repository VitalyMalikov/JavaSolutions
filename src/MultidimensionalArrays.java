public class MultidimensionalArrays {
    public static void main(String[] args){
        int[] array1 = {3,4,5};
        int[][] matrice1 = {{3,4,5},{6,7,8},{9,11,23,3}};
        for(int i = 0; i < matrice1.length; i++){  //length = 3, тк. каждый из этих одномерных массивов это элемент двумерного массива
            for(int j = 0; j < matrice1[i].length; j++){   // кол-во элементов в конкретном одномерном массиве ( то бишь строке)
                System.out.print(matrice1[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
