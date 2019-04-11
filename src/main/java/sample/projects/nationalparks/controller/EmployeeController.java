package sample.projects.nationalparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.projects.nationalparks.model.Employee;
import sample.projects.nationalparks.service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController
{
   private final EmployeeService employeeService;

   @Autowired
   public EmployeeController(EmployeeService employeeService){
      this.employeeService = employeeService;
   }

   @GetMapping("/{id}")
   public Employee getEmployee(@PathVariable(value="id") Integer id) {
      Employee employee = employeeService.getEmployeeById(id);
      if(employee == null) {
         throw new Error("could not find employee with this id");
      }
      return employee;
   }

   @GetMapping("/park/{id}")
   public List<Employee> getEmployeesByPark(@PathVariable(value="id") Integer id) {
      return employeeService.getEmployeesByPark(id);
   }

   @PostMapping
   public Employee saveEmployee(@RequestBody Employee employee) {
      return employeeService.saveEmployee(employee);
   }

   @PutMapping
   public Employee updateEmployee(@PathVariable(value="id") Integer id,
                                @RequestBody Employee employee) {
      return employeeService.updateEmployee(id, employee);
   }

   @PutMapping("/{id}/deactivate")
   public Employee deactivateEmployee(@PathVariable Integer id) {
      return employeeService.deactivateEmployee(id);
   }
}
