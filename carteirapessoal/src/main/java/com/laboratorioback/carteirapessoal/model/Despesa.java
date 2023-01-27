package com.laboratorioback.carteirapessoal.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Despesa {

    private Long id;
    private BigDecimal valor;
    private Date pagamentoDespesa;
    private Date vencimentoDespesa;

    public Despesa(Long id, BigDecimal valor, Date pagamentoDespesa, Date vencimentoDespesa) {
        this.id = id;
        this.valor = valor;
        this.pagamentoDespesa = pagamentoDespesa;
        this.vencimentoDespesa = vencimentoDespesa;

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
