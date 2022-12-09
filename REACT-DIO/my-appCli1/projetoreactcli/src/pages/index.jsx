import { useState, useEffect  } from "react";               /*importo esse hook de dentro do react*/


const Teste = () => {

const [name, setName] = useState('margareth');

const handleChangeName = () => {
   setName('margaret')

}

  return (
    <div>
        <p> {name}</p>
        <button onClick={handleChangeName}> Alterar </button>
    </div>
  )
}
export{ Teste};
