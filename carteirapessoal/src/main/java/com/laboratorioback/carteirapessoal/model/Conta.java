package com.laboratorioback.carteirapessoal.model;

import com.laboratorioback.carteirapessoal.enuns.TipoConta;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
public class Conta {

    @Id
    @GeneratedValue
    private Long id;
    private double saldo;
    private TipoConta tipoConta;
    private String instituicaoFinanceira;
    @OneToMany
    private List<Receita> receita = new ArrayList<>();

    @OneToMany
    private List<Despesa> despesa = new ArrayList<>();
    public Conta() {
    }

    public Conta(Long id, double saldo, TipoConta tipoConta, String instituicaoFinanceira, List<Receita> receita, List<Despesa> despesa) {
        this.id = id;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.receita = receita;
        this.despesa = despesa;
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

    public List<Receita> getReceita() {
        return receita;
    }

    public void setReceita(List<Receita> receita) {
        this.receita = receita;
    }

    public List<Despesa> getDespesa() {
        return despesa;
    }

    public void setDespesa(List<Despesa> despesa) {
        this.despesa = despesa;
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
