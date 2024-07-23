package me.dio.santander_dev_2024.service;

import me.dio.santander_dev_2024.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
