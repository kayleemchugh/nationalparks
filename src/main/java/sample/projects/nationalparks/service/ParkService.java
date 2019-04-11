package sample.projects.nationalparks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.projects.nationalparks.model.Park;
import sample.projects.nationalparks.repository.ParkRepository;

@Service
public class ParkService
{

   private ParkRepository parkRepository;

   @Autowired
   public ParkService(
         ParkRepository parkRepository) {
      this.parkRepository = parkRepository;
   }

   public Park getParkById(Integer id) {
      return  parkRepository.getOne(id);
   }

   public Park savePark(Park park) {
      return parkRepository.save(park);
   }

   public Park updatePark(Integer parkId, Park park) {
      if(!parkId.equals(park.getId())) {
         throw new Error("Please pass in the same park object as the id in your request");
      }

      return parkRepository.save(park);
   }
}
