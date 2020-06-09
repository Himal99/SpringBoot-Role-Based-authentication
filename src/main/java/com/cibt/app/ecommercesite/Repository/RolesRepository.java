package com.cibt.app.ecommercesite.Repository;

import com.cibt.app.ecommercesite.Entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Role,Integer> {
    
}