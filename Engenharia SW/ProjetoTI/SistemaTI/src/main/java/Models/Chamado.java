package Models;

import java.time.LocalDate;
import java.util.Date;

public class Chamado {
    private String codigo;
    private String titulo;
    private Date dataCriacao;
    private String prioridade;
    private String status;
    private String descricao;
    private int codCriador;
    private int codResponsavel;
    private int chamadoCounter = 1;

    public Chamado(String codigo, String titulo, Date dataCriacao, String prioridade, String status, String descricao, int codCriador, int codResponsavel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.prioridade = prioridade;
        this.status = status;
        this.descricao = descricao;
        this.codCriador = codCriador;
        this.codResponsavel = codResponsavel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCodCriador(){return this.codCriador; }
    public void setCodCriador(int codCriador){ this.codCriador = codCriador; }

    public int getCodResponsavel() {
        return codResponsavel;
    }

    public void setCodResponsavel(int codResponsavel) {
        this.codResponsavel = codResponsavel;
    }

    public String gerarCodigoNovoChamadoChamado(){
        int codigo = chamadoCounter;
        String newChamado = "NEW000"+codigo;
        chamadoCounter++;
        return newChamado;
    }

}
