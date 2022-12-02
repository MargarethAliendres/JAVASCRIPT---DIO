/*faça um programa para calcular o valor uma viagem

voce terá 3 variaveis. Sendo elas:

1-preço  etanol;
2-preço  gasolina;
3- tipo de combustivel que esta no carro
2- gasto medio de km por litro ;
3- distancia em km da viagem;


imprima no console o valor que será gasto de combustivel para realizar esta viagem */


const precoEtanol = 5.79;
const precoGasolina = 6.66;
const kmLitro = 11;
const kmViagem = 1580;
const tipoCombustivel = 'Etanol';
let valorGasto;                              //colocando a variavel de fora

const kmPorlitroFinal = kmViagem / kmLitro;

if (tipoCombustivel === 'Etanol') {
    valorGasto = kmPorlitroFinal * precoEtanol;
   
} else if (tipoCombustivel === 'Gasolina') {
    valorGasto = kmPorlitroFinal * precoGasolina;
  
}
console.log(valorGasto.toFixed(2));          // retorno de fora

  
            // outro jeito

const precoEtanol2= 5.79;
const precoGasolina2 = 6.66;
const kmLitro2 = 11;
const kmViagem2 = 1580;
const tipoCombustivel2 = 'Gasolina';                         

const kmPorlitroFinal2 = kmViagem2 / kmLitro2;

if (tipoCombustivel2 === 'Etanol') {
    const valorGasto2 = kmPorlitroFinal2 * precoEtanol2;
    console.log(valorGasto2.toFixed(2)); 
} else if (tipoCombustivel2 === 'Gasolina') {
    const valorGasto2 = kmPorlitroFinal2 * precoGasolina2;
    console.log(valorGasto2.toFixed(2)); 
}
     
