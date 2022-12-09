

function calcularPeso(peso, altura){          //potencia
    return peso /Math.pow(altura, 2);        //esse meth.pow é o mesmo que altura*altura  muda a quantidade nesse numero 2// 

}

function classificarImc(imc){
    
    
    if(imc < 18.5){ 
        return('Abaixo do peso');
    }else if(imc >= 18.5 && imc < 25){
        return('peso normal');
    }else if (imc >= 25 && imc < 30){
        return('acima do peso');
    }else if (imc >= 30 && imc < 40){
        return('obeso');
    }else{
        return('obesidade grave');
    }

}
 function main(){

        const altura = 1.60;
        const peso = 80;

        const imc = calcularPeso(peso, altura);
        console.log(classificarImc(imc));                         
}

main();                                      //invocação



//ou assim entre parenetes - imediatamente incovada

//é o main, codigo principal
(function(){                            //pode até tirar o nome da funcao

    const altura = 1.60;                  // codigo que executa uma vez só, isola o escopo
    const peso = 80;

    const imc = calcularPeso(peso, altura);
    console.log(classificarImc(imc));                         
})();                                          // invocação



function EscreverNome(nome){
    console.log('Meu nome é '  + nome );
}
   EscreverNome ('Margareth.');


   function ClassificarIdade(idade){

         if(idade < 18){
            return 'menor de idade';
         }
         else {
            return 'maior de idade';
         }
   
    function main(){
       const idade = 18;
      
      console.log(ClassificarIdade(idade))
      
   }         
         }
   








