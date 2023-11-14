package br.com.treinaweb.twtodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twtodos.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
