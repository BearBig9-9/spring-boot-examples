package com.bearbig.spring.boot.example.service;

import com.bearbig.spring.boot.example.domain.entity.User;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.boot.example.service 2017/2/5 09:25 xiongyu $
 */
public interface UserService {

    User findUserById(String id);
}
