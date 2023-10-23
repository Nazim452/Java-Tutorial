
import java.util.Scanner;

// public class array2d {
//     static void printArray(int[] [] arr){
//         for(int i = 0; i<arr.length; i++){
//             for(int j = 0; j<arr[i].length; j++){
//                 System.out.print(arr[i][j]+ " ");
//             }
//             System.out.println();
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no of row");
//         int row = sc.nextInt();

//         System.out.println("Enter no of column");
//         int column = sc.nextInt();

//         int[][] arr = new int[row][column];  // column given is not compulsury

//         System.out.println("Enter " + row*column+ " elemnt ");

//         for(int i =0; i<row; i++){
//             for(int j =  0; j<column; j++){ 
//                 arr[i][j] = sc.nextInt();

//             }

//         }printArray(arr);

//     }

// }

// public class array2d{

// // PRINT THE MATRIX

//     static void printMatrix(int[][] matrix){
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[i].length; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     static void MatrixSum(int [][] matr1 ,int r1, int c1, int[][] matr2 , int r2, int c2){
//         if(r1!=r2 || c1!=c2){
//             System.out.println("Wrong input , cant add of this matrix");
//             return;
//         }

//         int[] [] sum = new int[r1][c1];

//         for(int i = 0; i<r1; i++){    // row no     // neeed two traverse row$col bcz  initially fill
//             for(int  j= 0; j<c1; j++) {     // column no    // with 0 
//                    sum[i][j] = matr1[i][j] + matr2[i][j];
//             }    
//         }

//         printMatrix(sum);

//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.println("Enter no og row in matrix 1");
//         int r1 = sc.nextInt();

//         System.out.println("Enter no of column in matrix 1");
//         int c1 = sc.nextInt();

//         int[][] matr1 = new int[r1][c1];

//         System.out.println("Enter the value of matrix");

//         for(int i =0; i<r1; i++){
//             for(int j = 0; j<c1; j++){
//                 matr1[i][j] = sc.nextInt();

//             }
//         }

//         System.out.println("Enter no of rows in second matrix");

//         int r2 = sc.nextInt();

//         System.out.println("ENter no of column in second matrix");

//         int c2 = sc.nextInt();

//         int[][] matr2 = new int[r1][c1];

//         System.out.println("Enter the vlaue of matrix 2");

//         for(int i = 0; i<r2; i++){
//             for(int j = 0;  j<c2; j++){
//                 matr2[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Matrix 1");
//         printMatrix( matr1);

//         System.out.println("Matrix 2");
//         printMatrix(matr2);

//         System.out.println("Sum of matrix 1 & matrix 2");

//         MatrixSum(matr1, r1, c1, matr2, r2, c2);

//     }
// }

// ADDITION OF MATRIX

// public class array2d{

// // PRINT THE MATRIX

//     static void printMatrix(int[][] matrix){
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[i].length; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     static void MatrixSum(int[][] matr1 ,int r1, int c1, int[][] matr2 , int r2, int c2){
//         if(r1!= r2){
//             System.out.println("wrong input");
//             return;
//         }
//         int[][] sum = new int[r1][c1];

//         for(int i = 0; i<r1; i++){
//             for(int j = 0; j<c1; j++){
//                 sum[i][j] = matr1[i][j] +matr2[i][j]; 
//             }
//         }

//         printMatrix(sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of row in Matrix 1");
//         int r1 = sc.nextInt();

//         System.out.println("Enter no of column in matrix 1");
//         int c1 = sc.nextInt();

//         int[][] matr1 = new int [r1][c1];

//         System.out.println("Enter the vlaue of matrix 1");

//         for(int i = 0; i<r1; i++){
//             for(int j =0; j<c1; j++){
//                 matr1[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter the vlaue of row in matrix 2");
//         int r2 = sc.nextInt();

//         System.out.println("Enter the value of column in matrix 2");
//         int c2 = sc.nextInt();

//         int[][] matr2 = new int [r2][c2];

//         System.out.println("Enter the value of matrix 2");

//         for(int i =0; i<r2; i++){   // check r1 ya  r2
//             for(int j= 0; j<c2; j++){
//                 matr2[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Matrix 1");
//         printMatrix(matr1);

//         System.out.println("Matrix 2");
//         printMatrix(matr2);
//         System.out.println("Sum of matrix is");

//         MatrixSum(matr1, r1, c1, matr2, r2, c2);

//     }
// }

// MULTIPLICATION OF ARRAY

// public class array2d{

// // PRINT THE MATRIX

//     static void printMatrix(int[][] matrix){
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[i].length; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void MatrixMultiplication(int [][] matr1, int r1, int c1, int[][]matr2, int r2, int c2){
//         if(c1!=r2){
//             System.out.println("Multiplication is not possible");
//             return;
//         }
//         int [][] ans = new int [r1][c2];
//         for(int i =0; i<r1 ; i++){         //row
//             for(int j= 0; j<c2; j++){       // column
//                 for(int k=0; k<c1; k++){  // k -loop multiplication &add of matrix elem ke liye
//                      ans[i][j]+= (matr1[i][k] * matr2[k][j] );
//                 }
//             }
//         }
//         System.out.println("Multiplication of  2 matrices");
//         printMatrix(ans);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of row in Matrix 1");
//         int r1 = sc.nextInt();

//         System.out.println("Enter no of column in matrix 1");
//         int c1 = sc.nextInt();

//         int[][] matr1 = new int [r1][c1];

//         System.out.println("Enter the vlaue of matrix 1");

//         for(int i = 0; i<r1; i++){
//             for(int j =0; j<c1; j++){
//                 matr1[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter the vlaue of row in matrix 2");
//         int r2 = sc.nextInt();

//         System.out.println("Enter the value of column in matrix 2");
//         int c2 = sc.nextInt();

//         int[][] matr2 = new int [r2][c2];

//         System.out.println("Enter the value of matrix 2");

//         for(int i =0; i<r2; i++){
//             for(int j= 0; j<c2; j++){
//                 matr2[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Matrix 1");
//         printMatrix(matr1);

//         System.out.println("Matrix 2");
//         printMatrix(matr2);
//         //System.out.println("Multiplication of matrix is");

//         MatrixMultiplication(matr1, r1, c1, matr2, r2, c2);

//     }
// }

// TRANSPOSE OF MATRIX

// public class array2d{

// // PRINT THE MATRIX

//     static void printMatrix(int[][] matrix){
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[i].length; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

// // TRANSPOSE OF MATRIX

// // only aplicable for sqaure matrix

//     static int[][] TransposeMatrix(int [][] matrix , int r, int c){
//         int[][] ans = new int[c][r];    // in transpose row is convertwd into column

//         for(int i =0; i<c; i++){
//             for(int j= 0;j<r; j++ ){
//                 ans[i][j] = matrix[j][i];
//             }
//         }
//         return ans;

//     }

// // TRANSPOSE OF MATRIX WITHOUT USING ANOTHER MATRIX
// // TRANSPOSE IN PALCE

//     static void TransposeMatrix2(int[][] matrix , int r , int c){

//         for(int i= 0; i<c; i++){       // first we go to upto column  then traverse row, bcz transpose
//             for(int j = i; j<r ; j++){ //  here j loop start with i
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;

//             }
//         }
//     }
// // REVERSE OF ARRAY

//     static void  reverseArray(int[] arr){
//         int i = 0, j= arr.length-1;

//         while(i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     } 

// // ROTATING OF AMTRIX INTO 90 DEGREE CLOCKWISE

// // only aplicable for sqaure matrix

//     static void rotatingMatrix(int[][] matrix, int n){
//         // 1st find transpose

//         TransposeMatrix2(matrix, n, n);    // yahan bina swapping wala transppose hi pass hoga

//         // then reverse - now we find rotated matrix

//         for(int i = 0; i<n; i++){     //n-  row/column --- square matrix
//             reverseArray(matrix[i]);
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no of row");
//         int r = sc.nextInt();

//         System.out.println("Enter no of colulmn");
//         int c = sc.nextInt();

//         int [][] matrix = new int[r][c];

//         int totalElemnt = r*c;
//         System.out.println("Enter " + totalElemnt+ " eleent");

//         for(int i = 0; i<r; i++){
//             for(int j =0; j<c; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         /*
//             1, 2,3
//             4, 5,6
//             7, 8,9

//             if i=0
//             reverseArray ({ 1, 2, 3})      isliye reverse array me 1 array pass kiya gaya hai
//          */

//         System.out.println("Input matrix");

//         printMatrix(matrix);

//         //System.out.println("Transpose matrix");

//         // int [][]ans = TransposeMatrix(matrix, r, c);
//         // printMatrix(ans);

//         //TransposeMatrix2(matrix, r, c);
//        // printMatrix(matrix);

//        rotatingMatrix(matrix, r);

//        System.out.println("rotated matrix");
//        printMatrix(matrix);

//     }
// }

//PASCLA TRIANGLE

// public class array2d{

// // PRINT THE MATRIX

//     static void printMatrix(int[][] matrix){
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[i].length; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     static int[][] pascla( int n){
//         int[][] ans = new int [n][];

//         for(int i=0; i<n;i++){
//                // ith row has i+1 column

//             ans[i] = new int[i+1];     // jagged array  , if we column decide later

//             // 1st & last element of array is 1

//             ans[i][0] = ans[i][i] = 1;     //[i[0] - for intial put 1 --- [i][i] -- for last put1

//             for(int j = 1; j<i; j++){
//                 ans[i][j] = ans[i-1][j]+ ans[i-1][j-1];
//             }

//         }
//         return ans;

//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner( System.in);

//         System.out.println("Enter upto how many length of pascal want");

//         int n= sc.nextInt();
//         int[][] ans = pascla(n);
//         printMatrix(ans);

//     }
// }

// RETURN ALL THE MATRIX ELEMENT IN SPIRAL ORDER

public class array2d {

    // PRINT THE spiral

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottmRow = r - 1, leftColumn = 0, rightColumn = c - 1;

        int totalElemnt = 0;

        while (totalElemnt < r * c) { // loop jab tak chalega tab tak total elemnt matrix me hai

            // top row ->leftcol to right column

            for (int j = leftColumn; j <= rightColumn && totalElemnt < r * c; j++) {
                System.out.print(matrix[topRow][j] + " "); // only column change
                totalElemnt++;
            }
            topRow++;

            // rightcol -> top row to bottom row

            for (int i = topRow; i <= bottmRow && totalElemnt < r * c; i++) {
                System.out.print(matrix[i][rightColumn] + " "); // only row change
                totalElemnt++;
            }
            rightColumn--;

            // bottom row ->right col to left column

            for (int j = rightColumn; j >= leftColumn && totalElemnt < r * c; j--) { // opposite ja rahe hai right to
                                                                                     // left
                System.out.print(matrix[bottmRow][j] + " ");
                totalElemnt++;
            }
            bottmRow--;

            // left col -> bottom row to top row

            for (int i = bottmRow; i >= topRow && totalElemnt < r * c; i--) {
                System.out.print(matrix[i][leftColumn] + " ");
                totalElemnt++;
            }
            leftColumn++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row in Matrix ");
        int r = sc.nextInt();

        System.out.println("Enter no of column in matrix ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElemnt = r * c;

        System.out.println("Enter " + totalElemnt + " values");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix");
        printMatrix(matrix);

        System.out.println("spiral oreder");
        printSpiralOrder(matrix, r, c);

    }
}

// GENERATE A SPIRAL ORDER 1, 2,3,4,5,6,7,.....ORDER -- square matrix

// public class array2d{

// // PRINT THE Martix

// static void printMatrix(int[][] matrix){
// for(int i = 0; i<matrix.length; i++){
// for(int j = 0; j<matrix[i].length; j++){
// System.out.print(matrix[i][j]+" ");
// }
// System.out.println();
// }
// }

// static int [][] GenerateSpiralMarix(int n){
// int[][] matrix = new int[n][n];

// int topRow = 0, bottmRow = n-1, leftColumn = 0,rightColumn = n-1;

// int curr = 1;

// while(curr<=n*n){ // loop jab tak chalega tab tak total elemnt matrix me hai

// // top row ->leftcol to right column

// for(int j =leftColumn; j<=rightColumn &&curr<=n*n; j++){
// matrix[topRow][j] = curr++; // only column change

// }
// topRow++;

// // rightcol -> top row to bottom row

// for(int i = topRow; i<=bottmRow &&curr<n*n; i++){
// matrix[i][rightColumn] = curr++; // only row change

// }
// rightColumn--;

// //bottom row ->right col to left column

// for(int j= rightColumn; j>=leftColumn &&curr<n*n; j-- ){ //opposite ja rahe
// hai right to left
// matrix[bottmRow][j]= curr++;

// }
// bottmRow--;

// // left col -> bottom row to top row

// for(int i = bottmRow ; i>=topRow &&curr<n*n; i--){
// matrix[i][leftColumn] = curr++;

// }
// leftColumn++;
// }
// return matrix;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter n");

// int n = sc.nextInt();

// int[][] matrix = GenerateSpiralMarix(n);
// printMatrix(matrix);

// }
// }

// FIND SUM OF RECTANGLE IN GIVEN MATRIX

// public class array2d{

// // PRINT THE Martix

// static void printMatrix(int[][] matrix){
// for(int i = 0; i<matrix.length; i++){
// for(int j = 0; j<matrix[i].length; j++){
// System.out.print(matrix[i][j]+" ");
// }
// System.out.println();
// }
// }

// static int rectangleSum(int[][] matrix , int l1, int r1 , int l2, int r2){
// int sum = 0;

// for(int i = l1; i<=l2; i++){
// for(int j = r1; j<=r2; j++){
// sum += matrix[i][j];
// }
// }

// return sum;
// }

// // FIND PREFIX OF 2-D MATRIX

// static void prefix(int[][] martix ){
// int r = martix.length;
// int c = martix[0].length;

// // traversing horizontally to clculre row wise prefix

// for(int i = 0; i<r; i++){
// for(int j = 1; j<c; j++){
// martix[i][j]+=martix[i][j-1];
// }
// }

// // traversing verticall to calculate column wise prefix for 3rd approach

// for(int j = 0; j<c; j++){ // pahle column ar gaye kyonki columnm wise
// travrsal
// for(int i = 1; i<r; i++){
// martix[i][j] +=martix[i-1][j];
// }
// }

// }

// static int rectangleSum2(int[][] matrix, int l1, int r1, int l2, int r2){ //
// optimize way
// int sum= 0;

// prefix(matrix);

// for(int i = l1; i<=l2; i++){ // 1 hi bar isme travesal karna para - sum pefix
// ke help se

// // r1 to r2 sum
// if(r1>=1){

// // in one dimen arr -> sum(l,r) = arr[r] - arr[l-1] ;

// sum+= matrix[i][r2]- matrix[i][r1-1]; // prev given for q auerie l to r ka
// sum

// }
// else{
// sum+= matrix[i][r2];

// }

// }

// return sum;
// }






// static int rectangleSum3(int[][] matrix, int l1, int r1, int l2, int r2){ //


    
// best optimize way
// int ans= 0, left = 0,up =0,leftup=0,sum=0;

// prefix(matrix);

// sum = matrix[l2][r2];
// if(l1>=1){
// up = matrix[l1-1][r2];

// }

// if(r1>=1){
// left = matrix[l2][r1-1];

// }

// if(l1 >=1 && r1>=1){
// leftup= matrix[l1-1][r1-1];

// }

// ans = sum-up-left+leftup;

// return ans;

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter no of row in Matrix ");
// int r = sc.nextInt();

// System.out.println("Enter no of column in matrix ");
// int c = sc.nextInt();

// int[][] matrix = new int [r][c];
// int totalElemnt = r*c;

// System.out.println("Enter "+ totalElemnt+ " values");

// for(int i = 0; i<r; i++){
// for(int j =0; j<c; j++){
// matrix[i][j] = sc.nextInt();
// }

// }
// System.out.println("Enter the value of l1 , r1, l2 r2");
// int l1 = sc.nextInt();
// int r1 = sc.nextInt();
// int l2 = sc.nextInt();
// int r2 = sc.nextInt();

// // System.out.println(rectangleSum(matrix, l1, r1, l2, r2) + " Sum of
// rectangle given by you");
// //System.out.println(rectangleSum2(matrix, l1, r1, l2, r2));

// System.out.println("Sum of rectangle is " + rectangleSum3(matrix, l1, r1, l2,
// r2));
// }
// }

// OUR CODE - spiral of matrix same code but not working

// public class array2d{

// // PRINT THE Martix

// static void printMatrix(int[][] matrix){
// for(int i = 0; i<matrix.length; i++){
// for(int j = 0; j<matrix[i].length; j++){
// System.out.print(matrix[i][j]+" ");
// }
// System.out.println();
// }
// }

// static void printSpiralOrder(int[][] matrix , int r ,int c){

// int topRow = 0, bottmRow = r-1,leftcolumn = 0, rightColumn= c-1;

// int totalElemnt = 0;

// while(totalElemnt>r*c){

// //top row ->left column to right column

// for(int j = leftcolumn; j<=rightColumn && totalElemnt<r*c; j++ ){
// System.out.println(matrix[topRow][j]+ " ");
// totalElemnt++;
// }

// topRow++;

// // right column -> top row to bottom row

// for(int i = topRow; i<=bottmRow&& totalElemnt<r*c; i++){
// System.out.println(matrix[i][rightColumn]+ " ");
// totalElemnt++;

// }
// rightColumn--;

// // bottomrow -> right column to left column

// for(int j = rightColumn; j>=leftcolumn&& totalElemnt<r*c; j--){
// System.out.println(matrix[bottmRow][j]+ " ");
// totalElemnt++;
// }
// bottmRow--;

// //left column -> bottom row to top row

// for(int i = bottmRow; i>=topRow&&totalElemnt<r*c; i--){
// System.out.println(matrix[i][leftcolumn]+ " ");
// totalElemnt++;

// }
// leftcolumn++;

// }

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter no of row of amtrix");

// int r = sc.nextInt();

// System.out.println("Enter no of column in matrix");

// int c= sc.nextInt();

// int totalElemnt = r*c;

// System.out.println("Enter " + totalElemnt+ " Element");

// int[][] matrix = new int [r][c];

// for(int i = 0; i<r; i++){
// for(int j = 0; j<c; j++){
// matrix[i][j] = sc.nextInt();
// }
// }

// System.out.println("Input matrix");
// printMatrix(matrix);

// System.out.println("Spiral Order");
// printSpiralOrder(matrix, r, c);

// }
// }

// same code this is working & my code is not running

// public class array2d{

// // PRINT THE Martix

// static void printMatrix(int[][] matrix){
// for(int i = 0; i<matrix.length; i++){
// for(int j = 0; j<matrix[i].length; j++){
// System.out.print(matrix[i][j]+" ");
// }
// System.out.println();
// }
// }

// static void printSpiralOrder(int[][] matrix, int r, int c){
// int topRow = 0, bottmRow = r-1, leftColumn = 0,rightColumn = c-1;

// int totalElemnt = 0;

// while(totalElemnt<r*c){ // loop jab tak chalega tab tak total elemnt matrix
// me hai

// // top row ->leftcol to right column

// for(int j =leftColumn; j<=rightColumn &&totalElemnt<r*c; j++){
// System.out.print(matrix[topRow][j]+ " "); // only column change
// totalElemnt++;
// }
// topRow++;

// // rightcol -> top row to bottom row

// for(int i = topRow; i<=bottmRow &&totalElemnt<r*c; i++){
// System.out.print(matrix[i][rightColumn]+ " "); // only row change
// totalElemnt++;
// }
// rightColumn--;

// //bottom row ->right col to left column

// for(int j= rightColumn; j>=leftColumn &&totalElemnt<r*c; j-- ){ //opposite ja
// rahe hai right to left
// System.out.print(matrix[bottmRow][j]+ " ");
// totalElemnt++;
// }
// bottmRow--;

// // left col -> bottom row to top row

// for(int i = bottmRow ; i>=topRow &&totalElemnt<r*c; i--){
// System.out.print(matrix[i][leftColumn]+ " ");
// totalElemnt++;
// }
// leftColumn++;
// }

// }
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter no of row in Matrix ");
// int r = sc.nextInt();

// System.out.println("Enter no of column in matrix ");
// int c = sc.nextInt();

// int[][] matrix = new int [r][c];
// int totalElemnt = r*c;

// System.out.println("Enter "+ totalElemnt+ " values");

// for(int i = 0; i<r; i++){
// for(int j =0; j<c; j++){
// matrix[i][j] = sc.nextInt();
// }
// }

// System.out.println("Input matrix");
// printMatrix(matrix);

// System.out.println("spiral oreder");
// printSpiralOrder(matrix, r, c);

// }
// }
