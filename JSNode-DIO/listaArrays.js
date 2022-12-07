
const alunos = ['joao', 'margareth', 'derlon'];

alunos .push('hanna');    /*inseri item na lista fica dinamicamente no final da lista*/

alunos[4] = ('vincius');  /*ouro jeito inseri item na lista aqui ja escolho a posição */

console.log(alunos);



const alunos2 = ['1', '2', '3'];

alunos2.pop();              /* tira o ultimo item*/

alunos2.shift();            /* tira o primeito item*/


console.log(alunos2);


/*outros exemplos, iniciando a lista vazia.*/

const notas = [];
notas.push(5);
notas.push(7);
notas.push(8);
notas.push(2);
notas.push(5);
notas.push(8);
         
let soma = 0;

for (let i = 0; i < notas.length; i++) {
    const nota = notas[i];
    soma = soma + nota;
}

const media = soma / notas.length;
 
console.log(media );




//
   
