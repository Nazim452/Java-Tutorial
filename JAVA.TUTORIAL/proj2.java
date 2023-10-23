
import java.util.Scanner;
import java.util.Random;


class game{
    public int number;
    public int inputnumber;
    public int noofGuess = 0;

    public int getnoofGuess(){
        return noofGuess;
    }

    public void setnoofGuess(int noofGuess){
        this.noofGuess = noofGuess;

    }
    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeuserinput(){
        System.out.println("Guess the number");

        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean iscorrectnumber(){
        noofGuess ++;
        if(inputnumber == number){
            System.out.format("Yes you guess right, it was %d\n  you guessed in  %d attempt" , number , noofGuess);
        return true;
        }
        else if( inputnumber<number){
            System.out.println("Your no is too low");
        }
        else if(inputnumber>number){
            System.out.println("YOur no is too high");
        }
        return false;
        
    }
}




public class proj2 {
    public static void main(String[] args) {
        

        game g = new game();

        boolean b = false;

        while(!b){
            g.takeuserinput();
            b = g.iscorrectnumber();

        }
    }
    
}
