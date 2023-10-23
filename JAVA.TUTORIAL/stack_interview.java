import java.util.*;
// public class stack_interview {

//     public static int[] next_Greater2(int[]arr){
//         int[]res= new int[arr.length];

//         for(int i = 0; i<arr.length; i++){
//             res[i] = -1;

//             for(int j = i+1; j<arr.length; j++){

//                 if(arr[j]>arr[i]){
//                     res[i] =arr[j];
//                     break;
//                 }
//             }
//         }

        


//         return res;
        
//     }
//     public static int[] next_Greater(int[]arr){
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();

//         int[] res = new int[arr.length];

//         res[n-1] = -1;

//         st.push(arr[n-1]);

//         for(int i = n-2;i>=0; i--){
//             while( st.size()>0&&st.peek()<arr[i]  ){
//                 st.pop();
//             }
//             if(st.size()==0) res[i] = -1;

//             else res[i] = st.peek();
//             st.push(arr[i]);

            
//         }



//         return res;
//     }
   
//     public static boolean bracket(String str){

//         Stack<Character> st = new Stack<>();
//         for(int i = 0; i<str.length(); i++){
//             char ch =str.charAt(i);
            
//             if(ch=='('){
//                 st.push(ch);
//             }
//             else{   //")"
                 
//                 if(st.size()==0) return false;

//                 if(st.peek()=='(') st.pop();

//             }
//         }

//         if(st.size()>0) return false;
        

//         return true;
//     }

//     public static int[] remove(int[]arr){
//         Stack<Integer> st = new Stack<>();
//         int n= arr.length;

//         for(int i = 0; i<arr.length ; i++){
//             if(st.size()==0 || st.peek()!=arr[i])  st.push(arr[i]);

//             else if(st.peek()==arr[i]){
//                 if(arr[i]!=arr[i+1]) st.pop();


//             }
//         }
        
//         int[]res = new int[st.size()];
//         int m = res.length;
//         for(int i = m-1; i>=0; i--){
//             res[i] = st.pop();

//         }
//         return res;

        

//     }
//     public static void main(String[] args) {
//         // String str = "(())(())";
//         // System.out.println(bracket(str));


//         // int[]arr = { 1,2,2,3,10,10,10,4,4,4,5,5,12,13};
//         // int res2[] = remove(arr);

//         // for(int i = 0; i<res2.length; i++){
//         //     System.out.print(res2[i]+" ");
//         // }


//         int[]arr = { 1,5,3,2,1,6,3,4};
//         int[]res = next_Greater(arr);
//         for(int i = 0; i<res.length; i++){
//             System.out.print(res[i]+" ");
        
    
       
        
//     }
   
//     }
    
// }







//  INFIX EXPRESSION




//     public static void main(String[] args) {
        
//         String str = "9-(5+3)*4/6";

//         Stack<Integer> val = new Stack<>();
//         Stack<Character> opr = new Stack<>();

//         for(int i =0; i<str.length(); i++){
//             char ch = str.charAt(i);

//             int ascii = (int)ch;   //ch = 5
//             if(ascii>=48  && ascii<=57){   //asci= 53
//                 val.push(ascii-48);
//             }

//             else if(opr.size()==0 || ch == '(' || opr.peek()=='('){
//                 opr.push(ch);
//             }

//             else if (ch ==')'){

//                 while(opr.peek()!='('){
//                     int val2 = val.pop();
//                     int val1 = val.pop();

//                     if(opr.peek()=='+')  val.push(val1+val1);
//                     if(opr.peek()=='-')  val.push(val1-val1);
//                     if(opr.peek()=='*')  val.push(val1*val1);
//                     if(opr.peek()=='/')  val.push(val1/val1);
//                     opr.pop();


//                 }
//                 opr.pop();    //  '(' - remove
//             }
//             else{
//                 if(ch=='+'  ||ch=='-'){
//                     int val2 = opr.pop();
//                     int val1 = opr.pop();

//                     if(opr.peek()=='+')  val.push(val1+val2);
//                     if(opr.peek()=='-')  val.push(val1-val2);
//                     if(opr.peek()=='*')  val.push(val1*val2);
//                     if(opr.peek()=='/')  val.push(val1/val2);
//                     opr.pop();
//                     opr.push(ch);


//                 }
//                 if(ch=='*' || ch=='/'){
//                      if(opr.peek()=='*' ||  opr.peek()=='/'){
//                     int val2 = val.pop();
//                     int val1 = val.pop();

//                     //if(opr.peek()=='+')  val.push(val2+val1);
//                     //if(opr.peek()=='-')  val.push(val2-val1);
//                     if(opr.peek()=='*')  val.push(val1*val2);
//                     if(opr.peek()=='/')  val.push(val1/val2);
//                     opr.pop();
//                     opr.push(ch);


//                     }
//                     else opr.push(ch);
//                 }
               
                
//             }

            

            

            

//         }
//         while(val.size()>1){
//             int val2 = val.pop();
//             int val1 = val.pop();
//             if(opr.peek()=='+')  val.push(val1+val2);
//             if(opr.peek()=='-')  val.push(val1-val2);
//             if(opr.peek()=='*')  val.push(val1*val2);
//             if(opr.peek()=='/')  val.push(val1/val2);
//             opr.pop();         

                   

                    
//         }
//         System.out.println(val.peek());

        
//     }
// }







