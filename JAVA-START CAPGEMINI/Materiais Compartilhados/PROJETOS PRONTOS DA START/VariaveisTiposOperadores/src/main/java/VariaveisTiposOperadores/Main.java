package VariaveisTiposOperadores;

import java.util.Date;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {

    public static void main(String[] args) {

        // TIPOS DE VARI�VEIS
        //======================================================================
        /*
            As v�riaveis podem ser divididas em dois tipos: Variaveis primitivas e n�o primitivas (refer�ncia)
            
            Vari�veis primitivas s�o aquelas que foram criadas com a linguagem 
            de programa��o e servem para armazenar valores simples, como por 
            exemplo um n�mero, um valor l�gico ou at� mesmo um caractere.
        
            J� as vari�veis n�o primitivas (refer�ncia) s�o aquelas que foram 
            criadas com o aprimoramento da linguagem. Elas servem para armazenar 
            valores mais complexos.
         */
        
        
        //Exemplos de tipos de vari�veis primitivas
        byte idade;
        short pontosAcumulados;
        int quantidadeUsuarios;  // SEM VIRGULA
        float cotacaoDolar;      // COM VIRGULA
        double consumoMedio;
        boolean estaLogado;
        char genero;
        
        
        /*  
            Tipos, tamanhos e valores default das vari�veis primitivas:
        
            Tipo 	Tamanho (bits) 	Faixa                                                           Valor Padr�o
            byte 	8               -128 a 127                                                      0
            short 	16              -32.768 a 32.767                                                0
            int 	32              -231 a 231 � 1                                                  0
            long 	64              -263 a 263 -1                                                   0L
            float 	32              IEEE 754 �1,40129846432481707e-45 a 3,40282346638528860e+38 	0.0f
            double 	64              IEEE 754 �4,94065645841246544e-324 a 1,79769313486231570e+308   0.0d
        */
        
        
        //Exemplos de tipos vari�ries n�o primitivas
        String nome;
        Date dataNascimento;
        
        
        /*
            Note que nas vari�veis primitivas o tipo inicia com uma letra min�scula,
            j� nas vari�veis n�o primitivas inicia com uma letra maiuscula
        */
        //======================================================================
        
        
        //OPERADORES
        //======================================================================
        /*
            Java conta com 5 operadores aritm�ticos:
        
            Soma            (+)
            Subtra��o       (-)
            Multiplica��o   (*)
            Divis�o         (/)
            Resto           (%)
        */
        
        
        int pontosEquipeA = 10;
        int pontosEquipeB = 20;
        
        //Exemplo de utiliza��o do operador da ADI��O
        int totalSoma = pontosEquipeA + pontosEquipeB;
        //Exemplo de utiliza��o do operador da SUBTRA��O
        int totalSubtracao = pontosEquipeA - pontosEquipeB;
        //Exemplo de utiliza��o do operador da MULTIPLICA��O
        int totalMultiplicacao = pontosEquipeA * pontosEquipeB;
        //Exemplo de utiliza��o do operador da DIVIS�O
        int totalDivisao = pontosEquipeA / pontosEquipeB;
        //Exemplo de utiliza��o do operador de RESTO  
        int totalResto = pontosEquipeA % pontosEquipeB;
        //======================================================================
    }

}
