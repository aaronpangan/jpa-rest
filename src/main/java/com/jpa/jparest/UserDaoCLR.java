package com.jpa.jparest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoCLR implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    private static final Logger log = LoggerFactory.getLogger(UserDaoCLR.class);

    @Override
    public void run(String... args) throws Exception {
        UserEntity user = new UserEntity("Aaa", "bbbb");
        long Id = userDao.insert(user);
        log.info("New User Created");
    }

}
