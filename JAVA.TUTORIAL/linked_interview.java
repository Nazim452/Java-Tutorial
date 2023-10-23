public class linked_interview {
    public static void reverse_Display(node head ){
        if(head==null) {
            System.out.println();
            return;
        }
        display(head.next);
        System.out.print(head.data+" ");
    }
    public static node reverse(node head){
        if(head.next==null) return head;

        node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;


    }


// first -odd  the n even - not work
    public static node evenOdd(node head){
        node temp = head;
        node odd = new node(1000);
        node even = new node(100);
        node temp1 = odd;
        node temp2 = even;
        while(temp!=null){
            if(temp.data%2 ==1){
                temp1.next = temp;
                temp = temp.next;
            }else{
                temp2.next = temp;
                temp = temp.next;
            }
        }
        even = even.next;
        odd = odd.next;
        temp1.next = even;
        return odd;
    }


// find nth node from the last

    public static node nthNode(node head, int n){
        int size = 0;
        node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        temp = head;
        for(int i =1; i<m; i++){
            temp = temp.next;
        }
        return temp;
    }

// find nth node from the last

    public static node nthNode2(node head, int n){
        node fast = head;
        node slow = head;
        for(int i =1; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static void display(node head){
        node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    
    }
    public static node remove_nth_fromEnd2(node head , int n){
        node fast = head;
        node slow = head;
        for(int i =1; i<=n; i++){
            fast = fast.next;
        }
        if(fast ==null){
            head  = head.next;
            return head;
        }
        while(fast.next==null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    // public static node remove_nth_fromEnd(node head, int n){
    //     node slow = head;
    //     node fast = head;
    //     for(int i =1; i<=n; i++){
    //         fast = fast.next;
    //     }
    //     if(fast==null){
    //         head = head.next;
    //         return head;
    //     }
    //     while(fast.next==null){
    //         slow = slow.next;
    //         fast = fast.next;
    //     }
    //     slow.next = slow.next.next;
    //     return head;
    // }
    public static void main(String[] args) {
        node a = new node(11);
        node b = new node(12);
        node c = new node(13);
        node d = new node(14);
        node e = new node(15);
        node f = new node(16);
        node g = new node(17);

        a.next = b;
        b.next =c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = g;

        // node q = nthNode2(a, 2);
        // System.out.println(q.data);
        display(a);
       // a = remove_nth_fromEnd2(a, 4);
       a = reverse(a);
        display(a);
        


    
        
    }
    
}
