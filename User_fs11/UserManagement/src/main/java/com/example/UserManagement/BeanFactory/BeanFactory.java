package com.example.UserManagement.BeanFactory;

import com.example.UserManagement.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration // making an object -- who search by bean
public class BeanFactory {
    @Bean
    public List<User> getUserList() {
        return new ArrayList<>();
    }
}