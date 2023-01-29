package com.laboratorioback.carteirapessoal.service;

import com.laboratorioback.carteirapessoal.Repository.ReceitaRepository;

import com.laboratorioback.carteirapessoal.model.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    public List<Receita> obterReceitas() {
        List<Receita> anuncios = receitaRepository.findAll();
        return anuncios;
    }

}
