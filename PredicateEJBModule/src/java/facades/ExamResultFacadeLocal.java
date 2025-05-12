/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.ExamResult;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author student
 */
@Local
public interface ExamResultFacadeLocal {

    void create(ExamResult examResult);

    void edit(ExamResult examResult);

    void remove(ExamResult examResult);

    ExamResult find(Object id);

    List<ExamResult> findAll();

    ;

    int count();
    
}
