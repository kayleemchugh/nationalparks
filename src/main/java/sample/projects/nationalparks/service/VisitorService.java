package sample.projects.nationalparks.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.projects.nationalparks.model.Visitor;
import sample.projects.nationalparks.repository.VisitorRepository;

@Service
public class VisitorService
{

   private VisitorRepository visitorRepository;

   @Autowired
   public VisitorService(
         VisitorRepository visitorRepository) {
      this.visitorRepository = visitorRepository;
   }

   public Visitor getVisitorById(Integer id) {
      return  visitorRepository.getOne(id);
   }

   public Visitor saveVisitor(Visitor visitor) {
      return visitorRepository.save(visitor);
   }

   public Visitor updateVisitor(Integer visitorId, Visitor visitor) {
      if(!visitorId.equals(visitor.getId())) {
         throw new Error("Please pass in the same visitor object as the id in your request");
      }

      return visitorRepository.save(visitor);
   }

}
