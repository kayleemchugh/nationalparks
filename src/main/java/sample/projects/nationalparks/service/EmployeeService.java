package sample.projects.nationalparks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.projects.nationalparks.model.Employee;
import sample.projects.nationalparks.model.Visitor;
import sample.projects.nationalparks.repository.EmployeeRepository;
import sample.projects.nationalparks.repository.VisitorRepository;

import java.util.List;

@Service
public class EmployeeService
{

   private EmployeeRepository employeeRepository;

   @Autowired
   public EmployeeService(
         EmployeeRepository employeeRepository) {
      this.employeeRepository = employeeRepository;
   }

   public Employee getEmployeeById(Integer id) {

      return  employeeRepository.getOne(id);
   }

   public List<Employee> getEmployeesByPark(Integer parkId) {

      return employeeRepository.getEmployeesByParkId(parkId);
   }

   public Employee saveEmployee(Employee employee) {

      return employeeRepository.save(employee);
   }

   public Employee updateEmployee(Integer employeeId, Employee employee) {
      if(!employeeId.equals(employee.getId())) {
         throw new Error("Please pass in the same visitor object as the id in your request");
      }

      return employeeRepository.save(employee);
   }

   public Employee deactivateEmployee(Integer employeeId) {

      return employeeRepository.deactivateEmployee(employeeId);
   }
}
