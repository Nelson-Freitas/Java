package strings;
/**
 * COMPARAÇÃO DE STRINGS
 * @author Nelson
 */ 
import java.util.Scanner; 

public class Strings  
{   public static void main(String[] args) 
    { String nome1,nome2;   
      Scanner leitor = new Scanner (System.in);  
      System.out.println ("Digite o primeiro nome: "); 
      nome1 = leitor.next(); 
      System.out.println ("Digite o segundo nome: "); 
      nome2 = leitor.next(); 
      
      if (nome1.equals(nome2)) // função de comparação de strings
      { System.out.println("Nomes iguais !!");
      }
      else  
      {  System.out.println("Nomes diferentes !!");
      }
        
    }
    
}
