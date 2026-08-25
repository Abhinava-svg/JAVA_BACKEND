public class Multidimensional_Array_01{
    public static void main(String args[]){

        int matrix[][] = new int [3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[]: matrix){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}