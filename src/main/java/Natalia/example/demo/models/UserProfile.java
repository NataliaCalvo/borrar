package Natalia.example.demo.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class UserProfile{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String userexperience;
    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUserexperience(String userexperience) {
        this.userexperience = userexperience;
    }
    public String getName() {
        return name;
    }
    public String getUserexperience() {
        return userexperience;
}
}


