package com.laboratorioback.carteirapessoal.Repository;

import com.laboratorioback.carteirapessoal.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReceitaRepository extends JpaRepository<Receita,Long> {
}
