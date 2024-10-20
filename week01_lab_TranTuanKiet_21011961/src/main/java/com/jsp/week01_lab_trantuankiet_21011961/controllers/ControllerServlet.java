package com.jsp.week01_lab_trantuankiet_21011961.controllers;

import com.jsp.week01_lab_trantuankiet_21011961.entities.Account;
import com.jsp.week01_lab_trantuankiet_21011961.services.AccountService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ControllerServlet", urlPatterns = {"/controller"})
public class ControllerServlet extends HttpServlet {

    @Inject
    private AccountService accountService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "addAccount":

                break;

            case "updateAccount":
                // Xử lý cập nhật tài khoản
                break;

            case "deleteAccount":
                // Xử lý xóa tài khoản
                break;

            // Các chức năng khác tương tự
        }
    }
}
