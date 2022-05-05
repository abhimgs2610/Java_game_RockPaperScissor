import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors 
{
    public static void main(String args []) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(3);
        System.out.print("Number of Rounds: ");
        byte rounds = sc.nextByte();
        byte usercount=0,systemcount=0;
        for(int i=0; i<rounds; i++)
        {
            int system = rand.nextInt(3);
            System.out.print("I have made my choice make yours: ");
            System.out.println("\n1)Rock\n2)Paper\n3)Scissors");
            int userinput = sc.nextInt();
            if(userinput>4)
            {
                System.out.println("Wrong Input");
                System.exit(1);
            }
            System.out.println("Round "+(i+1));
            if(system == userinput)
                System.out.println("Tie!");
            if(system == 1 && userinput == 2)
                System.out.println("you win");
            usercount++;
            if(system == 1 && userinput == 3)
                System.out.println("System wins!");
            systemcount++;
            if(system == 2 && userinput == 1)
                System.out.println("System win");
            systemcount++;
            if(system == 2 && userinput == 3)
                System.out.println("You wins!");
            usercount++;
            if(system == 3 && userinput == 1)
                System.out.println("you win");
            usercount++;
            if(system == 3 && userinput == 2)
                System.out.println("System wins!");
            systemcount++;
        }
        if(usercount > systemcount)
            System.out.print("You are final winner! Congrats");
        else
            System.out.print("System is the winner! you Noob");
    }
}