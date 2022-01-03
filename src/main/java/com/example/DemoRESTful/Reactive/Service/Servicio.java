package com.example.DemoRESTful.Reactive.Service;

import com.example.DemoRESTful.Reactive.Collections.Dato;
import com.example.DemoRESTful.Reactive.Repositories.Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class Servicio {
    @Autowired
    Repositorio repositorio;
    public Mono<Dato> crear(Dato dato){
        return repositorio.save(dato);
    }
    public Flux<Dato> buscarTodos() {
        return repositorio.findAll();
    }
}
