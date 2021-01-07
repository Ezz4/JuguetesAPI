package io.emma.Juguetes.repository;

import io.emma.Juguetes.model.Juguete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Declara un bean para juguete DAO (Bean de spring)
public interface JugueteDao extends JpaRepository<Juguete, Integer> {
}
