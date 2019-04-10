package sample.projects.nationalparks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.projects.nationalparks.model.Visitor;


@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Integer>
{
}
