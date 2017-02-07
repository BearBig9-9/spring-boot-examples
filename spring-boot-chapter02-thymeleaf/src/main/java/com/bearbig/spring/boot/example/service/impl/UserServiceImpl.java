package com.bearbig.spring.boot.example.service.impl;

import com.bearbig.spring.boot.example.domain.entity.User;
import com.bearbig.spring.boot.example.domain.repository.UserRepository;
import com.bearbig.spring.boot.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.boot.example.service.impl 2017/2/5 09:26 xiongyu $
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserById(String id) {
        return userRepository.selectById(id);
    }
}
