// public class prrrrr {
   
//     static boolean search2d(int[][]arr,int m, int n, int target){
//         int st =0, end = m*n-1;

//         while(st<=end){
//             int mid = st+(end-st)/2;

//             int mid_elem = arr[mid/n][mid%n];
//             if(mid_elem==target) return true;

//             if(mid_elem<target){
//                 st = mid+1;
//             }else{
//                 end  = mid-1;
//             }

//         }
//         return false;

//     }
//     public static void main(String[] args) {
//         int[][]arr = {{1,3,5,7}, { 10,11,16,20}, { 23,30,34,60}};
//         System.out.println(search2d(arr, arr.length, arr[0].length, 35));
        
//     }
    
// }

public class prrrrr{
    static int gcd (int x, int y){
        if (y==0) return x;
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 24));
        
    }
}
