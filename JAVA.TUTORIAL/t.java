public class t {
    
    static int  pow1(int p, int q){
        if(q==0) return 1;

        int ans = pow1(p, q/2);
        

        if(q%2==0){
            return ans*ans;
        }else{
            return ans*ans*p;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow1(5, 3));
        
    }
    
}
