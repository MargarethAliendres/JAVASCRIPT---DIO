



const preco = 10;
const formaPgt = 'debito';




if(formaPgt === 'debito'){
    const pgtdebito = (preco * 0.90 );   // aqui traz o valor ja a pagar ja com desconto
    console.log(pgtdebito);
}else if(formaPgt === 'dinheiroPix'){
    const pgtCredPix = (preco * 0.85 );
    console.log(pgtCredPix);
}else if(formaPgt === 'parcelado2X'){
    const pgtParc2x = (preco);
    console.log(pgtParc2x);
}else if(formaPgt === 'maisde2x'){
    const pgtMais2x = (preco * 1.15 );
    console.log(pgtMais2x );
}


            // outro jeito

const preco2 = 10;
const formaPgt2 = 'maisde2x';                                         
              
   if(formaPgt === 'debito'){
    console.log(preco2-(preco2 * 0.1));                 //desconta
}else if(formaPgt === 'dinheiroPix'){
    console.log(preco2 - (preco2 * 0.15));
} else if(formaPgt === 'maisde2x'){
    console.log(preco2 + (preco2 * 0.15));
} else{
    console.log(preco2);
    
}
    
