
import styled from "styled-components";
                                                           
export const Container = styled.div` 
    width: 100%;
    max-width: 80%;
    heigth: 47px;

    display: flex;
    justify-content: space-between;
    align-items: center;
    margin: 0 auto;
`
                                                             /* organizar as linhas */
export const Row =  styled.div`                                     
        display:flex;
        flex-direction: row;
        aling-items: center;
                
`                                                            /* organizar as colunas */
export const Column =  styled.div`                                      
        display:flex;
        flex-direction: column;
        aling-items: center;
 
`                                                           /*  organiza o conteudo */    
export const Wrapper =  styled.div`                                     
        background-color: #15151515;
        widht: 100%;
        height: 47px;
        display:flex;
        justify-content: center;
        aling-items: center;
`
                                                               /* botao de buscar*/
export const BuscarInputContainer =  styled.div`             
         widht: 175px;
         height: 30px;
         background: #202037;
         border-radius: 8px;
         padding: 2px 5px;
         margin: 8 12px;

         display:flex;
 
`                                          /* o a é link do menu  */
export const Menu=  styled.a`     
      font-family: 'Open-Sanz';
      font-style: normal;
      font-size: 12px;
      line-height:25px;
      color: #ffffff;
      margin-rigth: 12px;
      text-decoration: none;
`                                        /* o a é link do menu  */
export const MenuRigth=  styled.a`     
      font-family: 'Open-Sanz';
      font-style: normal;
      font-size: 12px;
      line-height:25px;
      color: #ffffff;
      margin-rigth: 12px;
      text-decoration: none;
`                                                   /*imagem*/
export const UserPicture=  styled.img` 
    widht: 32px;
    height: 32px;
    border-radius:22px; 
    border: 2px solid #ffffff;


`                                       /*entradas ,  flex: 1; 100% */
export const Input=  styled.input` 
     background: transparent;
     border: 0;
     flex: 1;       
     color: #ffffff;

`
