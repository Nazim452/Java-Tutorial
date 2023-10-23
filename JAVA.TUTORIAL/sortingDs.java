import java.util.*;
// public class sortingDs {

//     static void insertionSort2(int[]arr){
//         int n = arr.length;

//         for(int i = 1; i<n; i++){
//             int j = i;

//             while(j>0 && arr[j]  >arr[j-1]){

//                 int temp = arr[j];
//                 arr[j]= arr[j-1];
//                 arr[j-1] = temp;
//                 j--;
//             }

//         }
//     }

//     static void  insertionSort(int []arr){

//         int n = arr.length;

//         for(int i =1; i<n; i++){

//             int j = i;

//             while(j>0 && arr[j]<arr[j-1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j-1];
//                 arr[j-1] = temp;

//                 j--;
//             }
//         }
//     }

//     static void selectionSort(int []arr){

//         int n = arr.length;

//         for(int i = 0; i<=n-2; i++){

//             int minINdex = i;       // i - current element        TC - n

//             for(int j = i+1; j<n; j++){     // pure aaray traverse for find min value

//                 if(arr[j]<arr[minINdex]){// tc - n
//                     minINdex= j;
//                 }

//             }

//             // swap current elemnt & minm index

//             int temp = arr[i];
//             arr[i] = arr[minINdex];
//             arr[minINdex]=temp;
//         }
//     }

// // Sc - O(n^2)
//     static void bubblleSort(int[]arr){
//         for(int i = 0; i<arr.length; i++){

//             boolean flag = false;  //  i ke iteration ko check karne ke liye ki i ka iteration ho ya n

// // har ek i ke baad ham janna chahte hai ki iteration hua hai ya nahi

//             for(int j= 0; j<arr.length-i-1; j++){   // for swapping -
//                                       // j - loop - last i element is already sorted , no need to check

//                 if(arr[j]>arr[j+1]){

//                     int temp = arr[j];
//                     arr[j]= arr[j+1];
//                     arr[j+1] = temp;

//                     flag = true;
//                 }

//             }

//             if(flag==false){
//                 return;
//             }
//         }
//     }

// // TC - O(n^2😂😂💔)
// // SC - (1)
//     public static void main(String[] args) {
//         int[]arr = { 45, 3,24,89,5};

//        // bubblleSort(arr);

//        //selectionSort(arr);
//        insertionSort2(arr);

        // for(int i :arr){
        //     System.out.print(i+" ");
        // }

//     }

// }

// public class sortingDs{

    // static void merge(int[]arr, int l, int mid, int r){

    //     int n1 = mid-l+1;      // size of left array , divided by recursion

    //     int n2 = r-mid;        // size of right  array , divided by recursion

    //     int[]left = new int[n1];
    //     int[] right = new int[n2];

    //     int i , j ,k;

    //     // smajha n  aaya sala

    //     for( i = 0; i<n1; i++) left[i] = arr[l+i];   // for fill the elem in right arr

    //     for(j = 0; j<n2; j++) right[j] = arr[mid + 1+j];

    //     i =0;     //   left ke 0th index ko point kar raha
    //     j=0;      //   right ke 0th index ko point kar raha
    //     k=l;       // k array ke 0th index ko indicate karega

    //     while(i<n1 && j<n2){
    //         if(left[i]<=right[j]){
    //             arr[k++] = left[i++];
    //         }else{
    //             arr[k++] = right[j++];
    //         }

    //     }

    //     while(i<n1){
    //         arr[k++] = left[i++];
    //     }
    //     while(i<n2){
    //         arr[k++] = right[j++];

    //     }

    // }

//     static void mergeSort(int []arr, int l, int r){

//         if(l>=r) return;     // if single value of array the n return

//         int mid = (l+r)/2;

//         mergeSort(arr, l, mid);

//         mergeSort(arr,mid+1, r);

//         merge(arr,l,mid,r);   // dono sotred sub array ko merge karne ka kam

// // tc - O(nlogn)
// //SC -O(n)
// // stable - yes

//     }

// // NOT WOKING

//     static void sorting_String(String[] fruit){
//         for(int i = 0; i<fruit.length-1; i++){

//             int min_Index = i;

//             for(int j = i+1; j<fruit.length; j++){

//                 if(fruit[j].compareTo(fruit[min_Index])<0){

//                     min_Index = j;

//                 }
//             }

//             String temp = fruit[i];
//             fruit[i] = fruit[min_Index];
//             fruit[min_Index] = temp;
//         }
//     }

// // input  - 5 0 7 0 6 0
// // output - 5 7 6 0 0 0 

//     static void zeroesGOAfter(int[]arr){

//         for(int i = 0; i<arr.length-1; i++){

//             boolean flag = false;

//             for(int j = 0; j<arr.length-i-1; j++){  // last i element is already sorted
//                 if(arr[j]==0 && arr[j+1]!=0){

//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                     flag = true;

//                 } 
//             }
//             if(flag == false){
//                 return;
//             }
//         }

