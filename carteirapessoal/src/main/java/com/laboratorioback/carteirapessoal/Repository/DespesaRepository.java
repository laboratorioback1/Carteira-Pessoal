package com.laboratorioback.carteirapessoal.Repository;

import com.laboratorioback.carteirapessoal.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DespesaRepository extends JpaRepository<Receita,Long> {
}
