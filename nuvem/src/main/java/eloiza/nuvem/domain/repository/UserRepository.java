package eloiza.nuvem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eloiza.nuvem.domain.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
