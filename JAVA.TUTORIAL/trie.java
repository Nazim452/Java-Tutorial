public class trie {
    static class node{
        node[]child;
        boolean eow;

        public node(){
           child = new node[26];
           for(int i = 0; i < child.length; i++){
            child[i] =null;

           }
           eow = false;
        }
    }
    static node root = new node();



// INSERTING



     public static void insert(String word){
        node curr = root;

        for(int  i = 0; i < word.length(); i++){
            int index = word.charAt(i)-'a';

            if(curr.child[index] == null)  curr.child[index] =new node();
            if(i==word.length()-1) curr.child[index].eow =true;
            
           curr =  curr.child[index];

        
        }
    
    }



// SEARCHING



    public static boolean search(String key){
         node curr =root;

        for(int i = 0; i<key.length();i++){

            int index = key.charAt(i)-'a';

            if(curr.child[index]==null) return false;


            if(i==key.length()-1&& curr.child[index].eow==false) return false;

            curr = curr.child[index];     // going top next level
        }
        return true;
    }





    //  WORD BREAK  -   NOT WORKING CHECK LATER





    public static boolean wordBreak(String  key){
        if(key.length()==0) return true;

        for(int i = 1; i<=key.length(); i++){
            String  firstcheck = key.substring(0, i);
            String secCheck = key.substring(i);

            if(search(firstcheck)&& wordBreak(secCheck)) return true;

        }


        return false;
    }




        //START WITH PROB




        public static boolean startWith(String prefix){
            node curr = root;
            for(int i = 0; i<prefix.length(); i++){

                int index = prefix.charAt(i)-'a';

                if(curr.child[index]==null) return false;

                // if exist then upadate level

                curr = curr.child[index];

            }
            return true;


            
        }



        //  COUNT UNIQUE SUBSTRING




        public static int count_Node(node root){
            if(root == null)return 0;

            int count = 0;

            for(int i = 0; i<26; i++){
                if(root.child[i]!=null){
                    count+=count_Node(root.child[i]);
                }
            }
            return count+1;
        }
        






        // LONGEST WORD WITH ALL PREFIX






        

        public static String ans ="";
        public static void longest_Word(node root, StringBuilder temp){
            if(root==null) return;

            for(int i = 0; i<26; i++){
                if(root.child[i]!=null&&root.child[i].eow==true){
                    temp.append((char)(i+'a'));

                    if(temp.length()>ans.length()) ans = temp.toString();

                    longest_Word(root.child[i], temp);

                    temp.deleteCharAt(temp.length()-1);
                }
            }
        }
        



    public static void main(String[] args) {

        //for searching &inserting





        // String[]word ={"the","a","there","their","any"};

        // for(int i  =0; i < word.length; i++){
        //     insert(word[i]);
        // }
          // System.out.println(search("there"));

        

          //word break



        // String[]word ={"i","like","sam","samsang","mobile"};
        // String key = "  ilikesamsung";
        // for(int i  =0; i < word.length; i++){
        //     insert(word[i]);
        // }
        // System.out.println(wordBreak(key));
      


         //staRT WITH



        // String[]word = {"apple","app","mango","man"};
        // String prefix = "appe";
        // for(int i  =0; i < word.length; i++){
        //     insert(word[i]);
        // }

        // System.out.println(startWith(prefix));
        




        // COUNT UNIQUE SUB STRING 


        // String str = "apple";

        // for(int i = 0; i < str.length(); i++){


        //     String suffix = str.substring(i);
        //    insert(suffix);


        // }
        // System.out.println(count_Node(root));




        //FOR LONGEST WORD


        String[]word = {"ap","a","app","appl","banan", "apply"};

        for(int i = 0; i<word.length; i++){
            insert(word[i]);
        }

        longest_Word(root, new StringBuilder(""));
        System.out.println(ans);




   }
   
}
