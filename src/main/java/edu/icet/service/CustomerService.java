package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        CustomerEntity customerEntity=new CustomerEntity();

        customerEntity.setName(customer.getName());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setPassword(customerEntity.getPassword());

        customerRepository.save(customerEntity);

        return new Customer(customerEntity.getId(),
                customerEntity.getName(),
                customerEntity.getEmail(),
                customerEntity.getPassword()
                );

    }

    public List<Customer> getAll() {
        List<CustomerEntity> all=customerRepository.findAll();
        List<Customer> list=new ArrayList<>();
        for(CustomerEntity customerEntity:all){
            list.add(new Customer(customerEntity.getId(),
                    customerEntity.getName(),
                    customerEntity.getEmail(),
                    customerEntity.getPassword()
            ));

        }
        return list;
    }

    public Customer updateCustomer(Long id,Customer customer) {
        Optional<CustomerEntity> byId = customerRepository.findById(id);
        if(byId.isEmpty()) {
            return null;
        }
            CustomerEntity customerEntity=byId.get();

        customerEntity.setName(customer.getName());
        customerEntity.setPassword(customer.getPassword());
        customerEntity.setEmail(customer.getEmail());

        customerRepository.save(customerEntity);

        return new Customer(
                customerEntity.getId(),
                customerEntity.getName(),
                customerEntity.getEmail(),
                customerEntity.getPassword()
                );
        }

}