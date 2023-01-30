package com.laboratorioback.carteirapessoal.model;

import com.laboratorioback.carteirapessoal.enuns.TipoConta;

import java.util.Objects;

public class Conta {

    private Long id;
    private double saldo;
    private TipoConta tipoConta;
    private String instituicaoFinanceira;

    public Conta() {
    }

    public Conta(Long id, double saldo, TipoConta tipoConta, String instituicaoFinanceira) {
        this.id = id;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }

    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return id.equals(conta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
