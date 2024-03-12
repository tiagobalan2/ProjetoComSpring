package com.example.demo.controller;

import com.example.demo.service.VeiculoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepository;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @GetMapping
    // GET
    public List<Veiculo> listarVeiculos() {
        return veiculoService.listarVeiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarVeiculoPorId(@PathVariable Long id) {
        Veiculo veiculo = veiculoService.listarVeiculoPorId(id);
        if (veiculo != null) {
            return ResponseEntity.ok(veiculo);
        } else {
            String mensagem = "O id informado não existe na base de dados";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
    }

    @PostMapping
    // POST
    public Veiculo criar(@Valid @RequestBody Veiculo veiculo) {
        return veiculoService.criar(veiculo);
    }

    @PutMapping("/{id}")
    //PUT
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        if(veiculoService.atualizar(id, veiculo) == null) {
            String mensagem = "O id informado não existe na base de dados";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
        return ResponseEntity.ok(veiculo);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        if (veiculoService.deletar(id)) {
            String mensagem = "A deleção do id: " + id + " foi realizada com sucesso";
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(mensagem);
        }
        String mensagem = "O id informado não existe na base de dados";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
    }

    @GetMapping("/quantidade-veiculos")
    // GET quantidade-veiculos
    public int quantidadeveiculos() {
        return veiculoService.quantidadeVeiculos();
    }

}

