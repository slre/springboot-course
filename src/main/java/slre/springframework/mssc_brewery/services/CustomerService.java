package slre.springframework.mssc_brewery.services;

import org.springframework.http.HttpStatusCode;
import slre.springframework.mssc_brewery.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}
