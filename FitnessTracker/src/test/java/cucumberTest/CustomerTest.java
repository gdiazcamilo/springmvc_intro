package cucumberTest;

import org.junit.Test;
import org.springframework.util.Assert;

import local.gdiaz.fitnesstracker.model.Customer;

public class CustomerTest {

	
	@Test
	public void customerFirstNameIsGustavo() {
		Customer c = new Customer();
		c.setFirstName("Gustavo");
		
		junit.framework.Assert.assertEquals("Gustavo", c.getFirstName());
	}
	
}
