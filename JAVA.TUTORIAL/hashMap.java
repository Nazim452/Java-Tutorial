import java.util.*;

// public class hashMap {
//     public static void main(String[] args) {


    



// // FIND MOST FREQ ELEM


//     //     int[]arr = { 1, 3,4,3,3,3,5,6,6,5,7,8,8};

//     //     Map<Integer, Integer> freq = new HashMap<>();
//     //     for(int el: arr){ 
//     //         if(!freq.containsKey(el)){
//     //             freq.put(el, 1);
//     //         }else{
//     //             freq.put(el, freq.get(el)+1);
//     //         }
//     //     }
//     //     System.out.println(freq.entrySet());
//     //     int mxFreq = 0, ansKey = -1;

//     //     // for(var e:freq.entrySet()){
//     //     //     if(e.getValue()>mxFreq){
//     //     //         mxFreq = e.getValue();
//     //     //         ansKey = e.getKey();

//     //     //     }
//     //     // }

//     //     // 2nd way of iterating

//     //     for(var key:freq.keySet()){
//     //         if(freq.get(key)>mxFreq){
//     //             mxFreq = freq.get(key);
//     //             ansKey = key;
//     //         }
//     //     }
        
//     //     System.out.println(ansKey);
//     // System.out.printf("%d has maximum freq & it occurs %d times ", ansKey, mxFreq);
        
        
//     }
    
// }








//   OWN HASHMAP




// public class hashMap{
//     static class  myHashMap<K , V>{
//         public static final int DEFAULT_CAPACIT = 4;
//         public static final float DEFAILT_LOAD_FACTOR = 0.75F;

//         private class node{
//             K key;
//             V value;

//             node(K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n ;

//         private LinkedList<node> [] bucket;   // made bucket array

//         // put empty LL in in each bucket

//         private void initBucket(int N){     // N - size of bucket array
//             bucket = new LinkedList[N];

//             for(int i  = 0;i< bucket.length; i++){
//                 bucket[i]  = new LinkedList<>();

//             }

//         }

//         private int hashFun(K key){
//             int hc = key.hashCode();   // give hash value

//             return (Math.abs(hc))% bucket.length;   /// found index of bucket
//         }

//         private int serch_in_bucket(LinkedList<node> ll, K key){
//             for(int i= 0; i<ll.size(); i++){
//                 if(ll.get(i).key == key){
//                     return i;
//                 }

//             }
//             return -1;
//         }



//         // rehashing 


//         private void rehash(){

//             LinkedList<node>[] old_bucket = bucket;
//             n = 0;
//             initBucket(old_bucket.length*2);

//             for(var bucket: old_bucket){    // traverse in old bucket
//                 for(var node:bucket){         // traverse nod eog each bucket
//                     put(node.key, node.value);
//                 }
//             }

//         }

//         // check capacity after rehashing

//         public int capacity(){
//             return bucket.length;
//         }

        
//         // check load factor after rehashing

//         public float loadfactor(){
//             return (n*1.0f) /bucket.length;  // load factor  = thresold value?capcity

//         }



//         public myHashMap(){
//             initBucket(DEFAULT_CAPACIT);
//         }

//         public int size(){
//             return n;
//         }



//         public void put(K key, V value){    // INSERT & UPDATE
//             int bi = hashFun(key);
//             LinkedList<node> currBucket = bucket[bi];

//             int ei = serch_in_bucket(currBucket, key);

//             if(ei==-1){    // key not exist

//                 node Node = new node(key, value);
//                 currBucket.add(Node);
//                 n++;
//             }else{    // update case

//                 node currrNode = currBucket.get(ei);
//                 currrNode.value = value;   // update value


//             }


//             // rehashing  
//             if(n>=bucket.length*DEFAILT_LOAD_FACTOR){   // thresold value = capacity * load factor

//                 // if  value greater than thresold value  size double
//                 rehash();
//             }

//         }


//         public V get(K key){
//             int bi = hashFun(key);
//             LinkedList<node> currBucket = bucket[bi];

//             int ei = serch_in_bucket(currBucket, key);

//             if(ei!= -1){    // KEY EXIST

//                 node currrNode = currBucket.get(ei);
//                 return  currrNode.value;


//             }
//             // key no 

//             return null;



//         }



//         public V remove(K key){
//              int bi = hashFun(key);
//             LinkedList<node> currBucket = bucket[bi];

