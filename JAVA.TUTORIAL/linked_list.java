// public class linked_list {
// // insertAt end in 0(n) time comp
//     public static void insertAtEnd(node head, int val){
//         node temp = new node(val);
//         node t = head;
//         while(t.next!=null){
//             t = t.next;
//         }
//         t.next = temp;
//     }

//     // display recursively

//     public static void display2(node head){
//         if(head==null)return;
//         System.out.print(head.data+" ");
//         display2(head.next);

//     }


//     // display recursively


//     public static void display(node head){
//         node temp = head;
//         while(temp!=null){
//              System.out.print(temp.data+" ");
//              temp = temp.next;

//         }
       
        
//     }
//     // find length

//     public static int length(node head){
//         int count =0;
//         node temp = head;
//         while(temp!=null){
//             count++;
//             temp = temp.next;

//         }


//         return count;
//     }
//     public static class node{
//         int data;     //value
//         node next;     // adress of next node
//         node(int data){
//             this.data=data;
//         } 

//     }
//     public static void main(String[] args) {
//         node a = new node(3);
//         node b = new node(5);
//         node c = new node(6);
//         node d = new node(8);
        
//         a.next = b;   // 'a' ke node me 'b' ka address
//         b.next = c;
//         c.next = d;

//         // System.out.println(a.next);                // print address of b
//         // System.out.println(a.next.data);   // data of next of a->b ka data

//         // DISPLAYING THE LINKED LLIST

//         //node temp =a;

//         // for(int i =1; i<4; i++){
//         //     System.out.print(temp.data+ " ");
//         //     temp = temp.next;

//         // }

//         // while(temp!=null){
//         //     System.out.print(temp.data+ " ");
//         //     temp = temp.next;
//         // }
//         insertAtEnd(a, 39);
//         display2(a);
//         //System.out.println(length(a));

        
        
       
        
//     }
    
// }







public class linked_list{
    public static class linked__list{
        node head = null;
        node tail = null;
        int size = 0;

        void insertAtEnd(int data){
            node temp = new node(data);
            if(head==null){
                head = temp;
               
            }else{
                tail.next = temp;

            }
            tail = temp;
            size++;


        }
        void insertAt_Head(int data){
            node temp = new node(data);
            if (head==null){
                head=tail=temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void deleteAt(int index){
            if(index==0) {
                head = head.next;
                size--;
                return;
            }
            node t = head;
            for(int i =1; i<index; i++){
                t = t.next;
            }
            t.next = t.next.next;
            tail = t;
            size--;
        }
        
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }

        }
        // int size(){
        //     int count = 0;
        //     while(head!=null){
        //         count++;
        //         head = head.next;
        //     }
        //     return count;
        // }
        void insert(int index, int data){
            node t = new node(data);
            node temp = head;
            if (index ==size){
                insertAtEnd(data);
                return;
            }
            else if(index==0){
                insertAt_Head(data);
                return;
            }
            else if(index<0|| index>size){
                System.out.println("Wrong index");
                return;
            }
            for(int i =1; i<=index-1; i++){
                temp= temp.next;
               
          }
          t.next=temp.next;
          temp.next = t;
          size++;

        }
        int get(int index){
            node tem = head;
            if(index<0|| index>size){
                System.out.println("Wrong index");
                return -1;
            }
            for(int i =1; i<=index; i++){
                tem = tem.next;


            }
            return tem.data;
        }
        
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
        linked__list l1 = new linked__list();
        l1.insertAtEnd(34);
        l1.insertAtEnd(90);
        l1.insertAtEnd(900);
        l1.insertAtEnd(88);
        l1.insertAtEnd(97);
        //l1.insertAtTail(600);
       // l1.insert(1, 1700);
       // System.out.println(l1.get(1));
        //l1.display();
        //System.out.println();
        //System.out.println(l1.size());
        // l1.deleteAt(0);
        
        l1.display();
        
    }
}
