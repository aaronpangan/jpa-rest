package com.jpa.jparest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(UserEntity user) {
        entityManager.persist(user);
        return user.Id;
    }

}
