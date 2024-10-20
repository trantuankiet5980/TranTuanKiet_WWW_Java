package com.jsp.week01_lab_trantuankiet_21011961.repositories;

public interface LogRepository {
    void saveTimeLogin(String accountId);
    void saveTimeLogout(String accountId);
}
