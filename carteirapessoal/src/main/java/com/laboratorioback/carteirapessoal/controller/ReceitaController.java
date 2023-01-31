package com.laboratorioback.carteirapessoal.controller;




import com.laboratorioback.carteirapessoal.enuns.TipoReceita;
import com.laboratorioback.carteirapessoal.model.Receita;
import com.laboratorioback.carteirapessoal.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/receita")
public class ReceitaController {



    @Autowired
    ReceitaService service;

    @GetMapping("/receitas")
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

    @PostMapping(path = "/receita")
    public ResponseEntity<Receita> saveNovaReceita(@RequestBody Receita receita) {
        service.salvarReceita(receita);
        return new ResponseEntity<>(receita, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Receita> deleteById(@PathVariable("id") Long id) {
        try {
            service.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException nsee) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping( )
    public ResponseEntity<List<Receita>> getAll(
            @RequestParam(required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date start,
            @RequestParam(required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date end
          //  @RequestParam(required = false) TipoReceita tipoReceita
    ) {
        List<Receita> receitas;
        receitas = service.obterReceitas(start, end);
        return new ResponseEntity<>(receitas, HttpStatus.OK);

    }
    @GetMapping("/soma")
    public ResponseEntity<BigDecimal> somaReceitas(
            @RequestParam(required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date start,
            @RequestParam(required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date end

    ){
        BigDecimal totalReceitas = service.somaTodasReceitas(start,end );
        return new ResponseEntity<>(totalReceitas,HttpStatus.OK);
    }

}






























































































































































































































































































































































