package com.exadel.bookingapp.demo.repo;

import com.exadel.bookingapp.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface UserRepository extends CrudRepository<User, UUID> {

}
