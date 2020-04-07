package array;

/**
 *
 * @author Nelson
 */
import java.util.Scanner ; 
public class Array   
{    public static void main(String[] args)  
    {   Scanner leitor = new Scanner (System.in); 
        int quantidade; 
        float media,soma = 0;
        
        System.out.println( "Quantidade das notas: "); 
        quantidade = leitor.nextInt(); 
        
        float notas[] = new float [quantidade]; 
        
        for (int i = 0; i < quantidade ; i++) 
        {   System.out.println ("Digite a " + (i+1) + " nota:"); 
            notas[i] = leitor.nextFloat(); 
            soma = notas [i] + soma; 
        
        }
        System.out.println ("Encerraram as notas !"); 
        System.out.println ("Levantamento da turma: "); 
        System.out.println ("--------------------------------");
        System.out.println ("Notas Digitadas:");
        for (int i = 0; i < quantidade ; i++) 
        {   System.out.println (notas[i]); 
            
        }
        System.out.println ("-------------------------------- "); 
        System.out.println ("Média da turma : " + (soma/quantidade) );
    }
    
}
