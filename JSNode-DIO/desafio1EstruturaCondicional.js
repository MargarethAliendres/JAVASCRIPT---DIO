

/*faça um programa para calcular o valor uma viagem

voce terá 3 variaveis. Sendo elas:

1-preço combustivel;
2- valor medio de gasto do carro por km;
3- distancia em km da viagem;


imprima no console o valor que será gasto de combustivel para realizar esta viagem */


const combustivel = 5.79;     

const kmPorlitrocarro = 12;

const viagemKm = 1580;


const LitrosConsumidos = viagemKm / kmPorlitrocarro;
const TotalGasto = LitrosConsumidos * combustivel;
console.log('Total de gasto é =' + TotalGasto.toFixed(2));  //para arrendodar valores


