
package Model;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


public class Task {
    
 private int id;
 private String nome;
 private String descricao;
 private boolean completada;
 private String observacao;
 private Date prazo;
 private Date datadeCriacao;
 private Date datadeAtualizacao;
 private int idProject;

    public Task(int id, String nome, String descricao, boolean completada, String observacao, Date prazo, Date datadeCriacao, Date datadeAtualizacao, int idProject) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.completada = completada;
        this.observacao = observacao;
        this.prazo = prazo;
        this.datadeCriacao = datadeCriacao;
        this.datadeAtualizacao = datadeAtualizacao;
        this.idProject = idProject;
    }
 public Task() {
        this.completada = false;
        this.datadeCriacao = new Date();
        this.datadeAtualizacao= new Date();
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

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
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

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", completada=" + completada + ", observacao=" + observacao + ", prazo=" + prazo + ", datadeCriacao=" + datadeCriacao + ", datadeAtualizacao=" + datadeAtualizacao + ", idProject=" + idProject + '}';
    }
    
}
