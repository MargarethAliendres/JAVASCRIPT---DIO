/*pequenos trechos de codigo que podemos invocar a qualquer momento*/

function teste(){
    console.log('teste');
}

teste();
teste();  



        // sem retorno
                                //nao devolvem nada, so executa o que esta aqui dentro, soa = a procedimentos
function MyName(name){
    console.log('Meu nome é = ' + name);
}
    MyName('margareth');
    MyName('Hanna');


     //com retorno

 function quadrado(valor){
    return (valor*valor);
 }    
  const quadDedez = quadrado(10);
  console.log(quadDedez);


     //outro jeito

  function quadrado2(valor){
    return (valor*valor);
 }    
   
  console.log(quadrado2(10) + quadrado2(10));



  


  function incrementodeJuros(valor, percentualJuros){
    const valorDeAcrescimo = (percentualJuros/100)*valor;
    return valor + valorDeAcrescimo;
  }
      console.log(incrementodeJuros(100,10));
      
   

