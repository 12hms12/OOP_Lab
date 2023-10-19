/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;
import java.util.* ;
/**
 *
 * @author student
 */
class InvalidMatrix extends Exception{
    public InvalidMatrix(String s){
     super(s);
    }
}

public class Lab10_q5 {
    
    static void IsMatrix(int a, int b) throws InvalidMatrix{
        if(a!=b) throw new InvalidMatrix("Matrix is not square : ");
    }
            
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of row and col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        System.out.println("Enter elements :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        try{ IsMatrix(row,col);}
        catch(InvalidMatrix m){System.out.println("Not a square matrix");System.exit(0);}
        int diag=0;
        for(int i=0;i<row;i++) diag += mat[i][i];
        System.out.println("Sum of Diagonal = "+diag);    
    }    
}
