package com.nttdata.azure.pro.service;

import com.nttdata.azure.pro.model.document.Customer;
import com.nttdata.azure.pro.model.service.CustomerService;
import org.springframework.stereotype.Service;
import java.util.HashSet;

@Service
public class CustomerServiceImpl implements CustomerService {

  private HashSet<Customer> customerList = new HashSet<Customer>();
  /**
   * @return
   */
  @Override
  public HashSet<Customer> getAll() {
    if (customerList.isEmpty())
      return null;
    else
      return customerList;
  }

  /**
   * @param id
   * @return
   */
  @Override
  public Customer findByID(long id) {
    Customer customer = customerList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
    return customer;
  }

  /**
   * @param b
   */
  @Override
  public void add(Customer b) {
    customerList.add(b);
  }

  /**
   *
   */
  @Override
  public void deleteAll() {
    customerList.clear();
  }
}
