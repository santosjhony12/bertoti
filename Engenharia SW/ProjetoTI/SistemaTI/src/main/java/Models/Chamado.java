package Models;

import java.time.LocalDate;
import java.util.Date;

public class Chamado {
    private int codigo;
    private String titulo;
    private LocalDate dataCriacao;
    private String prioridade;
    private String status;
    private String descricao;
    private int codCriador;
    private int codAnalista;

    public Chamado(int codigo, String titulo, LocalDate dataCriacao, String prioridade, String status, String descricao, int codCriador, int codAnalista) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.prioridade = prioridade;
        this.status = status;
        this.descricao = descricao;
        this.codCriador = codCriador;
        this.codAnalista = codAnalista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
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

    public int getCodAnalista() {
        return codAnalista;
    }

    public void setCodAnalista(int codAnalista) {
        this.codAnalista = codAnalista;
    }
}
