package com.shobana.load.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shobana.load.entity.Loads;

@Repository
public interface LoadRepository extends JpaRepository<Loads, Long> {
}
