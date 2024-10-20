package com.jsp.week01_lab_trantuankiet_21011961.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class AppUtils {
    public static final String PERSISTENCE_UNIT_NAME = "MariaDB";
    public static EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    }
}
