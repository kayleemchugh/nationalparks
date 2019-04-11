package sample.projects.nationalparks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.projects.nationalparks.model.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Integer>
{
}
