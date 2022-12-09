import React from 'react'
import logo from '../../assets/logo-dio.png';
import { Button } from '../Button';

import {Container, Input, MenuRigth, Menu, BuscarInputContainer, Wrapper, Row} from './styles';

const Header = () => {
  return (
    <Wrapper>
        <Container>
          <Row>
            <img src= {logo} alt='logo da DIO'/>
            <BuscarInputContainer> 
                <Input placeholder='Buscar...'/>
            </BuscarInputContainer>
            <MenuRigth href='a'> Home </MenuRigth>
            <Menu> Global</Menu>
          </Row>
        </Container>
    </Wrapper>
  )
}

export { Header }


