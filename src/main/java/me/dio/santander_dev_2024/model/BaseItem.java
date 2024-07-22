package me.dio.santander_dev_2024.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private long icon;
     private long description;

     public Long getId() {
          return id;
     }
     
     public void setId(Long id) {
          this.id = id;
     }

     public long getIcon() {
          return icon;
     }

     public void setIcon(long icon) {
          this.icon = icon;
     }

     public long getDescription() {
          return description;
     }

     public void setDescription(long description) {
          this.description = description;
     }

}
