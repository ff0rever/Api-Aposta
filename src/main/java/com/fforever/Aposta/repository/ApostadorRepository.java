package com.fforever.Aposta.repository;

import com.fforever.Aposta.model.Apostador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApostadorRepository extends JpaRepository<Apostador, Long> {


}
