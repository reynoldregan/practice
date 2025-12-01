package com.reynoldregan.practice;

public class PrintAntiDiaganolMatrix {
    //TC:
    //SC:

    int[][] mat = new int[4][3];

    int n = mat.length;
    int m = mat[0].length;

    void init() {
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = val++;
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        PrintAntiDiaganolMatrix obj = new PrintAntiDiaganolMatrix();
        obj.init();
        obj.printRows();

        System.out.println();
        obj.printCols();

    }

    void printRows() {
        int i=0;
        for(int j=0;  j<m; j++){
            printDiagonal(i, j);
        }
    }

    void printCols(){
        int j=m-1;
        for(int i=1; i<n;i++){
            printDiagonal(i,j);
        }
    }

    void printDiagonal(int i, int j){
        while(i<n && j>=0){
            System.out.print(mat[i][j] +"\t");
            i++;
            j--;
        }
        System.out.println();
    }
}
