package customers;

import java.util.List;

import org.springframework.data.repository.CrudRepository; // https://docs.spring.io/autorepo/docs/spring-data-commons/1.5.1.RELEASE/api/org/springframework/data/repository/CrudRepository.html

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}