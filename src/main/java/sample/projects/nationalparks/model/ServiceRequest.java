package sample.projects.nationalparks.model;


import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "service_request", schema = "national_parks")
public class ServiceRequest
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "service_request_id")
   private Integer id;

   @Column(name = "service_type_id")
   private Integer serviceTypeId;

   @Column(name = "visitor_id")
   private Integer visitorId;

   @Column(name = "date_requested")
   private ZonedDateTime dateRequested = ZonedDateTime.now();

   @Column(name = "date_resolved")
   private ZonedDateTime dateResolved;

   @Column(name = "park_id")
   private Integer parkId;

   @Column(name = "is_active")
   private Boolean isActive;

   @Column(name = "description")
   private String description;

   @Column(name = "title")
   private String title;

   //enum
   @Column(name = "urgency")
   private Urgency urgency;

   @Column(name = "employee_id")
   private Integer employeeId;

   public enum Urgency
   {
      MINOR, MEDIUM, EXTREME;
   }

   public Integer getId()
   {
      return id;
   }

   public void setId(Integer id)
   {
      this.id = id;
   }

   public Integer getServiceTypeId()
   {
      return serviceTypeId;
   }

   public void setServiceTypeId(Integer serviceTypeId)
   {
      this.serviceTypeId = serviceTypeId;
   }

   public Integer getVisitorId()
   {
      return visitorId;
   }

   public void setVisitorId(Integer visitorId)
   {
      this.visitorId = visitorId;
   }

   public ZonedDateTime getDateRequested()
   {
      return dateRequested;
   }

   public void setDateRequested(ZonedDateTime dateRequested)
   {
      this.dateRequested = dateRequested;
   }

   public ZonedDateTime getDateResolved()
   {
      return dateResolved;
   }

   public void setDateResolved(ZonedDateTime dateResolved)
   {
      this.dateResolved = dateResolved;
   }

   public Integer getParkId()
   {
      return parkId;
   }

   public void setParkId(Integer parkId)
   {
      this.parkId = parkId;
   }

   public Boolean getActive()
   {
      return isActive;
   }

   public void setActive(Boolean active)
   {
      isActive = active;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public Urgency getUrgency()
   {
      return urgency;
   }

   public void setUrgency(Urgency urgency)
   {
      this.urgency = urgency;
   }

   public Integer getEmployeeId()
   {
      return employeeId;
   }

   public void setEmployeeId(Integer employeeId)
   {
      this.employeeId = employeeId;
   }
}
