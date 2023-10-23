

// public class binarySearch {



    
// ar r= { 2,3,5,5,5,6,6,7} , what is the first occurance of 5 , give index no
// ans = 2






//     static int firstOccurance(int[]arr, int x){
//         int st = 0, end = arr.length-1;
//         int mid = st+(end-st)/2;
//         int firstOcc = -1;

//         while(st<=end){
//             if(arr[mid] ==x){
//                 firstOcc = mid;
//                 end = mid-1;


//             }else if(arr[mid]>x){
//                 end = mid-1;
//             }else{
//                 st = mid+1;
//             }
//         }
//         return firstOcc;
//     }

   

// // binary search by recursively

//     static boolean binarySearchR(int[]arr, int st, int end , int target){
//         if(st>end) return false;

//         int mid = (st+end)/2;

//        if(target==arr[mid]){
//         return true;
//        }else if(target<arr[mid]){

//          return binarySearchR(arr, st,mid-1, target);
//        }else{
         
//          return  binarySearchR(arr,mid+1, end, target);
//        }
       



//     }

// // TC _- O(log n)
// // SC _ O(log  n)




//     static boolean binarySearch(int []arr, int target ){
//         int st = 0; int end = arr.length-1;
//         int mid = st+(end-st)/2;

//         while(st<=end){
//             if(target==arr[mid]){
//                 return true;
//             }else if(target<arr[mid]){
//                 end = mid-1;
//             }else{
//                 st = mid+1;
//             }
//         }
//         return false;
// // TC - O(n)
// // SC - (1)
      
//     }
//     public static void main(String[] args) {
//         int[]arr = { 2,5,5 ,6, 6, 7,7,9};
//         System.out.println(binarySearch(arr, 05));
//        // System.out.println(binarySearchR(arr, 0, arr.length-1, 9));
//        //int x = 5;
//        //System.out.println(firstOccurance(arr, x));
       
      
       
        
//     }
    
// }

// public class binarySearch{


//         static int firstOccurance(int[]arr, int x){
//         int st = 0, end = arr.length-1;
//         int mid = st+(end-st)/2;
//         int firstOcc = -1;

//         while(st<=end){
//             if(arr[mid] ==x){
//                 firstOcc = mid;
//                 end = mid-1;


//             }else if(arr[mid]>x){
//                 end = mid-1;
//             }else{
//                 st = mid+1;
//             }
//         }
//         return firstOcc;
//     }

//     public static void main(String[] args) {
//         int[]arr = { 3,4,5,5,5,6,7,7,7};
//         System.out.println(firstOccurance(arr, 5));
        
       
    
//     }
// }




// public class binarySearch{



// // find index of min value in rotated array


//     static int  minIndRotated(int[]arr){// 3 , 4, 5 , 1 ,2
//        int n = arr.length;
//        int st = 0;
//        int end = n-1;
       
//        int ans = -1;

//        while(st<=end){
//         int mid = st+(end-st)/2;
//         if(arr[mid]>arr[n-1]){
//             st = mid+1;

//         }else if(arr[mid]<=arr[n-1]){
//             end = mid-1;
//             ans = mid;

//         }

//        }
//        return ans;

//     } 

// //TC - log n


//     static int sqrt(int x){
      
//         int st = 0 ,end =x;
//         int ans  = -1;
//         while(st<=end){
//          int mid = st+(end-st)/2;
//          int val = mid*mid;
 
//          if(val==x){
//              return mid;
//          }else if(val<x){
//              ans= mid;
//              st = mid+1;
             
//          }else{
//              end = mid-1;
//          }
 
         
//         } 
//         return ans;
 
//     }    
//     public static void main(String[] args) {
//        // System.out.println(sqrt(25));
//        int[]arr = { 3,4,5,6,1,2
//     };
//        System.out.println(minIndRotated(arr));
        
//     }
// }











public class binarySearch{

    
// return the index of the taget int in rotated array - using bin search
// here 2 property of rotated array used
   

    static int findTarget(int[]arr, int target){

        int st = 0, end = arr.length-1;

        while(st<=end){

            int mid = st+(end-st)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(arr[mid]<end){           // mid to end sorted
                if(target<arr[mid] && target>=end){   // whether elem present btw mid to end or not
                    st = mid+1;
                }else{
                    end = mid-1;
                }

            } else{                              // st  to mid sorted
                if(target<arr[mid] && target>=st){     // ehether elem present btw the st to mid
                    end = mid-1;

                } else{
                     st = mid+1;
                }

                
            }         

        }
        return -1;

    }




// return the index of the taget int in rotated array - using bin search with duplicate elem
    static int findTarget_Dup(int[]arr, int target){

        int st = 0, end = arr.length-1;

        while(st<=end){

            int mid = st+(end-st)/2;

            if(target==arr[mid]){
                return mid;


            }
            else if(arr[st]==arr[mid] && arr[end]==mid){// remove dup elem
                st++;
                end--;
            }
            
            
            else if(arr[mid]<=end){           // mid to end sorted

                // here also equal to add bcz in eaual to condition pivot elem is not pres btw

                if(target<arr[mid] && target>=end){   // whether elem present btw mid to end or not
                    st = mid+1;
                }else{
                    end = mid-1;
                }

            } else{                              // st  to mid sorted
                if(target<arr[mid] && target>=st){     // ehether elem present btw the st to mid
                    end = mid-1;

                } else{
                     st = mid+1;
                }

            }         

        }
        return -1;

    }

    public static void main(String[] args) {
        int[]arr = { 1,1,1,2,2,3,1};
        int target = 3;
        System.out.println(findTarget_Dup(arr, target));
    }
}


































