package sample.projects.nationalparks.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@Entity
@Table(name = "visitor", schema = "national_parks")
public class Visitor
{

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "visitor_id")
   private Integer id;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email_address")
   private String emailAddress;

   @Column(name = "zip_code")
   private Integer zipCode;

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

   public Integer getZipCode()
   {
      return zipCode;
   }

   public void setZipCode(Integer zipCode)
   {
      this.zipCode = zipCode;
   }
}
