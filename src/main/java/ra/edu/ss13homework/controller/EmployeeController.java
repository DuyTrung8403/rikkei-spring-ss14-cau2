package ra.edu.ss13homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.ss13homework.model.Employee;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1L, "Nguyễn Công Hướng", 5000.0),
                new Employee(2L, "Phạm Tuấn Bình", 5000.0),
                new Employee(3L, "Nguyễn Văn A", 3000.0)
        );
    }
}
