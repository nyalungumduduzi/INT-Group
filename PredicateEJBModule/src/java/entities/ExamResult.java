package entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class ExamResult implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;
    private boolean passed;
    
    @ManyToOne
    private Student student;
    
    @ManyToOne
    private Exam exam;
    
    
    public ExamResult() {}
    
    public ExamResult(Student student, Exam exam, int score) {
        this.student = student;
        this.exam = exam;
        this.score = score;
        this.passed = (score >= exam.getPassingScore());
    }
    
   
    public Long getId() { return id; }
    public int getScore() { return score; }
    public boolean isPassed() { return passed; }
    public Student getStudent() { return student; }
    public Exam getExam() { return exam; }
    
    public void setScore(int score) { 
        this.score = score;
        this.passed = (score >= exam.getPassingScore());
    }
}