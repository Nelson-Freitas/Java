
package strings;

/**
 *
 * @author Nelson
 */
public class busca2String  
{   public static void main(String[] args) 
    {   String arquivo = "musica.mp3"; 
        if (arquivo.substring(6).equalsIgnoreCase(".mp3")) 
        {   System.out.println("Arquivo de música");
            
        }
        else  
        {   System.out.println("Arquivo não encontrado");
        }
    }   
}
