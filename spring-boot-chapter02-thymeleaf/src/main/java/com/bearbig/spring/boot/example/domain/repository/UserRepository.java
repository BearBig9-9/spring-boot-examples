package com.bearbig.spring.boot.example.domain.repository;

import com.bearbig.spring.boot.example.domain.entity.User;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.boot.example.domain.repository 2017/2/5 09:24 xiongyu $
 */
public interface UserRepository {

    User selectById(String id);
}
