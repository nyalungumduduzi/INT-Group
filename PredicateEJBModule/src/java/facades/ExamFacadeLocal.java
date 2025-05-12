/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Exam;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author student
 */
@Local
public interface ExamFacadeLocal {

    void create(Exam exam);

    void edit(Exam exam);

    void remove(Exam exam);

    Exam find(Object id);

    List<Exam> findAll();

    List<Exam> findRange(int[] range);

    int count();
    
}
