import java.util.*;

// public class queue {



// // LINKED LIST IMPLIMENTATION OF QUEUE


//     public static class node{
//         int data;
//         node next;

//         node(int data){
//             this.data = data;
//         }

        
//     }
//     public static class queueLL{
//         node head = null;
//         node tail = null;
//         int size =  0;

//         public void add(int x){
//             node temp = new node(x);
//             if(size ==0){
//                 head = tail = temp;
                
//             }else{
//                 tail.next = temp;
//                 tail = temp;
//             }
//             size++;
//         }
//         public int peek(){
//             if(size==0) return -1;

//             return head.data;
//         }

//         public int  remove(){
//             if(size==0) return -1;

//             int x = head.data;
//             head = head.next;
//             size--;
//             return x;


//         }
//         public void display(){
//             if(size==0) return;

//             node temp = head;
//             while(temp!=null){
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }

    

//     }  



// // ARRAY IMPLIMENTATION OF QUEUE



//     public static class queueArray{
//         int[]arr = new int [5];
//         int size = 0;
//         int f = -1;
//         int r = -1;

//         public void add(int val){
//             if(f== -1){
//                 r = f = 0;
//                 arr[0] =val;
//             }else{
//                 arr[++r] =val;
//                 size++;
//             }
            
//         }
//         public int remove(){
//             if(size==0) return-1;
//             f++;
//             size--;
//             return arr[f-1];

//         }
//         public int peek(){
//             if(size==0) return -1;
//             return arr[f];
//         }

//         public void display(){
//             if(size==0) return;
//             else{
//                 for(int i = f;i<=r; i++){
//                 System.out.print(arr[i]+ " ");
//             }

//             }
            
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         // Queue<Integer> q = new LinkedList<>();
//         // Queue<Integer> heleper = new LinkedList<>();

//         // queueArray q  = new queueArray();

//         queueLL q = new queueLL();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         //  rear - 5 4 3 2 1 - front



//         q.display();
//         System.out.println(q.peek());
//         q.remove();
//         q.display();

//         // while(q.size()>0){
//         //     System.out.print(q.peek()+" ");
//         //     heleper.add(q.remove());
//         // }

//         // helper se sare element q me dalo

//         // while(heleper.size()>0){
//         //     q.add(heleper.remove());
//         // }
        
//     }
    
// }




// ARRAY IMPLIMENTATION OF CICULAR QUEUE




        public class queue{
            public static class cir_Arr_List{
                int[]arr = new int[5];
                int size = 0;
                int n = arr.length;
                int f = -1;
                int r = -1;


                public void add(int val) throws Exception{
                    if(size==n){
                        throw  new Exception("Queue is full");

                    }
                    else if(r == -1){
                        f = r = 0;
                        arr[0] = val;

                    }
                    else if(r<n-1){
                        arr[++r] = val;
                    }
                    else if(r==n-1){
                        r = 0;
                        arr[0] = val;
                    }
                    size++;
                    

                }
                public int  remove() throws Exception{
                    if(size==0){
                        throw  new Exception("Queue is empty");
                    }
                    else{
                        int x = arr[f];
                        if(f==n-1) f = 0;
                        else f++;
                        size--;
                        return x;
                        
                        

                    }
                }

                public int peek()throws Exception{
                    if(size==0) {
                        throw new Exception("Queue is empty");
                    }
                    return arr[f];

                }

                public void display(){
                    if(size==0) {
                        System.out.println("Queue is empty");
                        return ;
                    }
                    else if(f<r){
                        for(int i =f; i<=r; i++){
                            System.out.print(arr[i]+" ");
                        }
                    }

                    else{  // f>r

                        for(int i =f; i<n; i++){
                            System.out.print(arr[i]+" ");
                        }

                        for(int i = 0; i<=r; i++){
                            System.out.print(arr[i]+" ");
                        }

                    }
                    System.out.println();
                }


                
            }
            public static void main(String[] args)throws Exception {
                cir_Arr_List q = new cir_Arr_List();

                 q.add(1);
                 q.add(2);
                 q.add(3);
                 q.add(4);
                 q.add(5);

                 q.display();  // 1 2 3 4 5
                 q.remove();
                 q.remove();
                 q.display();   // 3 4 5

                 q.add(12);
                 q.add(24); // 12 24 3 4 5
                 // 3 4 5 12 24
                 q.display();
                 q.add(36);
                 q.display();
                

                       
                
            }
        }























