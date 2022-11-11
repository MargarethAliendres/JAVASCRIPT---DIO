programa
{
	
	funcao inicio()
	{
        real jan, fev, mar, abril, soma, media
        cadeia vendedor

        escreva("digite o nome do vendedor:")
        leia(vendedor)
        escreva("digite a venda jan:")
        leia(jan)
        escreva("digite a venda fev:")
        leia(fev)
        escreva("digite a venda mar:")
        leia(mar)
        escreva("digite a venda abril:")
        leia(abril)

        soma = (jan+fev+mar+abril)

        media = (jan+fev+mar+abril)/4

        
        escreva("o vendedor: " + vendedor + " vendou o total de: "  + soma +  "e a media de venda foi de: " + media )

        
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */