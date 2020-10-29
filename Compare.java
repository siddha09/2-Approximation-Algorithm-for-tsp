package travelling_salesman_problem;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        int approx;
        int dynamic;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of minimum cost by dynamic programming : ");
        int d=s.nextInt();  
        System.out.print("Enter the value of minimum cost by 2-approximation algorithm : ");
        int a= s.nextInt();
        if(a < 2*d && a>d)
            System.out.print("The 2-Approximation Algorithm gives the correct value for minimum cost.\n"
                    + "It is never greater than twice the value obtained from dynamic programming.\n");
        else
           System.out.print("The value obtained by 2-Approx Algorithm should be greater than that obtained by dynamic programming.\n");      
    }      
    
}
