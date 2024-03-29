package com.franklin.springcore.springcore.services;

import com.franklin.springcore.springcore.dao.PaymentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired // for dependency injection, spring search for an implementation of this interface
    private PaymentDAO dao;

    public PaymentDAO getDao() {
        return dao;
    }

    public void setDao(PaymentDAO dao) {
        this.dao = dao;
    }
}
