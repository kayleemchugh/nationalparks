package sample.projects.nationalparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.projects.nationalparks.model.Park;
import sample.projects.nationalparks.service.ParkService;

@RestController
@RequestMapping("/park")
public class ParkController
{

   private final ParkService parkService;

   @Autowired
   public ParkController(ParkService parkService) {
      this.parkService = parkService;
   }

   @GetMapping("/{id}")
   public Park getPark(@PathVariable(value="id") Integer id) {
      Park park = parkService.getParkById(id);
      if(park == null) {
         throw new Error("could not find park with this id");
      }
      return park;
   }

   @PostMapping
   public Park savePark(@RequestBody Park park) {

      return parkService.savePark(park);
   }

   @PutMapping("/{id}")
   public Park updatePark(@PathVariable(value="id") Integer id,
                                @RequestBody Park park) {
      return parkService.updatePark(id, park);
   }
}
