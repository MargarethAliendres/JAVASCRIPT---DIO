

for (let i= 0; i <= 10; i++) {              //vai imprimir até 10       percorrendo é uma lista array loop
    console.log(i);
 
}


 // outro exemplo         // percorrendo é uma lista array loop
                                                                 
 const nome ='margareth clarinda carvalho aliendres';

 for (let i = 0; i < nome.length; i++) {
     const letra = nome[i];
    
    console.log(letra);
    
 }

 // desafio 1 - Crie um programa que dado um número imprima a sua tabuada.

const numero = 5;
for (let i = 1; i <= 10; i++) {
   
     console.log(i * numero);

   }

//desafio 2 - Crie um programa que seja capaz de percorrer uma lista de números e imprima cada número Par encontrado.

const numeros = [1,2,3,4,5,6,7,8,9,10];

for (let i = 0; i < numeros.length; i++) {   
   
    const numero = numeros[i];

    if (numero % 2 ===0 ) {          
        console.log(numero)
        
    }
}
    //outro jeito

const numerosPares = [];

    for (let i = 0; i < 10; i++) {
        const numeroPar = i % 2 === 0;
        if (numeroPar) {
            numerosPares.push(i);
        }
    }

    console.log(numerosPares);

   // outro jeito

   