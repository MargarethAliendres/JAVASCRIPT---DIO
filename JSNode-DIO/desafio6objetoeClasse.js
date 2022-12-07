
                               //objeto

const mar = {             
    nome: 'Deus, Aleluia, Gloria a Deus',
    idade: 1000,
    sexo: 'f'
};

console.log(mar.nome);
console.log(mar.idade);


mar.altura = 1.70;   //insere dentro do objeto a altura

delete mar.sexo;  // deleta um objeto

console.log(mar);

 
//outro exemplo            função dentro do objeto
const pessoa = {             //objeto
    nome: 'Deus, Aleluia, Gloria a Deus',
    idade: 1000,
    sexo: 'f',

    descrever: function(){
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade}`);  // obs esse é apostrofo  proximo do p tudo para a esquerda do inicio e do fim

    }
};
      pessoa.descrever();


     


         //classe



class Pessoa2 {
    nome;
    idade;
    anoDeNascimento;

    constructor(nome, idade) {                     // metodo construtor
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = 2022 - idade;
    }

    descrever() {                                  //metodo dentro da classe
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade}`);  
    }
}

function compararPessoas(p1, p2) {                // funcao fora da classe
    if (p1.idade > p2.idade) {
        console.log(`${p1.nome} é mais velho(a) que ${p2.nome}`);
    } else if (p2.idade > p1.idade) {
        console.log(`${p2.nome} é mais velho(a) que ${p1.nome}`);
    } else {
        console.log(`${p1.nome} e ${p2.nome} tem a mesma idade`);
    }
}

const vitor = new Pessoa2('Vitor', 25);
const renan = new Pessoa2('Renan', 30);

compararPessoas(vitor, renan);
 