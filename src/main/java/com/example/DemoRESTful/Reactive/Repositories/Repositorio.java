package com.example.DemoRESTful.Reactive.Repositories;

import com.example.DemoRESTful.Reactive.Collections.Dato;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Repositorio extends ReactiveMongoRepository<Dato, String> {
}