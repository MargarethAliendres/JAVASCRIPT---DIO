
 //                 PRIMEIRA PARTE DE JAVA SCRIPT

var nome = "Margareth Aliendres";
var idade1 = 40;                     //sem aspas soma e com aspas concatena
var idade2 = 10;
var frase = "Japao e o melhor lugar do mundo";

//alert(idade1 + idade2);*/     //abre popup

console.log(nome);                   //aparece resultado no console
console.log(idade1+idade2);
console.log(frase.replace("Japao", "Brasil"));  //troca japao por brasil
console.log(frase.toUpperCase());   //frase toda maiscula
console.log(frase.toLowerCase());   //frase toda miniscula

//alert(frase.replace("Japao", "Brasil"));  // troca japao por brasil

/*console.log(frase);  apresenta o nome do japao com o acrescenta o replace muda para brasil*/  
/*var idade1 = "40";     com aspas os numeros : será apresentado 4010
var idade2 = "10";
alert(idade1 + idade2);

/*var idade1 = 40;   sem aspas os numeros : sera apresentado 50
var idade2 = 10;   
alert(idade1 + idade2);

alert( idade1 + idade2);   soma idades
alert(nome + " tem " + idade + " anos"); apresenta mensagem completa: margareth aliendrse tem 40 anos*/


        /*Array*/
        
//var lista = ["maca", "pera", "laranja"];
//lista.push("uva");   //inseri item na lista
//lista.pop ();      //tira o ultimo item da lista no caso da uva que foi inserido pelo push
//console.log(lista.length);   // mostra a quantidade de elementos que tem na lista                                                    
//console.log(lista.reverse()); //inverte a lista itens ao contrario
//console.log(lista.join(" - "));  //a lista fica como uma string entre as aspas pode colocar * | espaço nada etc
//console.log(lista.toString()); //a lista fica como uma string
//console.log(lista[1]); //aparece somente a pera  a contagem comeca de 0
//alert(lista);

        //array  - dicionario  (igual objeto jason)
 /*var fruta = {nome:"maça", cor:"vermelha"};
console.log(fruta);
console.log(fruta.nome);
console.log(fruta.cor);
alert(fruta.nome + " , " + fruta.cor); */

       // array - lista de dicionario   inicia com colchete e fecha com colvhete
//var frutas = [{nome:"maça", cor:"vermelha"}, {nome: "uva", cor: "verde"}];
//console.log(frutas);
//console.log(frutas[1].nome);
//alert(frutas[1].nome);



            //condicionais, laços de repeticao, e date

              // condicional
//var idade = prompt("qual é sua idade?");    
//    if (idade > 18) {
//    alert("Maior de idade")
//    }else {
//    alert("Menor de idade")
//}

             //laço de repeticao
 
 //var count = 0;
   //while (count <5) {            //while-enquanto
   // console.log(count);   
   // count = count + 1;
//ou 
   //count++;
  // alert(count);
//   };
   
//var count;
//   for (count=0; count <= 5; count++) {        //for - para
 //       alert(count);
 //       console.log(count);
 //  };

            //DATE (DATA)
    
var d = new Date();
//alert(d);
//alert(d.getMonth()+1);
//alert(d.getDay());
//alert(d.getMinutes());
 // alert(d.getHours());
//console.log(d.getMonth()+1);


      // FUNÇÕES -FUNCTION
        
function soma( n1, n2) {       
 return n1 + n2;
}
 //alert (soma( 5, 10));
 //console.log(soma(5,10));

 

 //function setReplace(frase, nome, novo_nome){        // replace
  //  return frase.replace(nome, novo_nome);
 //}
 //alert(setReplace("VAI JAPAO", "JAPAO","BRASIL"));

 
    /* var validar = 0;

    function validaridade(idade){
  
   if(idade >=18){
      validar = true;
    } else{
     validar = false;
    }
    return validar;
    }
   var idade = prompt("qual é a sua idade?");
    console.log(validaridade(idade)); */


    



     function clicou(){
                                // inner coloca o texto na frente.
      document.getElementById("agradecimento").innerHTML = "obrigado por clicar";
    console.log(document.getElementById("agradecimento"));
  alert("obrigado por clicar");
   }
  
 function redirecionar(){
   //outra aba
   window.open("https://www.colaboraread.com.br/aluno/dashboard/index?matriculaId=3216918401");
   
   //mesma janela
   window.location.href = "https://www.colaboraread.com.br/;"
 }

  function trocar(elemento){
  //document.getElementById("mousemove").innerHTML = "obrigado por passar o mouse";
  //alert("trocar texto");
   //ou asssim   coloca o nome elemento la na função acima e deixa so éssa funcao abixo e acrescenta o this lá no html
  elemento.innerHTML = "obrigado por passar o mouse";
 }

 function voltar(elemento){
  // document.getElementById("mousemove").innerHTML = "passe o mouse aqui";
   //ou asssim   coloca o nome elemento la na função acima e deixa so éssa funcao abixo e acrescenta o this lá no html
  elemento.innerHTML = "passe o mouse aqui";


 }
      //desabilita acima para usar o this no html para usar o this html é com essa abaixo//

    //  function trocar(elemento){
     //   elemento.innerHTML = "obrigado por passar o mouse";
// 

   //   function voltar(elemento){
   //   elemento.innerHTML = "passe o mouse aqui";
 //}

   function load(){
     alert("pagina carregada");
    }


     function funcaochange(elemento){
      console.log(elemento.value);

    }
    
      
 // function subtracao(a,b){
 //   return a - b;
 //}
  //var x = subtracao(11, (-2));
 // print("X = " + z )





 let line = gets().split("");

let A = parseInt(line[0]);

let B = parseInt(line[1]);

let total = 1 + 1; // Altere o valor da variável com o cálculo esperado

console.log("X = " + total);




 






   
    

