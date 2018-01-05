//package customers;
//import javax.annotation.Resource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//// https://wecancodeit.github.io/java-resources/spring/getting-started-guides/accessing-data-with-jpa/
//@Component
//public class CustomerPopulator implements CommandLineRunner {
//
//	private Logger log = LoggerFactory.getLogger(CustomerPopulator.class);
//
//	@Resource
//	private CustomerRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception { //This is called "exception handling". This will print out specific errors depending on whatever's not working properly. 
//		//If we are querying our directory incorrectly, it shoots back a message 
//		//the "..." after string basically tells it accept as many strings as you want it to; an infinte amount of strings. 
//		
//		// save a couple of customers
//		repository.save(new Customer("Jack", "Bauer"));
//		repository.save(new Customer("Chloe", "O'Brian"));
//		repository.save(new Customer("Kim", "Bauer"));
//		repository.save(new Customer("David", "Palmer"));
//		repository.save(new Customer("Michelle", "Dessler"));
//
//		// fetch all customers
//		log.info("Customers found with findAll():");
//		log.info("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			log.info(customer.toString());
//		}
//		log.info("");
//
//		// fetch an individual customer by ID
//		Customer customer = repository.findOne(1L);
//		log.info("Customer found with findOne(1L):");
//		log.info("--------------------------------");
//		log.info(customer.toString());
//		log.info("");
//
//		// fetch customers by last name
//		log.info("Customer found with findByLastName('Bauer'):");
//		log.info("--------------------------------------------");
//		for (Customer bauer : repository.findByLastName("Bauer")) {
//			log.info(bauer.toString());
//		}
//		log.info("");
//	}
//
//}