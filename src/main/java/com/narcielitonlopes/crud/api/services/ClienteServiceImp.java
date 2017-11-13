package com.narcielitonlopes.crud.api.services;

import com.narcielitonlopes.crud.api.document.Cliente;
import com.narcielitonlopes.crud.api.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public List<Cliente> listarTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente listarPorId(String id) {
        return this.clienteRepository.findOne(id);
    }

    @Override
    public Cliente cadastrar(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente atualizar(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public void remover(String id) {
        this.clienteRepository.delete(id);
    }
}