// public class stack_interview{
//     public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "9-5+3*4/6";

        for(int i= 0; i<str.length(); i++){
            char ch= str.charAt(i);

            int ascii = (int)ch;  //ch = 5

            if(ascii>=48  && ascii<=57)  val.push(ascii-48); // ascii = 53
                 
            
            else if(op.size()==0) op.push(ch);

            else{    //  means  +,-,*,/  && size not is 0
            
                if(ch == '+' || ch=='-'){
                    
                    // work
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek()=='+')  val.push(val1+val2);
                    if(op.peek()=='-')  val.push(val1-val2);
                    if(op.peek()=='*')  val.push(val1*val2);
                    if(op.peek()=='/')  val.push(val1/val2);
                    op.pop(); 
                    
                    op.push(ch);


                }
                if(ch=='*'|| ch=='/'){
                    if(op.peek()=='*'|| op.peek()=='/'){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    
                    if(op.peek()=='*')  val.push(val1*val2);
                    if(op.peek()=='/')  val.push(val1/val2);
                    op.pop(); 

                    }else  op.push(ch);
                        
                    
                }

            }

        }
        // val stack made size 1
        while(val.size()>1){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek()=='+')  val.push(val1+val2);
                    if(op.peek()=='-')  val.push(val1-val2);
                    if(op.peek()=='*')  val.push(val1*val2);
                    if(op.peek()=='/')  val.push(val1/val2);
                    op.pop(); 
                    
                    


        }
        System.out.println(val.peek());

    }
}











public class stack_interview{
    public static void main(String[] args) {


 // POSTFIX EVALUATUION
 
 

    //     String str = "953+4*6/-";
    //     Stack<Integer> val = new Stack<>();

    //     for(int i = 0; i<str.length(); i++){
    //         char ch  = str.charAt(i);
    //         int asci=  (int)ch;

    //         if(asci>=48&& asci<=57){
    //             val.push(asci-48);
    //         }
    //         else {
    //             int v2 = val.pop();
    //             int v1 = val.pop();

    //             if(ch=='+') val.push(v1+v2);
    //             if(ch=='-') val.push(v1-v2);
    //             if(ch=='*') val.push(v1*v2);
    //             if(ch=='/') val.push(v1/v2);
    //         }
    //     }
   
    //   System.out.println(val.peek());
  
  
  
//  PREFIX EVALUATION


        
    //     String str = "-9/*+4356";
    //     Stack<Integer> val = new Stack<>();

    //     for(int i = str.length()-1; i>=0; i--){
    //         char ch  = str.charAt(i);
    //         int asci=  (int)ch;

    //         if(asci>=48&& asci<=57){
    //             val.push(asci-48);
    //         }
    //         else {
    //             int v1 = val.pop();
    //             int v2 = val.pop();

    //             if(ch=='+') val.push(v1+v2);
    //             if(ch=='-') val.push(v1-v2);
    //             if(ch=='*') val.push(v1*v2);
    //             if(ch=='/') val.push(v1/v2);
    //         }
    //     }
   
    //   System.out.println(val.peek());
  


 
    

// // PREFIX TO POSTFIX



    //    String str = "-9/*+5346";

    //    Stack<String> val = new Stack<>();
       
    //    for(int i = str.length()-1; i>=0; i--){

    //     char ch = str.charAt(i);
    //     int ascii = (int)ch;
    //     if(ascii>=48  && ascii<=57){
            
    //         val.push(ch +"");
    //     }
    //     else{
    //         String v1 = val.pop();
    //         String v2 = val.pop();
    //         char op= ch;

    //         String t = v1+v2+op;
    //         val.push(t); 
    //     }

    //    }
    //    System.out.println(val.peek());







// postfix to prefix




        // String str = "953+4*6/-";
        // Stack<String> val = new Stack<>();

        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);

        //     int ascii = (int)ch;
        //     if(ascii>=48  && ascii<=57){
        //         val.push(ch+"");
        //     }
        //     else{
        //         String v2 = val.pop();
        //         String v1 = val.pop();
        //         char op = ch;

        //         String t = op+v1+v2;
        //         val.push(t);
        //     }
        // }
        // System.out.println(val.peek());


        



// POSTFIX TO INFIX


       
        // String str = "953+4*6/-";
        // Stack<String> val = new Stack<>();

        // for(int i = 0; i<str.length(); i++){
        //     char ch  = str.charAt(i);
        //     int asci=  (int)ch;

        //     if(asci>=48&& asci<=57){
        //         val.push(ch+"");
        //     }
        //     else {
        //         String v2 = val.pop();
        //         String v1 = val.pop();
        //         char op =ch;

        //         String t = "("+ v1+op+v2+ ")";
        //         val.push(t);

               
        //     }
        // }
   
    //  System.out.println(val.peek());




// PREFX TO INFIX


            
        String str = "-9/*+4356";
        Stack<String> val = new Stack<>();

        for(int i = str.length()-1; i>=0; i--){
            char ch  = str.charAt(i);
            int asci=  (int)ch;

            if(asci>=48&& asci<=57){
                val.push(ch+"");
            }
            else {
                String v1 = val.pop();
                String v2 = val.pop();

                char  op = ch;
                String rt = v1+op+v2;
                val.push(rt);

                
           }
       }
   
      System.out.println(val.peek());
  





    }
}



































