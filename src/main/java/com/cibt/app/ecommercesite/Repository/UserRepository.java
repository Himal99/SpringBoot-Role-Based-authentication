package com.cibt.app.ecommercesite.Repository;

import com.cibt.app.ecommercesite.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer> {
    
    @Query("select u from User u where u.username= :username")
    public User getUserByUsername(@Param("username") String username);
}