package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        Customer customerAdd = customerService.addCustomer(customer);
        return customerAdd;
    }
    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id,@RequestBody Customer customer){
        return customerService.updateCustomer(id,customer);
    }

}
