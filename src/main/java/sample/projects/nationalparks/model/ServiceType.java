package sample.projects.nationalparks.model;

import javax.persistence.*;

@Entity
@Table(name = "service_type", schema = "national_parks")
public class ServiceType
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "service_type_id")
   private Integer id;

   @Column(name = "name")
   private String name;

   @Column(name = "description")
   private String description;

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

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }
}
