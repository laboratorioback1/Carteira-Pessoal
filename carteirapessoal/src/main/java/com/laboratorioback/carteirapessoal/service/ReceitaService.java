package com.laboratorioback.carteirapessoal.service;


import com.laboratorioback.carteirapessoal.enuns.TipoReceita;
import com.laboratorioback.carteirapessoal.repository.ReceitaRepository;


import com.laboratorioback.carteirapessoal.model.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    public List<Receita> obterReceitas() {
        List<Receita> receitas = receitaRepository.findAll();
        return receitas;
    }


    public Receita findById(long id) {
        Optional<Receita> receita = receitaRepository.findById(id);
        return receita.get();
    }

    public Receita salvarReceita(Receita novareceita) {
        Receita receitaSalva = receitaRepository.save(novareceita);
        return receitaSalva;
    }

    public void deleteById(Long id) {
        if (receitaRepository.existsById(id)) {
            receitaRepository.deleteById(id);
        }
    }


    public List<Receita> obterReceitas(Date start, Date end) {
        if (start != null && end != null) {
            List<Receita> receitas = receitaRepository.findByReceitaAtualBetween(start, end);
            return receitas;
        }
        List<Receita> receitas = receitaRepository.findAll();
        return receitas;


    }


    public BigDecimal somaTodasReceitas(Date start, Date end) {

            List<Receita> receitas = receitaRepository.findByReceitaAtualBetween(start, end);
            BigDecimal somaReceita = receitas.stream()
                    .map(Receita::getValorReceita)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            return somaReceita;
    }
}