//     }
//     public static void main(String[] args) {
//         // int [] arr = { 2,5,0,9,0,5,0,2,0,1};

//         // zeroesGOAfter(arr);
//         // for(int elem : arr){
//         //     System.out.print(elem+ " ");
//         // }

//         // String []fruit = {  " orange","apple", "papaya","banana"};
//         // sorting_String(fruit);
//         // for(String val:fruit){
//         //     System.out.print(val + " ");
//         // }

//         int []arr= { 3,9,8,2,6,4,7};
//         mergeSort(arr, 0, arr.length-1);

//         for(int elem:arr){
//             System.out.print(elem+ " ");
//         }

//     }
// }

// samjah na aaya  quick sort algo

// quick sort algo

// public class sortingDs{
//     static int partition(int[]arr, int st, int end){

//         int pivot = arr[st];

//         int count = 0;
//         for(int i = st+1; i<=end; i++){
//             if(arr[i]<=pivot) count++;

//         }
//         int pivotIndex= st+count;
//         swap(arr,st, pivotIndex);

//         int i =st, j = end;

//         while(i<pivotIndex&& j>pivotIndex){
//             while(arr[i]<=pivot) i++;     // = means duplicate elem ko pahle rakh rahe ha
//             while(arr[j]>pivot) j--;

//             // leeser - left,  greater - right

//             if(i<pivotIndex&&j>pivotIndex){
//                 swap(arr, i, j);
//                 i++;
//                 j--;

//             }

//         }
//         return pivotIndex;
//     }

//     static void quickSort(int []arr, int st, int end){
//         if(st>=end) return;

//         int pi = partition(arr,st,end);

//         quickSort(arr, st, pi-1);
//         quickSort(arr, pi+1, end);

//     }
// // stable - not
// // Sc- for avg/best - log n       -- due to implicit case
// // Sc - for worst case - n
//     static void swap(int []arr, int x, int y){
//         int temp = arr[x];
//         arr[x] = arr[y];
//         arr[y] = temp;
//     }
//     public static void main(String[] args) {
//         int[]arr = { 6,3,1,1,5,5,4};

//       quickSort(arr, 0,arr.length-1);

//         for(int elem :arr){
//             System.out.println(elem);
//         }

//     }
// }

// COUNT SORT 

// isme stability nahi hai
// // it means duplicate elem kis position par aa raha hai papta n chal rah ahai

