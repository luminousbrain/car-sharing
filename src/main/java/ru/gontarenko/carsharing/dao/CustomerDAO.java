package ru.gontarenko.carsharing.dao;

import ru.gontarenko.carsharing.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    boolean save(Customer customer);
    void update(Customer customer);
    List<Customer> findAll();
}
