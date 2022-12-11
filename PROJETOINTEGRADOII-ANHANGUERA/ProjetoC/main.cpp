#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	char nome[30];
	char endereco[30];
	char telefone[10];
	
	printf("nome\n");
	scanf("%s", &nome);
	
	printf("endereco\n");
	scanf("%s", &endereco);
	
	printf("telefone\n");
	scanf("%s", &telefone);
	
	printf("\n Nome: %s", nome );
	printf("\n Endereço: %s", endereco );
	printf("\n Telefone: %s", telefone );

	return 0;
}
