
package recursao;

import java.util.Scanner;
public class Recursao  
{   public static void main(String[] args)  
    {   Scanner leitor = new Scanner (System.in); 
        int fat;  
        System.out.println("Digite um número: "); 
        fat = leitor.nextInt(); 
        
        
        if (fat > 0) 
        {   System.out.println ("O fatorial de " + fat + " é " + fatorial (fat)); 
        }
        else 
        {   System.out.println("Não existe fatorial de número negativo");    
        }
    }
    public static int fatorial (int numero) 
    {   int fat;
        if (numero < 0) 
        {   fat = -1; 
        } 
        else if (numero == 0) 
        {   fat = 1; 
        } 
        else  
        {   fat = fatorial(numero-1) * numero; 
        } 
        return fat;
    }
}
