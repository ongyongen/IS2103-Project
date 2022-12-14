/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.Customer;
import exception.InvalidLoginCredentialException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ongyongen
 */
@Local
public interface CustomerSessionBeanLocal {
    public Long createNewCustomer(Customer customer);
   
    public List<Customer> retrieveAllCustomers();
    public Customer retrieveCustomerByEmail(String email);

}
