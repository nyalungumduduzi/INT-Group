package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Exam implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int passingScore; 
    
    @OneToMany(mappedBy = "exam")
    private List<ExamResult> results;
    
   
    public Exam() {}
    
    public Exam(String title, int passingScore) {
        this.title = title;
        this.passingScore = passingScore;
    }
    
    
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public int getPassingScore() { return passingScore; }
    public List<ExamResult> getResults() { return results; }
    
    public void setTitle(String title) { this.title = title; }
    public void setPassingScore(int passingScore) { this.passingScore = passingScore; }
}