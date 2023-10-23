public class doub_link_list {
    public static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data = data;

        }
    }
    public static void display(node random){     // lasst elem is not print
        node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;

        }
       
    
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node insertAtHead(node head, int x){
        node t = new node(x);
        t.next = head;
        head.prev = t;
        head = t;


        return t;
    }
    public static void insertAtIndex(node head, int index , int x){
        node s = head;
        for(int i =1; i<index; i++){
            s = s.next;
        }
        node t = new node(x);
        node r = s.next;
        // s t r
        s.next = t;
        t.prev =s;
        t.next = r;
        r.prev = t;

    

    }
    public static void deleteAtIndex(node head, int index){
        node temp = head ;
        for(int i =1; i<index; i++){
            temp  = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev =temp;
        
    }
    public static boolean isPalindrome(node head){
        node h = head;

        // find tail
        node t = head;

        while(t!=null){
            t  = t.next;
        }
        while(h!=t){
            
        if(h.data!=t.data) return false;
       
        h = h.next;
        if(t.prev!=null){
             t = t.prev;

        }
       
        
       
    

        }
        return true;
        
    }
    public static void main(String[] args) {
        node a = new node(3);
        node b = new node(4);
        node c = new node(5);
        node d = new node(6);
        node e = new node(7);
         
        
        a.prev=null;   
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        e.next = null;
        display(d);
        isPalindrome(a);
        //insertAtHead(a, 90);
        //display(d);
        //insertAtIndex(a, 2,89);
        //deleteAtIndex(a, 2);
        //display(d);
        
        

        
    }
    
}
