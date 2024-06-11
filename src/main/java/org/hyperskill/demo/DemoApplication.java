package org.hyperskill.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

/* 
    @Bean
    public Customer customer(@Autowired String address) {
        return new Customer("Pickachu", address);
    }

	@Bean
public Customer temporary(@Autowired Customer customer) {
    System.out.println(customer);
    return customer;
}

@Configuration
public class Addresses {

    @Bean
    public String address() {
        return "Oliver Avenue, 102";
    }

}


class Customer {
    private final String name;
    private final String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getters

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}*/

}
