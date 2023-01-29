package com.laboratorioback.carteirapessoal.controller;


import com.laboratorioback.carteirapessoal.model.Receita;
import com.laboratorioback.carteirapessoal.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/receita")
public class ReceitaController {

    @Autowired
    ReceitaService service;

    @GetMapping
    public ResponseEntity<List<Receita>> listaTodasReceitas() {
        List<Receita> receitas = service.obterReceitas();
        return new ResponseEntity<>(receitas, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Receita> getReceita(@PathVariable long id) {
        Receita receita;
        try {
            receita = service.findById(id);
            return new ResponseEntity<>(receita, HttpStatus.OK);
        } catch (NoSuchElementException nsee) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<Receita> saveNovaReceita(@RequestBody Receita receita) {
        service.salvarReceita(receita);
        return new ResponseEntity<>(receita, HttpStatus.OK);

    }
}




























































































































































































































































































































































