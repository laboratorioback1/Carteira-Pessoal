package com.laboratorioback.carteirapessoal.model;

import com.laboratorioback.carteirapessoal.enuns.TipoReceita;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
public class Receita {
    @Id
    @GeneratedValue()
    private Long id;
    //valor receita
    private BigDecimal valorReceita;
    //data recebimento esperado

    private Date recebimentoEsperado;
    //data recebimento atual

    private Date receitaAtual;
    //descrição
    private String descricao;

    private TipoReceita tipoReceita;

    private Receita(){

    }

    public Receita(Long id, BigDecimal valorReceita, Date recebimentoEsperado, Date receitaAtual, String descricao, TipoReceita tipoReceita) {
        this.id = id;
        this.valorReceita = new BigDecimal(String.valueOf(valorReceita));
        this.recebimentoEsperado = recebimentoEsperado;
        this.receitaAtual = receitaAtual;
        this.descricao = descricao;
        this.tipoReceita = tipoReceita;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorReceita() {
        return valorReceita;
    }

    public void setValorReceita(BigDecimal valorReceita) {
        this.valorReceita = valorReceita;
    }

    public Date getRecebimentoEsperado() {
        return recebimentoEsperado;
    }

    public void setRecebimentoEsperado(Date recebimentoEsperado) {
        this.recebimentoEsperado = recebimentoEsperado;
    }

    public Date getReceitaAtual() {
        return receitaAtual;
    }

    public void setReceitaAtual(Date receitaAtual) {
        this.receitaAtual = receitaAtual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(TipoReceita tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receita receita = (Receita) o;
        return id.equals(receita.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