//             int ei = serch_in_bucket(currBucket, key);

//             if(ei!=-1){
//                 node currrNode = currBucket.get(ei);
//                 V val = currrNode.value;
//                 currBucket.remove(ei);
//                 n--;
//                 return val;
                
//             }

//             // key not
//         return null;



//         }
//     }
//     public static void main(String[] args) {

//         myHashMap<String ,Integer> mp = new myHashMap<>();
//         mp.put("a", 1);
//         mp.put("b", 2);

//         System.out.println("capcit"+ mp.capacity());   //4
//         System.out.println("Load Factor"+ mp.loadfactor());//<0.75f
//         mp.put("c", 3);
//         mp.put("d",4 );
//         mp.put("e", 5);
        

//         // System.out.println(mp.size());  //3
//         // System.out.println(mp.get("c"));  //3
//         // System.out.println(mp.get("g"));  // 1
//         // System.out.println(mp.remove("a"));  // null


//         // mp.remove("a");
//         // System.out.println(mp.size()); //2
//         System.out.println(mp.get("e")); // 5
        
//         System.out.println("capcit  "+ mp.capacity());  //8
//         System.out.println("Load Factor"+ mp.loadfactor());//<0.75
        
        

//     }
// }






// VALID ANAGRAM








public class hashMap{

    static int maxNumberOnTable(int[]bag){
        int max = 0;
        HashSet<Integer> st = new HashSet<>(); // table


        for(int i = 0; i<bag.length; i++){
            int num = bag[i];

            if(st.contains(num)){
                st.remove(num);
            }else{
                st.add(num);
            }
            max = Math.max(max,st.size());
        }


        return max;

    }




// FIND CONSECUTIVE MAXIMUM IN ARRAY




    public static int consecutive(int[]arr){
        int maxStreak = 0;

        HashSet<Integer> st = new HashSet<>();
        for(int num:arr) st.add(num);
       

        for(var num:st ){
             
            if(!st.contains(num-1)){
                int currNum = num;

                int currStreak = 1;  // length of consecutive seq

                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                
                }
                maxStreak = Math.max(currStreak, maxStreak);
                
            }
           
        }
        return maxStreak;
    }




// LARGEST SUBaRRAY WITH 0 SUM - GFF



    public static int largestSubArray(int[]arr, int n){
        int prefSum= 0, maxLen = 0;

        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0, -1);

        for(int i =0; i<n; i++){
            prefSum+=arr[i];

            if(mp.containsKey(prefSum)){
                Math.max(maxLen, i-mp.get(prefSum));
            }
            else{
                mp.put(prefSum, i);
            }
        }
        return maxLen;
    }


// TWO SUM LEETCODE PROBLEM 1

    public static int[] twoSum(int[]arr, int tar){
        int[]ans = { -1};
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int partner = tar-arr[i];

            if(mp.containsKey(partner)){
                ans = new int[]{i, mp.get(partner)};
            }
            else{
                mp.put(arr[i],i);
            }
        }

        return ans;

    }
    


// CHECK ISIOMORPHIC


    public static boolean Isisomorphic(String s, String t){
        HashMap<Character, Character> mp = new HashMap<>();

        for(int i = 0; i<s.length(); i++){

            char sCH = s.charAt(i);
            char tCH = t.charAt(i);

            if(mp.containsKey(sCH)){

                if(mp.get(sCH)!=tCH){
                    return false;
                }
               
            }
             else if(mp.containsValue(tCH)){
                    return false;
            }else{

                mp.put(sCH, tCH);
                }

        }
        return true;
    }



// ANAGRAM PROBLEM



    static HashMap<Character, Integer> make_freq_string(String s){
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }

    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1 = make_freq_string(s);
         HashMap<Character,Integer> mp2 = make_freq_string(t);
        return  mp1.equals(mp2);

    } 


    
    public static boolean isAnagram1(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp = make_freq_string(s);

        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(!mp.containsKey(ch)) return false;
            int currFreq = mp.get(ch);
            mp.put(ch, currFreq-1);
        }

        for(var i:mp.values()){
            if(i!=0){
                return false;
            }

        }
        return true;
      
    } 
 
    public static void main(String[] args) {
        int []bag = { 1,1};
       System.out.println( maxNumberOnTable(bag));

        
    }
}





