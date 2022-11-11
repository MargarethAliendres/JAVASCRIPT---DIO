package ComandosEntradaSaida;

//1 - Importar o pacote java.util
import java.util.Scanner;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {
    public static void main(String[] args) {
        
        //COMANDOS DE ENTRADA
        //======================================================================
        /*
            Uma das possibilidades de entrada e sa�da de dados em Java � a 
            utiliza��o da classe Scanner.
        
            Passos para a utiliza��o do Scanner:
            
            1 - Importar o pacote java.util
            2 - Instanciar e criar um objeto Scanner
            3 - Ler valores atrav�s do teclado
        */
       
        //2 - Instanciar e criar um objeto Scanner   
        Scanner leitor = new Scanner(System.in);     
        
        int n = leitor.nextInt();
        float f = leitor.nextFloat();
        double d = leitor.nextDouble();
        String s = leitor.next(); //L� apenas uma palavra, n�o � permitido o uso do caractere espa�o
        String ss = leitor.nextLine(); //Leitura de texto com mais de uma palavra, até a pessoa apertar o enter.
        
        /*
            Como o m�todo next retorna um texto precisamos pegar o caractere da
            primeira posi��o da palavra para isso usamos o m�todo charAt() na
            posi��o zero
        */
        char c = leitor.next().charAt(0);
        //======================================================================
        
        //COMANDOS DE SA�DA
        //======================================================================
        /*
            Existem algumas op��es de comandos de sa�da utilizando a classe 
            System. S�o elas: 
            
            1 - print() - Imprime o valor de uma vari�vel, e nao pula linha
            2 - printf() - Imprime o valor de uma vari�vel conforme uma formata��o especificada
            3 - println() - Imprime o valorm de uma vari�vel e pula uma linha
        */
        
        String texto = "Esse texto ser� impresso no console";
        String outroTexto = "Esse texto tamb�m ser� impresso no console";
        System.out.println(texto);
        System.out.print(outroTexto);
        //======================================================================
    }
    
}
