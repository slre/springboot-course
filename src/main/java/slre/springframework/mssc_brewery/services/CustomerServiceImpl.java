package slre.springframework.mssc_brewery.services;

import org.springframework.stereotype.Service;
import slre.springframework.mssc_brewery.model.CustomerDTO;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .customerId(UUID.randomUUID())
                .customerName("HOOTERS")
                .build();
    }
}
