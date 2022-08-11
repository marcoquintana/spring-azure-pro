package com.nttdata.azure.pro.model.service;

import com.nttdata.azure.pro.model.document.Customer;
import java.util.HashSet;

public interface CustomerService {
  HashSet<Customer> getAll();
  Customer findByID(long id);
  void add(Customer b);
  void deleteAll();
}
