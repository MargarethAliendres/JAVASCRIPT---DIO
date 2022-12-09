
package Main;

import Controller.ProjectController;
import Controller.TaskController;
import Model.Project;
import Model.Task;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;



import util.ConnectionFactory;


public class Main {

    public static void main(String[] args) throws SQLException {
        
                 //      FAZER A CONEXAO COM O BANCO
               Connection c = ConnectionFactory.getConnection();
     

                            //  PROJETO
        
    //1-  inserir projeto   
    /*  ProjectController projectController = new ProjectController();
      Project project3 = new Project();
       project3.setNome("Derlon");
       project3.setDescricao("Aleluia");
       projectController.save(project3 );*/
              
     //2- atualizar projeto
     /*ProjectController projectController = new ProjectController();
      Project project3 = new Project();
      project3.setId(4);
      project3.setNome("Handd");
      project3.setDescricao("Te");
      projectController.update(project3);
      
      // 3 deletar projeto
      projectController.removeById(3);
       
      
      //4 listar todos os projetos
      //List<Project> project = projectController.getAll();
      //System.out.println("Lista de todos os projetos = " + project.size());*/
       
       
                           // TAREFAS
                           
                          
                           
      // TaskController taskController = new TaskController();
       
           //1 criar tarefa
              
         //  Task task = new Task();
           
           /*task.setNome("Derlon");
           task.setDescricao("gloria a Deus");
           task.setCompletada(true);
           task.setObservacao("observacao");
           task.setPrazo(new Date());
           task.setDatadeCriacao(new Date());
           task.setDatadeAtualizacao(new Date());
           task.setIdProject(4);
           
           taskController.save(task);*/
          
          // 2 
        TaskController taskController = new TaskController();
       /* Task task = new Task();
        task.setIdProject(4);
         task.setId(4);
         task.setNome("Handd");
         task.setDescricao("Te");
         taskController.update(task);*/
         
          
          // 3 deletar dados
      //projectController.removeById(3);
          
          //4 listar todas as tarefas
         // TaskController taskController = new TaskController();
        // Task task = new Task();              
        List<Task> task = taskController.getAll(4);  //o iddoprojeto que e para vir as tarefas
        System.out.println("Lista de todos os projetos = " + task.size());
           
           
           
           
            
            
       
       
       
       
       
       
       
       
        
                     
              
        
        
        // TODO code application logic here
    }
    
}
