import java.util.Random; 
import java.util.Scanner;

class PiedraPapelTijeras
{
    public static void main( String[] args)
    {
        int R = 0;
        int P = 1;
        int S = 2;


        int u;
        int c;
        Scanner myScan = new Scanner(System.in);
        Random myRand = new Random();
        

        System.out.println("0. Piedra");
        System.out.println("1. Papel");
        System.out.println("2. Tijeras");
        
        u = myScan.nextInt();
        
        c = myRand.nextInt(3); 
        

        System.out.println("IA = " + c + " Tu = " + u);
        
        if ( u==c )
        {
            System.out.println("Empate!");
        }
        else if ( (u==R && c==S) || (u==S && c==P) || (u==P && c== R) )
        {
            System.out.println("Has Ganado!");
        }
        else
        {
            System.out.println("Has Perdido!");
        }
    }
}