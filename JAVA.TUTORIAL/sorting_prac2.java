public class sorting_prac2 {
    
    static int sqrt(int x){
        int st = 0, end =x;
        int ans = -1;

        while(st<=end){
            int mid = st+(end-st)/2;
            
            int val = mid*mid;
            if(val==x) return mid;

            else if(val>x){
                end = mid-1;
            }else{
                st =mid+1;
                ans = mid;
            }
        }
        return ans;

    }
    static int lastOccurance2(int[]arr, int x){
        int ans =-1;

        int st =0, end = arr.length-1;

        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==x){
                st=mid+1;
                ans = mid;
            }else if(arr[mid]<x){
                st = mid+1;
            }else{
                end =mid-1;

            }
        }

        return ans;

    }
    static int findOccurance(int[]arr, int x){
        int ans = -1;

        int st=0, end = arr.length-1; 

        while(st<=end){
            int mid =(st+end)/2;
            if(arr[mid]==x){
                ans = mid;
                end = mid-1;
            }else if(arr[mid]<x){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }



        return ans;
    }
    static void sort012_2(int[]arr){
        int low=0, mid=0, high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid,low);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;

            }
        }
    }
    static void sort012(int[]arr){
        int count_0=0;
        int count_1 = 0;
        int count_2 = 0;
        int k =0;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==0)  count_0++;

            if(arr[i]==1) count_1++;

            if(arr[i]==2) count_2++;
        }
   
       

    while(count_0>0){
        arr[k++] = 0;
        count_0--;
    }
    while(count_1>0){
       arr[k++] = 1;
        count_1--;
    }
    while(count_2>0){
        arr[k++] = 2;
        count_2--;
    }

        

    }
    static void moveNeg(int[]arr){
        int l =0, r =arr.length-1;

        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>0) r--;

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }


    }
    static void incr(int[]arr){
        
        int x =-1, y=-1;
        if(arr.length<=1) return;

        for(int i =1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                if( x==-1){
                    x=i-1;
                    y=i;
                }else{
                    y=i;
                }
            }

        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }  
    static void swap(int[]arr, int x, int y){

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[]arr,int st, int end){
        int pivot = arr[st];
        int less_than_pi=0;
        for(int i =st+1; i<=end; i++){
            if(arr[i]<=pivot) less_than_pi++;
        }

        int pi= st+less_than_pi;
        swap(arr, st, pi);  // pivot index reach in own position

        int i =st;
        int j= end;

        while(i<pi&& j>pi){
            while(arr[i]<=pivot) i++;

            while(arr[j]>pivot)  j--;

            if(i<pi  &&j>pi){
                swap(arr, i, j);
                i++;
                j--;
            }
        }


        


        return pi;


    }
    static void quickSort(int[]arr, int st, int end){
        if(st>=end) return;
        int pi=partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
   
       
   
    public static void main(String[] args) {
        // int[]arr = { 4,4,6,6,6,7,8};
        // System.out.println(findOccurance(arr, 3));

        System.out.println(sqrt(11));

       
       
        
        
    }
    
}

