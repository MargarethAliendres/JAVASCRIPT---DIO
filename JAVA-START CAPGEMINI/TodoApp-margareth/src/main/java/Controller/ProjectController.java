
package Controller;

import Model.Project;             // aqui tem que mudar de acordo com a entidade// 
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;



public class ProjectController {
    
    
    public void save (Project project){
       String sql = "INSERT INTO project(nome,"
               + "descricao, "
               + "datadeCriacao ,"
               + "datadeAtualizacao) VALUES (?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;
        
            
        try {
            //Cria uma conexï¿½o com o banco
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query//
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getNome());
            statement.setString(2, project.getDescricao());
            statement.setDate(3, new java.sql.Date(project.getDatadeCriacao().getTime()));
            statement.setDate(4, new java.sql.Date(project.getDatadeAtualizacao().getTime()));
           
            
            
            //Executa a sql para inserï¿½ï¿½o dos dados//
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar o projeto " + ex.getMessage(), ex);
        } finally { ConnectionFactory.closeConnection(connection, statement);   // fecha a conexao e o statement//
            
            
            } 
     }

    
    public void update (Project project) {
        String sql = "UPDATE project SET nome = ?, descricao = ?,  datadeCriacao = ? , datadeAtualizacao = ?  WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Cria uma conexï¿½o com o banco//
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query//
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getNome());
            statement.setString(2, project.getDescricao());
            statement.setDate(3, new java.sql.Date(project.getDatadeCriacao().getTime()));
            statement.setDate(4, new java.sql.Date(project.getDatadeAtualizacao().getTime()));
            statement.setInt(5, project.getId());
            
            //Executa a sql para inserï¿½ï¿½o dos dados//
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o projeto" + ex.getMessage(), ex);
        } finally { ConnectionFactory.closeConnection(connection, statement);
        
                }
        
    }
        
   
    
    @SuppressWarnings("empty-statement")
    public void removeById(int id ) throws SQLException {
        String sql = "DELETE FROM  project WHERE id = ?";  // comando responsavel por exluir tarefas//
        
        Connection connection = null;                          // criamos a variavel de conexao conn//
        PreparedStatement statement = null;              // criamos a variavel de statement//
        
        try {
            connection = ConnectionFactory.getConnection();   // pediu conexao//
            statement = connection.prepareStatement(sql);   //prepara o comando pra deixar prontinho para ser executado pela conexao//
            statement.setInt(1, id);          // setou eu quero setar o valor  - mudar o valor da interrogação do sql acima, pelo ID que for enviado pelo parametro ex. quando a pessao chamar e for o 3 aqui ficará 3.//
            statement.execute();                  // agora pediu para executar//
        } catch (Exception ex) {
           throw new RuntimeException("Erro ao deletar o projeto" + ex.getMessage(),  ex); 
        }finally {                                        //sempte é executado //
            ConnectionFactory.closeConnection(connection, statement);
            
        }
        
    }
    
        
    public List<Project> getAll() {    // esse é o unico que tem retorno, tem uma lista de tarfas//
        
                                          //aqui nao precisa de friltro vai trazer todos os projetos//
        String sql = "SELECT * FROM project";        
             
        Connection connection = null;                          // criamos a variavel de conexao conn//
        PreparedStatement statement = null; 
        ResultSet  resultSet = null;   // tem que ter uma classe que representa o retorno do banco de dados, guarda a resposta do banco de dados//
        
        
        //representa um ventor, mas é bom quando trabalho com coleções/conjunto de valores// 
        //lista de tarefas devolvida quando a chamado do metoto acontecer//
        List<Project> project = new ArrayList<Project>();
            try {
            
       
            connection = ConnectionFactory.getConnection();   // pediu conexao//
            statement = connection.prepareStatement(sql);   //prepara o comando pra deixar prontinho para ser executado pela conexao//
            
            //em project nao colocamos o filtro de busca//
                                                        // setou eu quero setar o valor  - mudar o valor da interrogação do sql acima, pelo ID que for enviado pelo parametro ex. quando a pessao chamar e for o 3 aqui ficará 3.//
            resultSet = statement.executeQuery();        // aqui tambem é diferente, retorna o resiltado da Query//
            
            while(resultSet.next()){  // enquanto houver um proximo valor eu vou pegando o valor//
            
  //converaso do objeto banco de dados para a classe tarefa //       // criar uma nova tarefa / um objeto de tarefa //
             Project project2 = new Project();
             
             project2.setId(resultSet.getInt("id"));
             project2.setNome(resultSet.getString("nome"));
             project2.setDescricao(resultSet.getString("descricao"));
             project2.setDatadeCriacao(resultSet.getDate("datadeCriacao"));
             project2.setDatadeAtualizacao(resultSet.getDate("datadeAtualizacao"));
            
             project.add(project2);
            }
            } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir terefa" + ex.getMessage(), ex); 
                     
            } finally {                                        //sempte é executado //
            
            ConnectionFactory.closeConnection(connection, statement, resultSet);   // aqui tambem precisa fechao o resultset//
            
        }
          return project;                   // retorna a lista de tarefas que foi criada e carregada do banco de dados  //
            
    }                        //existem fremeworks que fazem isso.//
    
    } 
       
 