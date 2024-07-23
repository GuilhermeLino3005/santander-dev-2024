package me.dio.santander_dev_2024.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.santander_dev_2024.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
     boolean existsByAccountNumber(String accountNumber);

}