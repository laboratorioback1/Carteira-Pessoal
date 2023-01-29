package com.laboratorioback.carteirapessoal.model;

import com.laboratorioback.carteirapessoal.enuns.TipoDespesa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;


@Entity
public class Despesa {
    @Id
    @GeneratedValue()
    private Long id;
    private BigDecimal valor;
    private Date pagamentoDespesa;
    private Date vencimentoDespesa;

    private TipoDespesa TipoDespesa;

    public Despesa(Long id, BigDecimal valor, Date pagamentoDespesa, Date vencimentoDespesa, com.laboratorioback.carteirapessoal.enuns.TipoDespesa tipoDespesa) {
        this.id = id;
        this.valor = valor;
        this.pagamentoDespesa = pagamentoDespesa;
        this.vencimentoDespesa = vencimentoDespesa;
        TipoDespesa = tipoDespesa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getPagamentoDespesa() {
        return pagamentoDespesa;
    }

    public void setPagamentoDespesa(Date pagamentoDespesa) {
        this.pagamentoDespesa = pagamentoDespesa;
    }

    public Date getVencimentoDespesa() {
        return vencimentoDespesa;
    }

    public void setVencimentoDespesa(Date vencimentoDespesa) {
        this.vencimentoDespesa = vencimentoDespesa;
    }

    public com.laboratorioback.carteirapessoal.enuns.TipoDespesa getTipoDespesa() {
        return TipoDespesa;
    }

    public void setTipoDespesa(com.laboratorioback.carteirapessoal.enuns.TipoDespesa tipoDespesa) {
        TipoDespesa = tipoDespesa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Despesa despesa = (Despesa) o;
        return id.equals(despesa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
