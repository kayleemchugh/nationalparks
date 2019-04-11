package sample.projects.nationalparks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sample.projects.nationalparks.model.Employee;
import sample.projects.nationalparks.model.ServiceRequest;

import javax.xml.ws.Service;
import java.util.List;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Integer>
{

   @Query("SELECT serviceRequest from ServiceRequest serviceRequest WHERE parkId = :parkId")
   public List<ServiceRequest> getServiceRequestsByParkId(@Param("parkId") Integer parkId);
}
