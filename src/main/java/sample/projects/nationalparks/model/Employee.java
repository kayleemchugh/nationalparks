package sample.projects.nationalparks.model;


import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "national_parks")
public class Employee
{

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "employee_id")
   private Integer id;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email_address")
   private String emailAddress;

   // set up relationship
   @Column(name = "park_id")
   private Integer parkId;

   @Column(name="is_active")
   private boolean isActive;

   public Integer getId()
   {
      return id;
   }

   public void setId(Integer id)
   {
      this.id = id;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getEmailAddress()
   {
      return emailAddress;
   }

   public void setEmailAddress(String emailAddress)
   {
      this.emailAddress = emailAddress;
   }

   public Integer getParkId()
   {
      return parkId;
   }

   public void setParkId(Integer parkId)
   {
      this.parkId = parkId;
   }

   public boolean isActive()
   {
      return isActive;
   }

   public void setActive(boolean active)
   {
      isActive = active;
   }
}
