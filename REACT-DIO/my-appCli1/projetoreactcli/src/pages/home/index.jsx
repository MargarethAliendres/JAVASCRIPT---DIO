/* tem que colocar esse sinal <>  no inicio e esse no final </> pois nao retorna dois componentes juntos sem esses sinais*/
import { useNavigate  } from "react-router-dom";
import bannerImage from '../../assets/banner.png'      /*assents*/

import { Button } from '../../components/Button';

import { Header } from '../../components/Header';

import { Container, Title, TitleHighlight, TextContent } from './styles';   /*home*/

const Home = () => {

    const navigate = useNavigate();

    const handleClickSignIn = () => {
        navigate('/login')
    }

return (<>
        <Header />
        <Container>
            <div>
                <Title>
                    <TitleHighlight>
                        Implemente <br />
                    </TitleHighlight>
                o seu futuro global agora!</Title>
                <TextContent>Domine as tecnologias utilizadas pelas empresas mais inovadoras do mundo e encare seu novo
                     desafio profissional, evoluindo em comunidade com os melhores experts.</TextContent>
                <Button title="Começar agora" variant="secondary" onClick={handleClickSignIn}/>
            </div>
            <div>
                <img src={bannerImage} alt="Imagem principal do site." />
            </div>
        </Container>
    </>)
}

export { Home }


/*esse faz link do roteamneto entre paginas <Link to="/login">Fazer login</Link>*/

/* desse jeito o botao fica sem nada escrito<h1>Home</h1>
   
<Button> teste 1</Button>
    <Button variant = "secundary"> teste 2</Button>

    <Link to="/login">Fazer login</Link>  */