package com.franklin.product.servlets;

import com.franklin.product.bo.ProductBO;
import com.franklin.product.bo.ProductBOImpl;
import com.franklin.product.dto.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DisplayProductDetailsServlet")
public class DisplayProductDetailsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductBO bo = new ProductBOImpl();
        Product product = bo.findProduct(Integer.parseInt(req.getParameter("id")));
        PrintWriter writer = resp.getWriter();
        writer.print("Product Details: ");
        writer.print(product.toString());
    }
}
