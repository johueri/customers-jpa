package customers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //That will wire us up to the relational database(???)
public class Customer {

    @Id // This annotation is saying this will be the identifier of this entry. This is what's generating the identifier. 
    @GeneratedValue(strategy=GenerationType.AUTO) //This will auto generate an ID. These annotations will only impact the id.
    private Long id;
    private String firstName;
    private String lastName;

    //This is a default constructor. it is a JPA required no args constructor. 
    //Every object class you define has a default constructor but it only exists if you do not create a constructor.
    //Because we are creating a constructor here it gets rid of the no args constructor JPA needs to run, so we're creating it again.
    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getLastName() {
    	return lastName;
    }
    public String getFirstName() {
    	return firstName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}