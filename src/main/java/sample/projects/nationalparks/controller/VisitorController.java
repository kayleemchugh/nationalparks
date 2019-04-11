package sample.projects.nationalparks.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
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
   public Visitor getVisitor(@PathVariable(value="id") Integer id) {
      Visitor visitor = visitorService.getVisitorById(id);
      if(visitor == null) {
         throw new Error("could not find visitor with this id");
      }
      return visitor;
   }

   @PostMapping
   public Visitor saveVisitor(@RequestBody Visitor visitor) {
      return visitorService.saveVisitor(visitor);
   }

   @PutMapping
   public Visitor updateVisitor(@PathVariable(value="id") Integer id,
                                @RequestBody Visitor visitor) {
      return visitorService.updateVisitor(id, visitor);
   }
}
