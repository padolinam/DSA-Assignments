import java.util.*;

public class Matrix{

   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Input matrix size(n*n): ");
      int size = scanner.nextInt();
      
      //random matrices A & B
      int [][] A = new int[size][size];
      int [][] B = new int[size][size];
      
      int numValues = (size*size) + (size*size);
      System.out.println("The total number of values for matrices A and B is "+numValues);
      System.out.println("Input values for the matrix ("+numValues+" items): ");
     
     //populate matrices A & B
      for (int i=0; i<size; i++) {
         for (int j=0; j<size; j++) {
            A[i][j] = scanner.nextInt();
            B[i][j] = scanner.nextInt();
            }
        }
        
     //create empty matrix C
     int[][] C = new int[size][size];
    
     // Calculate the result of A*B = C
     for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                  C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
     //print A
     System.out.print("Matrix A");
     System.out.println();
     for (int i = 0; i < A.length; i++) {
         for (int j = 0; j < A[i].length; j++) {
            System.out.print(A[i][j] + " ");
         }
       System.out.println();
     }  
       System.out.println();
     
     //print B
     System.out.print("Matrix B");
     System.out.println();
     for (int i = 0; i < B.length; i++) {
         for (int j = 0; j < B[i].length; j++) {
            System.out.print(B[i][j] + " ");
         }
       System.out.println();
     }   
       System.out.println();
        
        
        
     //print C   
     System.out.print("Matrix C");
     System.out.println();
     for (int i = 0; i < C.length; i++) {
         for (int j = 0; j < C[i].length; j++) {
            System.out.print(C[i][j] + " ");
         }
       System.out.println();
     }
      
   }

}