package com.cibt.app.ecommercesite.Controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test {
    
   public static void main(String[] args) {
    BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
    String pw="user123";
    System.out.println(encoder.encode(pw));
   }
    
}