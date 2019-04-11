package sample.projects.nationalparks.model;

import javax.persistence.*;

@Entity
@Table(name = "park", schema = "national_parks")
public class Park
{

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "park_id")
   private Integer id;

   @Column(name = "name")
   private String name;

   @Column(name = "state")
   private String state;

   @Column(name = "street_address")
   private String streetAddress;

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

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getState()
   {
      return state;
   }

   public void setState(String state)
   {
      this.state = state;
   }

   public String getStreetAddress()
   {
      return streetAddress;
   }

   public void setStreetAddress(String streetAddress)
   {
      this.streetAddress = streetAddress;
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
