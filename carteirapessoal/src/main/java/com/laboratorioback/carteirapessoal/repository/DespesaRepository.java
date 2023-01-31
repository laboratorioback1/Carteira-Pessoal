package com.laboratorioback.carteirapessoal.repository;

import com.laboratorioback.carteirapessoal.model.Despesa;
import com.laboratorioback.carteirapessoal.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DespesaRepository extends JpaRepository<Despesa,Long> {
}
