package entities;

import entities.Exam;
import entities.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T22:36:24")
@StaticMetamodel(ExamResult.class)
public class ExamResult_ { 

    public static volatile SingularAttribute<ExamResult, Exam> exam;
    public static volatile SingularAttribute<ExamResult, Integer> score;
    public static volatile SingularAttribute<ExamResult, Student> student;
    public static volatile SingularAttribute<ExamResult, Long> id;
    public static volatile SingularAttribute<ExamResult, Boolean> passed;

}