package sample.projects.nationalparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.projects.nationalparks.model.Visitor;
import sample.projects.nationalparks.service.VisitorService;

@RestController
@RequestMapping("/visitor")
public class VisitorController
{

   private final VisitorService visitorService;

   @Autowired
   public VisitorController(VisitorService visitorService) {
      this.visitorService = visitorService;
   }

   @GetMapping("/{id}")
   public HttpEntity<Resource<Visitor>> getVisitor(@PathVariable(value="id") Integer id) {
      Visitor visitor = visitorService.getVisitorById(id);
      if(visitor == null) {
         return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }
      Resource<Visitor> resource = new Resource<>(visitor);
      return new ResponseEntity<>(resource, HttpStatus.OK);
   }
}
