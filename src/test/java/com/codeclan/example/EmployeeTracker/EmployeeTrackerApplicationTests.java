package com.codeclan.example.EmployeeTracker;

import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository theEmployeeRepository;

	@Test
		void contextLoads() {

		Employee mrBean = new Employee("Mister", "Bean", "bean@gmail.com", 40);

		theEmployeeRepository.save(mrBean);

	}

}
