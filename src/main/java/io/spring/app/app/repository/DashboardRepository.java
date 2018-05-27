package io.spring.app.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.spring.app.app.core.Conteudo;
@Repository
public interface DashboardRepository extends JpaRepository<Conteudo, Long> {

}
