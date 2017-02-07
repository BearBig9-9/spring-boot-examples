package com.bearbig.spring.boot.example.domain.repository.impl;

import com.bearbig.spring.boot.example.domain.entity.User;
import com.bearbig.spring.boot.example.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.boot.example.domain.repository.impl 2017/2/5 09:26 xiongyu $
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private static Map<String, User> userMap = new HashMap<>();

    // 初始化测试数据
    static {
        userMap.put("1", new User("1", "张三", "1"));
        userMap.put("2", new User("2", "李思", "2"));
        userMap.put("3", new User("3", "万物", "3"));
        userMap.put("4", new User("4", "赵柳", "4"));
        userMap.put("5", new User("5", "王霸", "5"));
    }

    @Override
    public User selectById(String id) {
        return userMap.get(id);
    }
}
