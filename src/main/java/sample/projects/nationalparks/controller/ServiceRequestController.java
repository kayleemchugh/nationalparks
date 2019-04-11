package sample.projects.nationalparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.projects.nationalparks.model.ServiceRequest;
import sample.projects.nationalparks.service.ServiceRequestService;

@RestController
@RequestMapping("/serviceRequest")
public class ServiceRequestController
{

   private final ServiceRequestService serviceRequestService;

   @Autowired
   public ServiceRequestController(ServiceRequestService serviceRequestService) {
      this.serviceRequestService = serviceRequestService;
   }

   @GetMapping("/{id}")
   public ServiceRequest getServiceRequest(@PathVariable(value="id") Integer id) {
      ServiceRequest serviceRequest = serviceRequestService.getServiceRequestById(id);
      if(serviceRequest == null) {
         throw new Error("could not find service request with this id");
      }
      return serviceRequest;
   }

   @PostMapping
   public ServiceRequest saveServiceRequest(@RequestBody ServiceRequest serviceRequest) {
      return serviceRequestService.saveServiceRequest(serviceRequest);
   }

   @PutMapping("/{id}")
   public ServiceRequest updateServiceRequest(@PathVariable(value="id") Integer id,
                                @RequestBody ServiceRequest serviceRequest) {
      return serviceRequestService.updateServiceRequest(id, serviceRequest);
   }

   // endpoints needed
   // get service request by service request id
   // get service request by park
   // get open service requests by park
   // get closed service requests by park
   // get service request by visitor id
   // get service request by employee id
   // update service request
   // get unanswered service requests
   // get closed service requests
   // close service request



}
