package Natalia.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class ProfileUsers {
    public ProfileUsers() {

    }

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public void setId(Long id) {
    this.id = id;
}
    public Long setId(){
        return id;
    }
    
}
