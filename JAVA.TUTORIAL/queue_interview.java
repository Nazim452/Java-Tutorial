import java.util.*;
// public class queue_interview {
//     public static void main(String[] args) {



// // REVERSE FIRST K ELEMENT IN QUEUE 



//         Stack<Integer> st = new Stack<>();
//         Queue<Integer> q = new LinkedList<>();
//         //int n =st.size();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         int k = 3;   // 3 2 1 4 5
//         System.out.println(q);

//         while(q.size()>=k){
//             st.push(q.remove());
//         }

//         while(st.size()>0){
//             q.add(st.pop());
//         }
//         for(int i = 0; i<q.size()-k; i++){
//             q.add(q.remove());
//         }

       
       

//         System.out.println(q);



        
        
//     }
    
// }






 // REORDER QUEUE
 

 public class queue_interview{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for(int i = 0; i<n/2; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }

        for(int i = 0; i<n/2; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        
        }

        // reverse the queue

        while(q.size()>0){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        System.out.println(q);


    }
 }










