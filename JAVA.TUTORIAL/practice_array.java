import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Track;


// public class practice_array {


// // find index of target elemnet


//     static int   findMaxInde(int[]arr, int target){
        
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]== target){
//                 return i;
//             }

//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[]arr = { 2,5,6,8};
//         System.out.println(findMaxInde(arr, 10));
        
//     }
    
// }

// public class practice_array{
  
   

    
// // REMIVE DUPLICATE ELEM IN ARRAY


//     static int removeSDuplicate(int []arr){
//         int j = 0;

//         for(int i = 0; i<arr.length; i++){
//             if(arr[j]!=arr[i]){
//                 j++;
//                 arr[j]=arr[i];
                
//             }
//         }
//         return j+1;
//     }

   
// // remove target elemnt



//     static int removeTarget(int[]arr, int val){
//         int count = 0;

//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]!=val){
//                 arr[count] =arr[i];
//                 count++; 
//             }
//         }
//         return count;

//     }
  
//     public static void main(String[] args) {
//        // int []arr = { 0,0,1,1,1,2,2,3,3,4};          // o/p -5         because upto 5 elem - (0,1,2,3,4)
//                                                         // duplicate elem present after  5 elem 
//         //System.out.println(removeSDuplicate(arr));

//         // int[]arr = { 3,2,2,3};

//         // System.out.println(removeTarget(arr, 3));
//     }

// }
     
//     static void printSpiralOrder(int[][] matrix, int r, int c){
//         int topRow = 0, bottmRow = r-1, leftColumn = 0,rightColumn = c-1;

//         int totalElemnt = 0;

//         while(totalElemnt<r*c){            // loop jab tak chalega tab tak total elemnt matrix me hai

//             // top row ->leftcol to right column

//             for(int j =leftColumn; j<=rightColumn &&totalElemnt<r*c; j++){
//                 System.out.print(matrix[topRow][j]+ " ");  // only column change
//                 totalElemnt++;
//             }
//             topRow++;


//             // rightcol -> top row to bottom row

//             for(int i = topRow; i<=bottmRow &&totalElemnt<r*c; i++){
//                 System.out.print(matrix[i][rightColumn]+ " ");   // only row change
//                 totalElemnt++;
//             }
//             rightColumn--;



//             //bottom row ->right col to left column

//             for(int j= rightColumn; j>=leftColumn &&totalElemnt<r*c; j-- ){     //opposite ja rahe hai right to left
//                  System.out.print(matrix[bottmRow][j]+ " ");
//                  totalElemnt++;
//             }
//             bottmRow--;


//             // left col -> bottom row to top row

//             for(int i = bottmRow ; i>=topRow &&totalElemnt<r*c; i--){
//                 System.out.print(matrix[i][leftColumn]+ " ");
//                 totalElemnt++;
//             }
//             leftColumn++;
//         }

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of row in Matrix ");
//         int r = sc.nextInt();

//         System.out.println("Enter no of column in matrix ");
//         int c = sc.nextInt();

        

//         int[][] matrix = new int [r][c];
//         int totalElemnt = r*c;

//         System.out.println("Enter "+ totalElemnt+ " values");

//         for(int i = 0; i<r; i++){
//             for(int j =0; j<c; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Input matrix");
//         printMatrix(matrix);

//         System.out.println("spiral oreder");
//         printSpiralOrder(matrix, r, c);

        
//     }
// }





// public class practice_array{
    
//     static void printMatrix(int[][] matrix){
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[i].length; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void spiral2(int[][] matrix, int r, int c){
//         int toprow = 0, bottmRow = r-1, leftColumn =0, rightcol = c-1;

//         int totalElemnt =0;

//         while(totalElemnt<r*c){
            

//             // toprow -> lc to rc

//             for(int j =leftColumn; j<=rightcol&& totalElemnt<r*c; j++){
//                 System.out.print(matrix[toprow][j]+ " ");
//                 totalElemnt++;
//             }
//             toprow++;

//             // right col -> tr to br

//             for(int i =toprow; i<=bottmRow&& totalElemnt<r*c; i++){
//                 System.out.print(matrix[i][rightcol]+" ");
//                 totalElemnt++;
//             }
//             rightcol--;

//             //bottom row ->rc to lc

//             for(int j=rightcol; j>=leftColumn&& totalElemnt<r*c; j--){
//                 System.out.print(matrix[bottmRow][j]+" ");
//                 totalElemnt++;
//             }
//             bottmRow--;

//             // leftcol-> br to tr

//             for(int i =leftColumn; i>=bottmRow&totalElemnt<r*c; i--){
//                 System.out.print(matrix[i][leftColumn]+" ");
//                 totalElemnt++;
//             }
//             leftColumn++;


//     }

// }

//     static void spiral(int[][]matrix, int r, int c){
//         int topRow =0, bottomrow =r-1, leftColumn = 0, rightColumn  = c-1;

//         int totalElemnt = 0;

//         while(totalElemnt<r*c){

//             // toprow-> leftcol to right col

//             for(int j = leftColumn; j<=rightColumn   && totalElemnt<r*c; j++ ){
//                System.out.print(matrix[topRow][j]+" ");
//                totalElemnt++;

//             }
//             topRow++;

            

//             //right col -> toprow to bottomrow

//             for(int i =topRow; i<=bottomrow&&totalElemnt<r*c; i++){
//                 System.out.print(matrix[i][rightColumn]+" ");
//                 totalElemnt++;
//             }
//             rightColumn--;


//             //bottom row-> right col to left col

//             for(int j =rightColumn; j>=leftColumn&& totalElemnt<r*c; j--){
//                 System.out.print(matrix[bottomrow][j]+" ");
//                 totalElemnt++;
//             }
//             bottomrow--;


//             // leftcol-> bottom row to top raw

//             for(int i =bottomrow; i>=topRow&& totalElemnt<r*c; i--){
//                 System.out.print(matrix[i][leftColumn]+" ");
//                 totalElemnt++;
//             }
//             leftColumn++;

//         }
//     }


    
    
//     public static void main(String[] args) {
//         int[][]martix = {{1,2,3},
//                           {4,5,6 },
//                           {7,8,9}};

//         spiral2(martix, 3, 3);


        




        
      
//     }     

// }




// given l1 , r1, l2, r2  in 2d array we nweed to find sum of this rezctangle

// brute force approach


// public class practice_array{

//     static void prefixSum(int[][] martix ){
//         int row = martix.length;
//         int col = martix[0].length;

//         // horizontally prefix

//         for(int i =0; i<row; i++){
//             for(int j = 1; j<col; j++){
//                 martix[i][j]+=martix[i][j-1];

//             }
//         }

//         // vertically traverse

//         for(int j = 0; j<col; j++){
//             for(int i = 1; i<row; i++){
//                 martix[i][j]+=martix[i-1][j];
//             }
//         }
//     }

//     static int findsum(int[][] matrix, int l1, int r1, int l2, int r2){
//         int sum= 0;

//         for(int i = l1; i<=l2; i++){
//             for(int j = r1; j<=r2; j++){
//                 sum+=matrix[i][j];
//             }
//         }


//         return sum;
//     }

//     static int rectangleSum5(int[][]matrix, int l1, int r1, int l2, int r2){

//         prefixSum(matrix);

//         int ans = 0;

//         int up =0, left = 0, leftup =0, sum = 0;

//         sum = matrix[l2][r2];
//         if(l1>=1)
//           up = matrix[l1-1][r2];

//         if(l1 >=1 && r1>=1)  
//            leftup = matrix[l1-1][r1-1];

//         if(r1>=1   )   
//             left = matrix[l2][r1-1];




//         sum = sum-up-left+leftup;


//         return ans;

//     }

    
//     public static void main(String[] args) {
//         int[][] matrix = {{1 , 2,3},   { 2 , 1 ,1}, { 3 , 2, 1}};

//         int l1 = 0, l2 = 2, r1 = 0, r2 = 2;

//         System.out.println(rectangleSum5(matrix, l1, r1, l2, r2));
        
//     }
// }




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



public class practice_array{


    
    static void printMatrix(int[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
        

    static int[][] pascalTr(int n){
        int[][] ans = new int[n][];

        for(int i =0; i<n; i++){
            ans[i] = new int[i+1];

            
            ans[i][0] = ans[i][i] =1;

            for(int j =1; j<i;j++){
                ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;

      


    }

    static void prevSum(int[]arr){
        
        for(int i =1; i<arr.length; i++){
            arr[i]= arr[i]+arr[i-1];

        }
    }

// stock & cell buy - ll

    static int maxProfitII(int[]arr){
        
        int maxProf = 0;

        for(int i=1; i<arr.length; i++){

            if(arr[i]>arr[i-1]){
                maxProf+=arr[i]-arr[i-1];

            }
        }


        return maxProf;
    }
  
// stock & cell buy

    static int maxProfit(int[]arr){
        int maxProf = 0;

        int minBuy = arr[0];

        for(int i =0; i<arr.length; i++){
            minBuy = Math.min(minBuy, arr[i]);

            int profit = arr[i]- minBuy;

            maxProf = Math.max(maxProf, profit);
        }
// tc = o(n) , space constant = o(1)

        return maxProf;
    }
    static int[] plusone(int[] num){
        int n = num.length;

        for(int i =n-1; i>=0; i--){
            if(num[i]<9){
                num[i]++;
                return num;
            }
            num[i] =0;
        }

        int[]newNum = new int[n+1];
        newNum[0] =1;
        return newNum;
    }
    public static void main(String[] args) {
        // int[] num = { 1,2,3,4};
        // System.out.println(Arrays.toString(plusone(num)));
        
        // int[]ans = plusone(num);
        // for(int i =0; i<num.length; i++){
        //     System.out.print(num[i]+" ");
        // }

        // int[]arr = { 5,2,6,1,4};
        // System.out.println(maxProfit(arr));

        // int []arr = { 5,2,6,1,4,7,3,6};
        // System.out.println(maxProfitII(arr));

        // int[]arr ={ 4,5,6,7};
        // prevSum(arr);
        // for(int i =0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }


        int[][] ans = pascalTr(5);
        
// // PRINT THE MATRIX


    }
}














































