public class practice_array2 {

    static int[] productExItself(int[]arr){
        int n = arr.length;

        int[] prefix_Prod_st = new int[n] , prefix_Prod_End = new int [n];
        int [] res = new int [n];


        prefix_Prod_st[0] = arr[0];
        for(int i =1; i<n; i++){
            prefix_Prod_st[i]= prefix_Prod_st[i-1]*arr[i];
        }


        prefix_Prod_End[n-1] = arr[n-1];
        for(int i=n-2; n>=0; i--){
            prefix_Prod_End[i]= prefix_Prod_End[i+1]*arr[i];
        }



        res[0] = prefix_Prod_End[1];
        res[n-1] = prefix_Prod_st[n-2];

        for(int i =1; i<=n-1; i++){
            res[i] = prefix_Prod_st[i-1]* prefix_Prod_End[i+1];
        }

        return res;
    }

    
// PRINT THE MATRIX


    static void printMatrix(int[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
     static  int[][]  pascal5(int n){
        int[][]ans = new int [n][];

        for(int i =0; i<n; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] =1;

            for(int j =1; j<i; j++){
                ans[i][j] = ans[i-1][j]+ ans[i-1][j-1];

            }
         

        }
        return ans;
    }

    
    static int[][] pascla( int n){
        int[][] ans = new int [n][];

     
        for(int i=0; i<n;i++){
               // ith row has i+1 column

            ans[i] = new int[i+1];     // jagged array  , if we column decide later

            // 1st & last element of array is 1

            ans[i][0] = ans[i][i] = 1;     //[i[0] - for intial put 1 --- [i][i] -- for last put1

            for(int j = 1; j<i; j++){
                ans[i][j] = ans[i-1][j]+ ans[i-1][j-1];
            }


        }
        return ans;

        
    }

    public static void main(String[] args) {
        // int [][] ans = pascal5(5);
        // printMatrix(ans);
        int[]arr = { 3,4,5,6};

        int[] res = productExItself(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
        
    }
    
}
