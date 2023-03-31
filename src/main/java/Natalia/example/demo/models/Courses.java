package Natalia.example.demo.models;

import java.util.Set;

import org.springframework.context.annotation.Profile;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {

    public Courses(){

    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String courseName;

    public Courses(long id, String CourseName) {
        this.id = id;
        this.courseName = CourseName;
    }



    public long getId(){
        return id;
    }

    @JsonIgnore
    @ManyToMany (mappedBy = "Courses")
        Set<Profile> profiles;

    }
