package funcoes;
/**
 *
 * @author Nelson
 */ 
import java.util.Scanner; 
public class procedimentos  
{    public static void main(String[] args)  
    {   Scanner leitor = new Scanner(System.in); 
        float nota1,nota2,media = 0; 
        String situacao;
        System.out.println("Primeira nota: ");
        nota1 = leitor.nextFloat(); 
        System.out.println("Segunda nota: ");
        nota2 = leitor.nextFloat(); 
        
        media = media(nota1,nota2); // a variavel media está recebendo a média do aluno  
        situacao = verificaSituacaoAluno (media(nota1,nota2)); // uma função dentro de outra
        saidaRefinada(nota1,nota2,situacao);
    } 
    public static void saidaRefinada (float nota1,float nota2, String s) 
    {   System.out.println ("O aluno obteve media: " + media (nota1,nota2)); 
        System.out.println ( "Situação: " + s);
    }
    
    public static float media (float nota1,float nota2) 
    {   return (nota1+nota2)/2; 
    }
     public static String verificaSituacaoAluno ( float media) 
    {   if (media >= 7) 
        {   return "APROVADO"; 
        }
        else if (media < 3)  
        {   return "REPROVADO";
        } 
        else  
        {   return "RECUPERAÇÃO"; 
        }
    }
}  
   
