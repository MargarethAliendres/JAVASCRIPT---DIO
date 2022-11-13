package upcasteDowncast;

public class RodarAplicacao {

    public static void main(String[]args ) {

        Funcionario funcionario = new Funcionario();
   /* up cast  */
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

   /* down cast */
        Vendedor vendedor1 = (Vendedor) new Funcionario();

    }

}
