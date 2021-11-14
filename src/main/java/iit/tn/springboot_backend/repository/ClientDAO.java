package iit.tn.springboot_backend.repository;

import iit.tn.springboot_backend.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDAO extends JpaRepository <Client, Long> {
}
