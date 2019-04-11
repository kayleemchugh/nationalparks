package sample.projects.nationalparks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.projects.nationalparks.model.ServiceType;
import sample.projects.nationalparks.model.Visitor;
import sample.projects.nationalparks.repository.ServiceTypeRepository;

@Service
public class ServiceTypeService
{

   private ServiceTypeRepository serviceTypeRepository;

   @Autowired
   private ServiceTypeService(
         ServiceTypeRepository serviceTypeRepository
   ) {
      this.serviceTypeRepository = serviceTypeRepository;
   }


   public ServiceType getServiceTypeById(Integer id) {
      return  serviceTypeRepository.getOne(id);
   }

   public ServiceType saveServiceType(ServiceType serviceType) {
      return serviceTypeRepository.save(serviceType);
   }

   public ServiceType updateServiceType(Integer serviceTypeId, ServiceType serviceType) {
      if(!serviceTypeId.equals(serviceType.getId())) {
         throw new Error("Please pass in the same service type object as the id in your request");
      }

      return serviceTypeRepository.save(serviceType);
   }
}
