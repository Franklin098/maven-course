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

@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Integer price = Integer.parseInt(req.getParameter("price"));
        String name = req.getParameter("name");
        String description = req.getParameter("description");

        Product product = new Product();
        product.setId(id);
        product.setPrice(price);
        product.setName(name);
        product.setDescription(description);

        ProductBO bo = new ProductBOImpl();
        bo.create(product);

        resp.getWriter().print("Product Created !!");
    }
}
