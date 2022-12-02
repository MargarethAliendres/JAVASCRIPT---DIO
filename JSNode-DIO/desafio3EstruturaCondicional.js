

const nota1 = 3;
const nota2 = 2;
const nota3 = 1;


const media = (nota1 + nota2 + nota3) / 3;
console.log(media);

if(media < 5){
    console.log('reprovado');
}else if(media >= 5 && media <=7 ){
    console.log('recuperação');
}else{
    console.log('voce passou');
}
