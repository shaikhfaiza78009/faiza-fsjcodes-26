package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (checkCredentials(email, password)) {
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("login.jsp?message=invalid");
        }
    }

    private boolean checkCredentials(String email, String password) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Faiza_DB",
                "root",
                "2005"
            );

            String sql = "SELECT * FROM users WHERE email = ? AND password = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean valid = rs.next();

            rs.close();
            ps.close();
            conn.close();

            return valid;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
