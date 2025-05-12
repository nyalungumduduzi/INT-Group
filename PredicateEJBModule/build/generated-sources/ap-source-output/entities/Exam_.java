package entities;

import entities.ExamResult;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T22:36:24")
@StaticMetamodel(Exam.class)
public class Exam_ { 

    public static volatile SingularAttribute<Exam, Integer> passingScore;
    public static volatile SingularAttribute<Exam, Long> id;
    public static volatile SingularAttribute<Exam, String> title;
    public static volatile ListAttribute<Exam, ExamResult> results;

}