

public class link {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public  static class linked__list{
        node head = null;
        node tail = null;
        int size = 0;

        void insertAtEnd(int data){
            node temp = new node(data);
            if(head==null){
                head=tail=temp;
            }else{
                tail.next = temp;
                temp = null;
                size++;

            }
        }
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }
        void insertAt_Head(int data){
            node temp = new node(data);
            if(head==null){
                head=tail=temp;

            }else{
                temp.next= head;
                head=temp;
            }
            size++;
        }
        void insert(int index, int data){
            node t = new node(data);
            node temp =  head;
            if(index==size){
                insertAtEnd(data);
                return;
            }
            else if(index==0){
                insertAt_Head(data);
                return;
            }
            for(int i =1; i<index; i++){
                temp = temp.next;

            }
            t.next= temp.next;
            temp.next = t;

        }
        void deleteAt(int index){
            if(index==0) {
                head = head.next;
                size--;
                return;
            }
            node t = head;
            for(int i =1; i<=index-1; i++){
                t = t.next;
            }
            t.next = t.next.next;
            tail = t;
            size--;
        }  int get(int index){
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
    public static void main(String[] args) {
        linked__list l1 = new linked__list();
       l1.insertAt_Head(34);
       l1.insertAt_Head(45);
       l1.insertAt_Head(23);
       l1.deleteAt(2);
       //l1.insert(3, 444);
       //System.out.println(l1.get(2));
       l1.display();
       
       
        
       
        
    }
    
}
