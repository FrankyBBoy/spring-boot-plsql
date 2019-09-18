package com.example.queryplsql.intervenant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntervenantDao extends JpaRepository<Intervenant, Integer> {
}
