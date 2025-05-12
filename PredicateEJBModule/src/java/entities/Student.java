package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Student implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role; 
    
    @OneToMany(mappedBy = "student")
    private List<ExamResult> results;
    
  
    public Student() {}
    
    public Student(String name, String role) {
        this.name = name;
        this.role = role;
    }
    
    
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public List<ExamResult> getResults() { return results; }
    
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
}