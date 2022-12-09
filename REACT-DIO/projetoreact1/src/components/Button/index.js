import React from 'react'    // na versao 17 nao precisa mais desse import, pode deletar//
                                
                                 //aqui dentro as propriedades/comportamento, porque o botao pode está em varios locais da aplicaçõ vai ter um comportamento diferente
export default function Button ({title}) {
  return (                            /* para receber uma variavel dentro do jsx*/
      <button>{title}</button>
    )
  }


  