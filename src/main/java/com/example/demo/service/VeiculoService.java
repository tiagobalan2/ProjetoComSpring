package com.example.demo.service;

import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    VeiculoRepository veiculoRepository;

    // metodo para get
    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    //metodo para get com id
    public Veiculo listarVeiculoPorId(Long id) {
        //verificar se o id é valido
        if (veiculoRepository.existsById(id)) {
            //retornar o veiculo com o id passado
            return veiculoRepository.findById(id).orElse(null);
        }
        return null;
    }

    // metodo para post
    public Veiculo criar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    // metodo para get com id
    // elaborar

    // metodo para put
    public Veiculo atualizar(Long id, Veiculo veiculo) {
        // verificar se o id é valido
        if (veiculoRepository.existsById(id)) {
            //atualizar o objeto na base
            veiculo.setId(id);
            return veiculoRepository.save(veiculo);
        }
        return null;
        // nao realiza nenhuma alteracao
    }

    // metodo para delete
    public boolean deletar(Long id) {
        if (veiculoRepository.existsById(id)) {
            veiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public int quantidadeVeiculos() {
        return veiculoRepository.findAll().size();
    }
}