// public class sortingDs{
//     static int findMax(int[]arr){
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     static void countSort(int[]arr){
//         int maximum = findMax(arr);

//         int []count = new int[maximum+1];

//         for(int i = 0; i<arr.length; i++){
//             count[arr[i]]++;
//         }

//         int k = 0; 
//         for(int i = 0; i<count.length; i++){
//             for(int j = 0; j<count[i]; j++){
//                 arr[k++] = i;

//             }
//         }
//     }
// // isme stability nahi hai
// // it means duplicate elem kis position par aa raha hai papta n chal rah ahai
//     public static void main(String[] args) {
//         int []arr = {3,2,8,5,4};
//         countSort(arr);
//         for(int elem:arr){
//             System.out.print(elem+ " ");
//         }

//     }
// }

// count sort with stability

// public class sortingDs{
//         static int findMax(int[]arr){
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     static void countSort2(int []arr, int place){

//         int n = arr.length;
//         int[]output = new int[n]; // sc - n

//         int []count = new int[10];  

//         for(int i = 0; i<arr.length; i++){   // TC - n
//             count[(arr[i]/place)%10]++;
//         }

//         // make prefix sum array of count - prefix sum me index rahta hai ki kis elem ko kis 
//         // particular index par rakhna hai

//         for(int i = 1; i<count.length; i++){     // TC - max ---k 
//             count[i]+=count[i-1];
//         }

//         // find the index of each elemnt in the original arry &put in output array

//         // travese back for maintain stability

//         for(int i = n-1; i>=0; i--){   // tC = n

//             int index = count[(arr[i]/place)%10] -1;  //  count[arr[i]] -- isse hame position pata & 1- se index
//             output[index] = arr[i];
//             count[(arr[i]/place)%10]--;

//         }

//           // copy all elem of output to array
//           for(int i = 0; i<n; i++){
//             arr[i] = output[i];
//           }

//     }

// static void countSort(int[]arr){
//    int maximum = findMax(arr);

//     int []count = new int[maximum+1];

//     for(int i = 0; i<arr.length; i++){
//         count[arr[i]]++;
//     }

//     int k = 0; 
//     for(int i = 0; i<count.length; i++){
//         for(int j = 0; j<count[i]; j++){
//             arr[k++] = i;

//         }
//     }
// }

//     static void stabilityCountSort(int[]arr){
//         int n = arr.length;
//         int[]output = new int[n]; // sc - n

//         int maximum = findMax(arr);

//         int []count = new int[maximum+1];   //SC - max---k

//         for(int i = 0; i<arr.length; i++){   // TC - n
//             count[arr[i]]++;
//         }

//         // make prefix sum array of count - prefix sum me index rahta hai ki kis elem ko kis 
//         // particular index par rakhna hai

//         for(int i = 1; i<count.length; i++){     // TC - max ---k 
//             count[i]+=count[i-1];
//         }

//         // find the index of each elemnt in the original arry &put in output array

//         // travese back for maintain stability

//         for(int i = n-1; i>=0; i--){   // tC = n

//             int index = count[arr[i]] -1;  //  count[arr[i]] -- isse hame position pata & 1- se index
//             output[index] = arr[i];
//             count[arr[i]]--;

//         }

//           // copy all elem of output to array
//           for(int i = 0; i<n; i++){
//             arr[i] = output[i];
//           }

//     }
// // TC - O(n+k)  k - max  for best case if max elem is 1 then O(n)
// //Sc - O(n+k)  ---- outlplace
// under certain condition  TC - (n)
// 1st count no of digit in array  --then put correct position

// radix sort - 1st arrange ones place then ten place then 100.....

//     static void radixSort(int []arr){
//         int maximum = findMax(arr);

//         for(int place = 1; maximum/place>0; place*=10){
//             countSort2(arr, place);

//         }

//     }
// // TC - d(n+k)    but i this case k has maximum 10 value - cons   TC- dn - where d -no of digit
// //SC - n
// // outplace
//     public static void main(String[] args) {
//         int []arr = { 5,3,8,2,3,5};
//         //stabilityCountSort(arr);
//         radixSort(arr);
//         for(int elem:arr){
//             System.out.println(elem);
//         }

//     }
// }

// bucket sort

// public class sortingDs{

//     static void bucketSort(float[]arr){
//         int n = arr.length;

//         // bucket    -- ke ansdar elem hai isliye inside the array make arraylist

//         ArrayList<Float>[]buckets = new ArrayList[n];

//         // create empty bucket

//         for(int i = 0; i<n; i++){
//             buckets[i] = new ArrayList<Float>();
//         }

//         // add elem into buckets

//         for(int i = 0; i<n; i++){
//             int bucketIndex = (int)arr[i]*n;
//             buckets[bucketIndex].add(arr[i]);

//         }

//         // sort each bucket individually

//         for(int i = 0; i<buckets.length; i++){
//             Collections.sort(buckets[i]);

//         }

//         // merge all bucket to get final sorted array

//         int index = 0;

//         for(int i = 0; i<buckets.length; i++){
//             ArrayList<Float> currBucket = buckets[i];

//             for(int j = 0; j<currBucket.size(); j++){
//                 arr[index++] = currBucket.get(j);
//             }
//         }

//     }

// // B C  TC - n+k   -- all bucket mr unifiorally elem aa jaye
// // W c TC - n^2   -- jab ek hi bucket me all element aa jaye - worst case
//     public static void main(String[] args) {
//         float []arr = { 0.42f, 0.65f, 0.32f, 0.12f, 0.45f};
//         bucketSort(arr);
//         for(float elem:arr){
//             System.out.println(elem);
//         }

//     }
// }

public class sortingDs {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    static void sort012___2(int[] arr) {
        // it occurs in only pass

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

    }
    // TC - O(n) SC - O(1)

    static void sort012(int[] arr) {
        int count_0 = 0, count_1 = 0, count_2 = 0;

        for (int i : arr) {
            if (i == 0) {
                count_0++;
            } else if (i == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }
        int k = 0;
        while (count_0 > 0) {
            arr[k++] = 0;
            count_0--;

        }
        while (count_1 > 0) {
            arr[k++] = 1;
            count_1--;
        }
        while (count_2 > 0) {
            arr[k++] = 2;
            count_2--;

        }

        // but it take TC - O(n) & SC - O(1)
        // it occurs in 2 pass not best
        // 2nd way is discussed above in only one pass

    }
    /*
     * input = { 12,-7,4,-3}
     * o?p = { -7,-3, 12, 4}
     * in lineaar time & constant space
     */

    static void negPosSorting(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (arr[l] < 0)
                l++; // = means 0 consider in negative side
            while (arr[r] >= 0)
                r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    /*
     * input arr = { 10,5,6,7,8,9,3}
     * only any 2 elem is swap in sorting array
     * or mission sort this two elem by sapping
     */

    static void sortArray(int[] arr) {

        int x = -1, y = -1;

        if (arr.length == 1)
            return; // corner case handle extra point

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) { // 1st conflict
                    x = i - 1;
                    y = i;
                } else {
                    y = i; // 2nd conflict
                }
            }
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void main(String[] args) {
        // int []arr = { 10,8,7,4,3};
        // int []arr = {-13,20,7,0,-4,-13,11,-5,-13};
        // negPosSorting(arr);
        // for(int elem: arr){
        // System.out.println(elem);

        // }

        int[] arr = { 0, 2, 2, 1, 1, 0, 2, 1, 0 };
        sort012___2(arr);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

}
