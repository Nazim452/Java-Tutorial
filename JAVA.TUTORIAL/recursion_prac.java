
import java.util.ArrayList;



public class recursion_prac {

    static int pow(int p, int q){
        if(q>=0){
            return positive(p, q);
        }else
        return  negative(p, q);
        


            }

    static int positive(int p, int q){
        if(q==1) return p;

        int ans = pow(p, q/2);
        if(q%2==0){
            return ans*ans;
        }
        return ans*ans*p;
    }
    static int negative(int p, int q){
        if(q==-1) return 1/p;

        int smallAns = positive(p, q/2);
        if(q%2==0){
            return smallAns*smallAns;
        }
        return 1/p*smallAns*smallAns;
    }
    static void sum(int[]arr, int n, int index, int curren_Subset_sum){
        if(index>=n){
            System.out.println(curren_Subset_sum);
            return;
        }

        sum(arr, n, index+1, curren_Subset_sum+arr[index]);

        sum(arr, n, index+1, curren_Subset_sum);
    }
   
    static void subStr2(String s, String currAns){  // s= "abc" , curAns " "
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        String remString=s.substring(1); // bc

        // selct current elemnt
        subStr2(remString, currAns+s.charAt(0));  // bc    , a

        // do not select curr elem
        subStr2(remString, currAns);       // bc   ," "

    }
    
    static ArrayList<String> subStr(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }

        ArrayList<String> smallAns = subStr(s.substring(1 ));

        for(String ss: smallAns){
            ans.add(ss);
            ans.add(s.charAt(0)+ss);   // self work

        }
        return ans;

    }
    static boolean palindrome2(int[]arr, int leftIndx, int rightIndx){
        if(leftIndx>=rightIndx) return true;

        return (arr[leftIndx]==arr[rightIndx]  && palindrome2(arr, leftIndx+1, rightIndx-1));
    }
   
    static boolean palindrome(String s, int l, int r){
        if(l>=r) return true;

        return (s.charAt(l)==s.charAt(r)) && palindrome(s, l+1, r-1);

        
    }
    static String reverse(String s, int index){
        if(s.length()==index) return " ";

        String smallAns = reverse(s, index+1);

        return smallAns + s.charAt(index);

    }
    static String remove_A2(String s){
        if(s.length()==0) return " ";

        String smallAns = remove_A2(s.substring(1 ));

        if(s.charAt(0)!='a'){
            return s.charAt(0)+smallAns;
        }else{
            return smallAns;
        }
    }
  
    
    static String remove_A(String s, int index){
        if(index==s.length()) return " ";

        String smallAns = remove_A(s, index+1);

        if(s.charAt(index)!='a'){
            return  s.charAt(index)+smallAns;
        }else{
            return smallAns;
        }
    }
    
    
    static boolean isSorted(int[]arr, int index){
        if(index==arr.length-1) return true;

        if(arr[index]>arr[index+1]){
              return false;
        }

        if( isSorted(arr, index+1)==true){
            return true;

        }
        else{
            return false;
        }

       
    }
    static ArrayList<Integer> findTareguu(int[]arr, int n, int target, int index){
        ArrayList<Integer> ans = new ArrayList<>();

        if(index>=n) return ans;

        if(arr[index]==target){
            ans.add(index);
        }

        ArrayList<Integer> smallAns = findTareguu(arr, n, target, index+1);
        ans.addAll( smallAns);

        return ans;

    }

   
    static int fib(int n){
        if(n==0|| n==1){
            return n;
        }
        return fib(n-1)+ fib(n-2);

        // int prev = fib(n-1);
        // int prevPrev = fib(n-2);

        // int ans = prev+prevPrev;
        // return ans;
    }
    
    public static void main(String[] args) {
        // int[]arr = {2,3,2,4,3,5,6,2,7,2};
        

        // ArrayList<Integer> smallAns = findTareguu(arr, arr.length, 2, 0);

        // for(Integer elem: smallAns){
        //     System.out.println(elem);
        // }

        // int[]arr = { 2,3,4,5};
        // System.out.println(isSorted(arr, 0));

        //String s = "dad";
        //System.out.println(reverse(s, 0));
        // String rev = reverse(s, 0);
        // if(rev.equals(s)){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
       // System.out.println(palindrome(s, 0, s.length()-1));
       //int[]arr = { 1,2,1,1 };

       //  System.out.println(palindrome2(arr, 0, arr.length-1));
       //String s = " abc";

       //ArrayList<String> ans = subStr(s);
       //for(String ss:ans){
        //System.out.print(ss+" ");
        //int[]arr ={ 2,4,5};
        //}

       // sum(arr, arr.length, 0, 0);
        // for(int elem : arr){
        //     System.out.println(elem);
        // }
        System.out.println(pow(2, -2));
       
    }
    
}
