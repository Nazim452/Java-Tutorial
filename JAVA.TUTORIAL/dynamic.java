import java.util.*;



//  MINIMUM COIN 
// GIVEN  n rupees toNEED TO FIND MIN NO OF COMBINATION TO MAKE n RUPPESS



// public class dynamic {
//     public static int minCoin2(int n, int[]a, int[]dp){

//         if(n==0) return 0;
//         int ans = Integer.MAX_VALUE;

//         for(int i = 0; i<a.length; i++){
//             if(n-a[i]>=0){
//                 int subans = 0;
//                 if(dp[n-a[i]]!=-1){
//                     subans = n-a[i];
//                 }else{
//                     subans = minCoin(n-a[i], a, dp);
//                 }
//                 if(subans!=Integer.MAX_VALUE&&subans+1<ans){
//                     ans = subans+1;

//                 }

                
//             }
//         }
//        dp[n] = ans;
//        return ans;
        

//     }
//     public static int minCoin(int n, int[]a, int[]dp){
//         if(n==0) return 0;
//         int ans = Integer.MAX_VALUE;
//         for (int i = 0; i < a.length; i++) {
//             if(n-a[i]>=0){
//                 int subans = 0;

//                 if(dp[n-a[i]]!=-1){
//                     subans = dp[n-a[i]];

//                 }
//                 else{
//                    subans =  minCoin(n-a[i], a, dp);
//                 }

//                 if(subans!=Integer.MAX_VALUE&&subans+1<ans){
//                     ans = subans+1;
//                 }
//             }


//         }
//         dp[n]= ans;
//         return ans;



//     }

//     public static void main(String[] args) {
//         int n = 18;
//         int[] a = { 7, 5, 1 };
//         int dp[] = new int[n + 1];
//         Arrays.fill(dp, -1);
//         dp[0] = 0;

//         System.out.println(minCoin2(n, a, dp));
        

//     }
// }








public class dynamic{
    public static  int dpKnapsack(int w,int[]val,int[] wt,int i){
        if(i==wt.length|| w==0) return 0;

        // if(memo[w][i]!=0) return memo[w][i];

        int op1 = val[i]+dpKnapsack(w-wt[i], val, wt, i+1);
        int op2 = dpKnapsack(w, val, wt, i+1);

        if(wt[i]<=w){
           
            return Math.max(op1, op2);

        }else{
            
            return op2;
        }
    }




    // public static  int dpKnapsack(int w,int[]val,int[] wt,int i,int[][]memo){
    //     if(i==wt.length|| w==0) return 0;

    //     if(memo[w][i]!=0) return memo[w][i];

    //     int op1 = val[i]+dpKnapsack(w-wt[i], val, wt, i+1, memo);
    //     int op2 = dpKnapsack(w, val, wt, i+1, memo);

    //     if(wt[i]<=w){
    //         memo[w][i] = Math.max(op1, op2);
    //         return Math.max(op1, op2);

    //     }else{
    //         memo[w][i] = op2;
    //         return op2;
    //     }
    // }
    public static void main(String[] args) {
        int[]val = {10,20,30,40};

        int[]wt = {30,10,40,20};
        int w = 40;
        int[][] memo = new int[val.length+1][w+1];
        // System.out.println(dpKnapsack(w, val, wt, 0, memo));
        System.out.println(dpKnapsack(w, val, wt,0));


        
        
    }
}

































