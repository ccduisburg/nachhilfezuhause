/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachhilfe_verwaltungs.logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CC-Student
 */
public class VerwaltungsService {

    List<Lehre> l1 = new ArrayList<>();
    List<Student> s1 = new ArrayList<>();
    List<Kurs> k1 = new ArrayList<>();

    public void neuLehre(Lehre l) {
        l1.add(l);

    }

    public void neuStudent(Student s) {
        s1.add(s);

    }

    public void neuKurs(Kurs k) {
        k1.add(k);

    }

    public void kurszumStudent(Kurs kname, Student student) {

        for (Kurs k : k1) {
            if (k.equals(kname)) {
                k.anmeldung(student);
            }

        }
    }
}
