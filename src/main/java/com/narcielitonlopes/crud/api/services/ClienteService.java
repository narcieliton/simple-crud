package com.narcielitonlopes.crud.api.services;

import com.narcielitonlopes.crud.api.document.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> listarTodos();

    Cliente listarPorId(String id);

    Cliente cadastrar(Cliente cliente);

    Cliente atualizar(Cliente cliente);

    void remover(String id);
}
