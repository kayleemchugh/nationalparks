package sample.projects.nationalparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.projects.nationalparks.model.ServiceType;
import sample.projects.nationalparks.service.ServiceTypeService;

@RestController
@RequestMapping("/serviceType")
public class ServiceTypeController
{

   private final ServiceTypeService serviceTypeService;

   @Autowired
   public ServiceTypeController(ServiceTypeService serviceTypeService) {
      this.serviceTypeService = serviceTypeService;
   }

   @GetMapping("/{id}")
   public ServiceType getServiceType(@PathVariable(value="id") Integer id) {
      ServiceType serviceType = serviceTypeService.getServiceTypeById(id);

      if(serviceType == null) {
         throw new Error("could not find service type with this id");
      }
      return serviceType;
   }

   @PostMapping
   public ServiceType saveServiceType(@RequestBody ServiceType serviceType) {
      return serviceTypeService.saveServiceType(serviceType);
   }

   @PutMapping("/{id}")
   public ServiceType updateServiceType(@PathVariable(value="id") Integer id,
                                @RequestBody ServiceType serviceType) {
      return serviceTypeService.updateServiceType(id, serviceType);
   }

}
