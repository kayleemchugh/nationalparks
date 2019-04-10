package sample.projects.nationalparks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitor
{

   @Id
   @GeneratedValue(generator="visitor_id", strategy = GenerationType.IDENTITY)
   private Integer id;
   private String firstName;
   private String lastName;
   private String emailAddress;
   private String zipCode;

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

   public String getZipCode()
   {
      return zipCode;
   }

   public void setZipCode(String zipCode)
   {
      this.zipCode = zipCode;
   }
}
