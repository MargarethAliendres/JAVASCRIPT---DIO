
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ConnectionFactory {
       
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    public static final String USER = "root";
    public static final String PASS = "Mar2016*";
  
    public static Connection getConnection(){
        try {                                       // só usa try-cath para trecho de codigo onde pode ocorrer excecao /erro
            Class.forName(DRIVER);     // carrega o driver para dentro da aplicação
            return (Connection) DriverManager.getConnection(URL,USER,PASS);  // o driverManager faz a conexao com esses´parametros    
        } catch (Exception ex) {                     // faz o tratamento do erro
            throw new RuntimeException("Erro na conexao com banco de dados", ex);
        } 
    } 
        
     public static void closeConnection(Connection connection) {
        try {
           if (connection != null){
               connection.close();
              }
        } catch (Exception ex) {                     // faz o tratamento do erro
            throw new RuntimeException("Erro ao fechar a conexao com banco de dados", ex);
        } 
            
      }
     
     public static void closeConnection(Connection connection, PreparedStatement statement) {
    
        try {
            
            if (connection != null){
               connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
     }
      
     public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
    
        try {
            
            if (connection != null){
               connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
                        
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
     }
     
}


    
        
    

