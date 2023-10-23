import java.util.*;
// public class stack {


// // display recursively of stack


//     public static void display(Stack<Integer> st){
//         if(st.size()==0) return;
//         int top = st.pop();
//         display(st);
//         System.out.print(top+" ");
//         st.push(top);
//     }


// // push At BOTTOM



//     public static void pushAtBottom(Stack <Integer>st, int x){
//         if(st.size()==0){
//             st.push(x);
//             return;
//         }
//         int top = st.pop();
//         pushAtBottom(st, x);
//         st.push(top);

//     }



// // reverse of stack - recursvely



//     public static void reverse(Stack<Integer> st ){
//         if(st.size()==1) return;
//         int top = st.pop();
//         reverse(st);
//         pushAtBottom(st, top);
//     }
//     public static void main(String[] args) {
//         // Stack<Integer> st  = new Stack<>();
//         // st.push(1);
//         // st.push(2);
//         // st.push(3); 
//         // st.push(4);
        
//         //System.out.println(st.size());
//        // System.out.println(st.peek());

       
// //pick last  element


//     //    while(st.size()<1){
//     //     st.pop();
        
//     //    }
//     //    System.out.println(st.peek());



// // taking input from uer


//         //    Stack<Integer> st1 = new Stack<>(); 
//         //    Scanner sc = new Scanner(System.in);
//         //    System.out.println("How many elem you wants");
//         //    int n = sc.nextInt();

//         //    System.out.println("Enter no of element");

//         //    for(int i =1; i<=n; i++){
//         //     int x = sc.nextInt();
//         //     st1.push(x);
//         //    }
//         //    System.out.println(st1);
           
           

//  // copy stack in other stack in same order
              
 
//         // Stack<Integer> st  = new Stack<>();  
//         // st.push(1);
//         // st.push(2);
//         // st.push(3); 
//         // st.push(4);
//         // System.out.println(st);

//         // Stack<Integer> gt  = new Stack<>(); 
//         // while(st.size()>0){
//         //     gt.push(st.pop());
//         // } 
//         // System.out.println(gt);

//         // Stack<Integer> rt  = new Stack<>(); 
//         // while(gt.size()>0){
//         //     rt.push(gt.pop());
//         // }

//         // System.out.println(rt);


        

// // push elemnt in any index
   

       
//         Stack<Integer> st  = new Stack<>();  
//         st.push(1);
//         st.push(2);
//         st.push(3); 
//         st.push(4);
//         //System.out.println(st); 

//         //display(st);
//         reverse(st);
//         display(st);

//         Stack<Integer> gt  = new Stack<>(); 
        
//         // int index = 2;
//         // int x = 56;
//         // while(st.size()>index){
//         //     gt.push(st.pop());

//         // }
//         // st.push(x);

//         // while(gt.size()>0){
//         //     st.push(gt.pop());
//         // }

//         // System.out.println(st);
        
//     }
    
//}






//  IMPLIMENTATION OF ARRAY USING STACK




// public class stack{
//     public static class stak{
//         private int[]arr = new int[5];
//         int index= 0;

//         void push(int x){
//             arr[index] = x;
//             index++;

//         }
//         int pop(){
//             if(index==0){
//                 System.out.println("Empty stack");
//                 return -1;
//             }
//             int top= arr[index-1];
//             arr[index-1] = 0;
//             index--;
//             return top;
//         }

//         void display(){
//             for(int i =0; i<index; i++){
//                 System.out.print(arr[i]+" ");

//             }
//             System.out.println();
//         }

//         int peek(){
//             if(index==0){
//                 System.out.println("Empty stack");
//                 return-1;
//             }
//             return arr[index-1];
//         }
        
//         int size(){
//             return index;
//         }
//         boolean isEmpty(){
//             if(index==0) return true;
//             return false;
//         }

//     }
//     public static void main(String[] args) {
//         stak st = new stak();
//         st.push(3);
//         st.push(12);
//         st.push(45);
//         st.push(89);
//         st.display();
//         // st.pop();
//         // st.display();
//         // System.out.println(st.size());
//         // System.out.println(st.isEmpty());
//         System.out.println(st.peek());
        
//     }
// }






// LINKED LIST IMPLIMENTATION OF STACKS




public class stack{
    public static class node{
        int data;
        node next;
        node(int  data){
            this.data = data;
        }

    }
    public static class llstack{
        node head = null;
        int size = 0;
        
        void push(int x){
            node temp = new node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(size==0){
                System.out.println("empty stack");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
            
        }
        int  size(){
            return   size;
        }
        int peek(){
             if(size==0){
                System.out.println("empty stack");
                return -1;
            }
            return head.data;


        }
        void displ(node head){
            if(head==null) return;
            displ(head.next);
            System.out.print(head.data+" ");
        }
        void displayREcursively(){
            displ(head);
            System.out.println();

        }

    }
    public static void main(String[] args) {
        llstack st = new llstack();
        st.push(3);
        st.push(12);
        st.push(45);
        st.push(89);
        st.displayREcursively();
        

        st.pop();
        st.displayREcursively();
        System.out.println(st.size());
       // System.out.println(st.isEmpty());
        System.out.println(st.peek());
        
    }
}


















