package facades;

import entities.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StudentFacade extends AbstractFacade<Student> {
    @PersistenceContext(unitName = "OnlineExamSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }
    
    // Custom JPQL: Find students who failed a specific exam
    public List<Student> findFailedStudents(Long examId) {
        return em.createQuery(
            "SELECT s FROM Student s JOIN ExamResult r ON s.id = r.student.id " +
            "WHERE r.exam.id = :examId AND r.passed = false", Student.class)
            .setParameter("examId", examId)
            .getResultList();
    }
}