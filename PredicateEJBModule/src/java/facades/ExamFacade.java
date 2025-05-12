package facades;

import entities.Exam;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ExamFacade extends AbstractFacade<Exam> {
    @PersistenceContext(unitName = "OnlineExamSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExamFacade() {
        super(Exam.class);
    }
    
    // Custom JPQL: Find exams where a student passed
    public List<Exam> findPassedExamsByStudent(Long studentId) {
        return em.createQuery(
            "SELECT e FROM Exam e JOIN ExamResult r ON e.id = r.exam.id " +
            "WHERE r.student.id = :studentId AND r.passed = true", Exam.class)
            .setParameter("studentId", studentId)
            .getResultList();
    }
}