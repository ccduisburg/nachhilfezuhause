/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachhilfe_verwaltungs.Model;
import nachhilfe_verwaltungs.logic.Kurs;
import java.util.List;
import nachhilfe_verwaltungs.logic.Lehre;
import nachhilfe_verwaltungs.logic.Student;
/**
 *
 * @author CC-Student
 */
public interface  NachhilfeDao {
    
    public List<Kurs>getAllKurs();
    
    public void addKurs(Kurs k);
    public void updateKurs(Kurs k);
    public void deleteKurs(Kurs k);
    
     public List<Lehre>getAllLehre();
    
    public void addLehre(Lehre l);
    public void updateLehre(Lehre l);
    public void deleteLehre(Lehre l);
    
    
    public List<Student>getAllStudent();
    
    public void addStudent(Student s);
    public void updateStudent(Student s);
    public void deleteStudent(Student s);
    
    
}
