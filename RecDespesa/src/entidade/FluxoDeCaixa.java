/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Eduardo Back
 */
public class FluxoDeCaixa {
    int id;
    double valor;
    String descricao;
    char pagarreceber;
    int codcat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getPagarreceber() {
        return pagarreceber;
    }

    public void setPagarreceber(char pagarreceber) {
        this.pagarreceber = pagarreceber;
    }

    public int getCodcat() {
        return codcat;
    }

    public void setCodcat(int codcat) {
        this.codcat = codcat;
    }
    
}
