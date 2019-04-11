package sample.projects.nationalparks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sample.projects.nationalparks.model.Employee;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

   @Query("UPDATE Employee as employee set employee.isActive = false where id = :id")
   public Employee deactivateEmployee(@Param("id") Integer id);

   @Query("SELECT employee from Employee employee WHERE parkId = :parkId")
   public List<Employee> getEmployeesByParkId(@Param("parkId") Integer parkId);


}
