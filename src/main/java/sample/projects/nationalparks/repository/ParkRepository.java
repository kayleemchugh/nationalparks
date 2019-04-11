package sample.projects.nationalparks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.projects.nationalparks.model.Park;

public interface ParkRepository extends JpaRepository<Park, Integer>
{
}
