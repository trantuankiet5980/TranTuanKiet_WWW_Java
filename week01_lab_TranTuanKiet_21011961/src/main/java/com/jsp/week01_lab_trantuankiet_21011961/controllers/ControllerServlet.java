package com.jsp.week01_lab_trantuankiet_21011961.controllers;

import com.jsp.week01_lab_trantuankiet_21011961.models.Account;
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
                String fullName = request.getParameter("full_name");
                String password = request.getParameter("password");
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                int status = Integer.parseInt(request.getParameter("status"));

                Account account = new Account();
                account.setFull_name(fullName);
                account.setPassword(password);
                account.setEmail(email);
                account.setPhone(phone);
                account.setStatus(status);

                accountService.addAccount(account);
                response.sendRedirect("success.jsp");
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
