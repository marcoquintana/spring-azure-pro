package com.nttdata.azure.pro.api;

import java.util.ArrayList;
import java.util.HashSet;

import com.nttdata.azure.pro.model.document.Customer;
import com.nttdata.azure.pro.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @Autowired
  CustomerServiceImpl customerServiceImpl;

  @PostMapping("/")
  public void add(@RequestBody Customer customer) {
    customerServiceImpl.add(customer);
  }

  @GetMapping("/getall")
  public HashSet<Customer> getAll() {
    return customerServiceImpl.getAll();
  }

  @GetMapping("/findbyid/{id}")
  public Customer findById(@PathVariable long id) {
    return customerServiceImpl.findByID(id);
  }

  @DeleteMapping("/")
  public void deleteAll() {
    customerServiceImpl.deleteAll();
  }
}
