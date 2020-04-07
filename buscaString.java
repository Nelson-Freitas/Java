
package strings;

/**
 *
 * @author Nelson
 */ // a função nome1.indexOf(ponto), recebe um caractere como parametro e retorna sua posição na string !!!
import java.util.Scanner;
public class buscaString  
{
    public static void main(String[] args) 
    {   Scanner leitor = new Scanner(System.in);
	System.out.println("Digite uma palavra:");
	String nome1 = leitor.next(); 
        char ponto = '.';
	System.out.println("A posição do ponto no texto é: " + nome1.indexOf(ponto));
    }
}


