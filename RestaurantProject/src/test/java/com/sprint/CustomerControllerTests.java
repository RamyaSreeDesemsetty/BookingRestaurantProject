//package com.sprint;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//
//import com.sprint.controllers.CustomerController;
//import com.sprint.dto.CustomerDTO;
//import com.sprint.exceptions.CustomerAlreadyExistsException;
//import com.sprint.service.CustomerService;
//
//
//public class CustomerControllerTests {
//
//    @Mock
//    private CustomerService customerService;
//
//    @InjectMocks
//    private CustomerController customerController;
//
//    @Test
//    public void testRegisterCustomer() throws CustomerAlreadyExistsException {
//        // Arrange
//        CustomerDTO customerDTO = new CustomerDTO();
//        customerDTO.setName("John Doe");
//        customerDTO.setEmail("johndoe@example.com");
//        customerDTO.setPassword("password");
//        customerDTO.setPhoneNumber("1234567890");
//
//        CustomerDTO expectedCustomerDTO = new CustomerDTO();
//        expectedCustomerDTO.setId(1L);
//        expectedCustomerDTO.setName("John Doe");
//        expectedCustomerDTO.setEmail("johndoe@example.com");
//        expectedCustomerDTO.setPassword("password");
//        expectedCustomerDTO.setPhoneNumber("1234567890");
//
//        when(customerService.registerCustomer(customerDTO)).thenReturn(expectedCustomerDTO);
//
//        // Act
//        ResponseEntity<CustomerDTO> response = customerController.registerCustomer(customerDTO);
//
//        // Assert
//        assertEquals(HttpStatus.CREATED, response.getStatusCode());
//        assertEquals(expectedCustomerDTO, response.getBody());
//    }
//
//}
