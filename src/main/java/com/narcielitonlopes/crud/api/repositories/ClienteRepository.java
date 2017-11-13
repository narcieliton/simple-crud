package com.narcielitonlopes.crud.api.repositories;

import com.narcielitonlopes.crud.api.document.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
