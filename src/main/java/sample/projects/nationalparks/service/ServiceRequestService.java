package sample.projects.nationalparks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.projects.nationalparks.model.ServiceRequest;
import sample.projects.nationalparks.repository.ServiceRequestRepository;

@Service
public class ServiceRequestService
{

   private final ServiceRequestRepository serviceRequestRepository;

   @Autowired
   public ServiceRequestService(ServiceRequestRepository serviceRequestRepository) {
      this.serviceRequestRepository = serviceRequestRepository;
   }

   public ServiceRequest getServiceRequestById(Integer id) {
      return  serviceRequestRepository.getOne(id);
   }

   public ServiceRequest saveServiceRequest(ServiceRequest serviceRequest)
   {
      return serviceRequestRepository.save(serviceRequest);
   }

   public ServiceRequest updateServiceRequest(Integer serviceRequestId, ServiceRequest serviceRequest) {
      if(!serviceRequestId.equals(serviceRequest.getId())) {
         throw new Error("Please pass in the same park object as the id in your request");
      }

      return serviceRequestRepository.save(serviceRequest);
   }



}
