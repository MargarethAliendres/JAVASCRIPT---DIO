
package Model;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;



public class Project {
   private int id;
   private String nome; 
   private String descricao;
   private Date datadeCriacao;
   private Date datadeAtualizacao;

    public Project(int id, String nome, String descricao, Date datadeCriacao, Date datadeAtualizacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.datadeCriacao = datadeCriacao;
        this.datadeAtualizacao = datadeAtualizacao;
    }

public Project() {
        this.datadeCriacao = new Date();
        this.datadeAtualizacao = new Date();
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDatadeCriacao() {
        return datadeCriacao;
    }

    public void setDatadeCriacao(Date datadeCriacao) {
        this.datadeCriacao = datadeCriacao;
    }

    public Date getDatadeAtualizacao() {
        return datadeAtualizacao;
    }

    public void setDatadeAtualizacao(Date datadeAtualizacao) {
        this.datadeAtualizacao = datadeAtualizacao;
    }
    
    @Override
    public String toString() {
        return nome;
    }

    public String size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}



