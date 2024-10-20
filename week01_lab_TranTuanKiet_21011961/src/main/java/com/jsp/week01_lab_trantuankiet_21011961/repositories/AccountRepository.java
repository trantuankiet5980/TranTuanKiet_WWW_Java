package com.jsp.week01_lab_trantuankiet_21011961.repositories;

import com.jsp.week01_lab_trantuankiet_21011961.models.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class AccountRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Account account) {
        entityManager.persist(account);
    }
    @Transactional
    public void update(Account account) {
        entityManager.merge(account);
    }
    @Transactional
    public void delete(Account account) {
        entityManager.remove(entityManager.contains(account) ? account : entityManager.merge(account));
    }
    public Account findById(int id) {
        return entityManager.find(Account.class, id);
    }

    public List<Account> findAll() {
        return entityManager.createQuery("SELECT a FROM Account a", Account.class).getResultList();
    }
}
