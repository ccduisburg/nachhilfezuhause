/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachhilfe_verwaltungs.Model;

import java.util.ArrayList;
import java.util.List;
import nachhilfe_verwaltungs.logic.Kurs;
import nachhilfe_verwaltungs.logic.Lehre;
import nachhilfe_verwaltungs.logic.Student;

/**
 *
 * @author CC-Student
 */
public class nachhilfeDaoListImplt implements NachhilfeDao{
    private List<Student> student=new ArrayList<>();
     private List<Lehre> lehre=new ArrayList<>();
     private List<Kurs> kurs=new ArrayList<>();
     
     
    @Override
    public List<Kurs> getAllKurs(){
    return kurs;
    }
      @Override
    public List<Student> getAllStudent(){
    return student;
    }
    
      @Override
    public List<Lehre> getAllLehre(){
    return lehre;
}
    
    @Override
    public void addKurs(Kurs k){}
    @Override
    public void updateKurs(Kurs k){}
    @Override
    public void deleteKurs(Kurs k){}
    
   
    @Override
    public void addLehre(Lehre l){}
    @Override
    public void updateLehre(Lehre l){}
    @Override
    public void deleteLehre(Lehre l){}
    
    
    
    @Override
    public void addStudent(Student s){}
    @Override
    public void updateStudent(Student s){}
    @Override
    public void deleteStudent(Student s){}
    
}
