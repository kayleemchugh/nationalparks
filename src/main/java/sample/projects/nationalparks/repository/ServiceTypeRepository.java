package sample.projects.nationalparks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.projects.nationalparks.model.ServiceType;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Integer>
{
}
