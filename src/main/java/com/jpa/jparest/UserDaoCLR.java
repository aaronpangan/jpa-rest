package com.jpa.jparest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoCLR implements CommandLineRunner {

    @Autowired
    UserDao userDao;

    @Override
    public void run(String... args) throws Exception {
        UserEntity user = new UserEntity("Aaa", "bbbb");
        userDao.insert(user);

    }

}
