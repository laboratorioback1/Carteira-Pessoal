package com.laboratorioback.carteirapessoal.repository;


import com.laboratorioback.carteirapessoal.enuns.TipoReceita;
import com.laboratorioback.carteirapessoal.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface ReceitaRepository extends JpaRepository<Receita,Long> {

   List<Receita> findByReceitaAtualBetween(Date start, Date end);


}
