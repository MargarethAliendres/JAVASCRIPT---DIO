
package Controller;

import Model.Task;       // aqui tem que mudar de acordo com a entidade//
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;



public class TaskController {
    
    
    public void save (Task task){
       String sql = "INSERT INTO task(nome,"
               + "descricao, "
               + "completada, "
               + "observacao, "
               + "prazo, "
               + "datadeCriacao ,"
               + "datadeAtualizacao, "
               + "idProject) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;
        
            
        try {
            //Cria uma conexï¿½o com o banco//
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query//
            statement = connection.prepareStatement(sql);
            statement.setString(1, task.getNome());
            statement.setString(2, task.getDescricao());
            statement.setBoolean(3, task.isCompletada());   // aqui é diferente no bolean//
            statement.setString(4, task.getObservacao());
            statement.setDate(5, new java.sql.Date(task.getPrazo().getTime()));
            statement.setDate(6, new java.sql.Date(task.getDatadeCriacao().getTime()));
            statement.setDate(7, new java.sql.Date(task.getDatadeAtualizacao().getTime()));
            statement.setInt(8, task.getIdProject());
            
            
            //Executa a sql para inserï¿½ï¿½o dos dados//
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " + ex.getMessage(), ex);
        } finally { 
            ConnectionFactory.closeConnection(connection, statement);   // fecha a conexao e o statement//
            
            
            } 
     }

    
    public void update (Task task) {
        String sql = "UPDATE task SET idProject = ?, nome = ?, descricao = ?, Completada = ?, observacao = ?, prazo = ?, datadeCriacao = ?, datadeAtualizacao = ? WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Cria uma conexï¿½o com o banco//
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query//
            statement = connection.prepareStatement(sql);
            statement.setString(1, task.getNome());
            statement.setString(2, task.getDescricao());
            statement.setBoolean(3, task.isCompletada());
            statement.setString(4, task.getObservacao());
            statement.setDate(5, new java.sql.Date(task.getPrazo().getTime()));
            statement.setDate(6, new java.sql.Date(task.getDatadeCriacao().getTime()));
            statement.setDate(7, new java.sql.Date(task.getDatadeAtualizacao().getTime()));
            statement.setInt(8, task.getIdProject());
            statement.setInt(9, task.getId());
            
            //Executa a sql para inserï¿½ï¿½o dos dados//
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
            
    }
        
    }
    
    @SuppressWarnings("empty-statement")
    public void removeById(int taskId) throws SQLException {
        String sql = "DELETE FROM  task WHERE id = ?";  // comando responsavel por exluir tarefas//
        
        Connection connection = null;                          // criamos a variavel de conexao conn//
        PreparedStatement statement = null;              // criamos a variavel de statement//
        
        try {
            connection = ConnectionFactory.getConnection();   // pediu conexao//
            statement = connection.prepareStatement(sql);   //prepara o comando pra deixar prontinho para ser executado pela conexao//
            statement.setInt(1, taskId);          // setou eu quero setar o valor  - mudar o valor da interrogação do sql acima, pelo ID que for enviado pelo parametro ex. quando a pessao chamar e for o 3 aqui ficará 3//
            statement.execute();                  // agora pediu para executar//
        } catch (Exception ex) {
           throw new RuntimeException("Erro ao deletar a terefa" + ex.getMessage(),  ex); 
        }finally {                                        
            ConnectionFactory.closeConnection(connection, statement);
                                                                       //sempte é executado //
        }
        
    }
    
        
    public List<Task> getAll(int idProject){     // esse é o unico que tem retorno, tem uma lista de tarfas//
        
        
        String sql = "SELECT * FROM task  WHERE idProject = ?";   // scrpit sql//
             
        Connection connection = null;                          // criamos a variavel de conexao conn//
        PreparedStatement statement = null; 
        ResultSet  resultSet = null;   // tem que ter uma classe que representa o retorno do banco de dados, guarda a resposta do banco de dados//
        
        
        //representa um ventor, mas é bom quando trabalho com coleções/conjunto de valores //
        //lista de tarefas devolvida quando a chamado do metoto acontecer//
        List<Task> task = new ArrayList<Task>();
        
        
        try {
            
            connection = ConnectionFactory.getConnection();   // pediu conexao//
            statement = connection.prepareStatement(sql);   //prepara o comando pra deixar prontinho para ser executado pela conexao//
            //filtro de busca//
            statement.setInt(1, idProject);          // setou eu quero setar o valor  - mudar o valor da interrogação do sql acima, pelo ID que for enviado pelo parametro ex. quando a pessao chamar e for o 3 aqui ficará 3.//
            resultSet = statement.executeQuery();        // aqui tambem é diferente, retorna o resiltado da Query//
            
            while(resultSet.next());  // enquanto houver um proximo valor eu vou pegando o valor//
            
  //converaso do objeto banco de dados para a classe tarefa //       // criar uma nova tarefa / um objeto de tarefa //
             Task task2 = new Task();
             task2.setId(resultSet.getInt("id"));
             task2.setNome(resultSet.getString("nome"));
             task2.setDescricao(resultSet.getString("descricao"));
             task2.setCompletada(resultSet.getBoolean("completada"));
             task2.setObservacao(resultSet.getString("observacao"));
             task2.setPrazo(resultSet.getDate("prazo"));
             task2.setDatadeCriacao(resultSet.getDate("datadeCriacao"));
             task2.setDatadeAtualizacao(resultSet.getDate("datadeAtualizacao"));
             task2.setIdProject(resultSet.getInt("idProject"));
             
             task.add(task2);
             
        }  catch (Exception ex) {
           throw new RuntimeException("Erro ao inserir terefa" + ex.getMessage(),  ex); 
        }finally {                                        //sempte é executado //
            
            ConnectionFactory.closeConnection(connection, statement, resultSet);   // aqui tambem precisa fechao o resultset//
            
        }
          return task;                   // retorna a lista de tarefas que foi criada e carregada do banco de dados // 
            
    }                        //existem fremeworks que fazem isso.//

    public List<Task> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.//
    }
    
    
       
 }                
    
  

