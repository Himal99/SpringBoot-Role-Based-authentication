package com.cibt.app.ecommercesite.AuthController;

import com.cibt.app.ecommercesite.Entity.User;
import com.cibt.app.ecommercesite.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService{
   
    @Autowired
    private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=repository.getUserByUsername(username);
        
        if(user==null){
            throw new UsernameNotFoundException("username not found");
        }
		return new MyUserDetail(user);
	}
    
}