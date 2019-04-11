package sample.projects.nationalparks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sample.projects.nationalparks.model.Employee;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

   @Modifying
   @Query("UPDATE Employee as employee set employee.isActive = :isActive where id = :id")
   public Integer setEmployeeIsActive(@Param("id") Integer id, @Param("isActive") Boolean isActive);

   @Query("SELECT employee from Employee employee WHERE parkId = :parkId")
   public List<Employee> getEmployeesByParkId(@Param("parkId") Integer parkId);


}
