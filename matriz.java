package array;
/**
 *
 * @author Nelson
 */
import java.util.Scanner;
public class matriz  
{   public static void main(String[] args) 
    {   Scanner leitor  = new Scanner (System.in); 
        String nomes[][] = new String[5][3];
        System.out.println("Digite os nomes dos proprietários: "); 
        
        for (int i =0 ; i < 5; i++)  
        {   for (int j =0 ; j < 3; j++) 
            {   System.out.println("Apto. " + (i+1) + "0" + (j+1) + " :"); 
                nomes[i][j] = leitor.next();
            }
        
        } 
        for (int i =0 ; i < 5; i++)  
        {   for (int j =0 ; j < 3; j++) 
            {   System.out.println("Apto. " + (i+1) + "0" + (j+1) + " : " + nomes[i][j]); 
                
            }
        
        }
    
    }
    
}
