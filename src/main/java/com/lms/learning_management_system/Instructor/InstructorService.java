package com.lms.learning_management_system.Instructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {
@Autowired
private InstructorRepository inr;
List<Instructor> inss = new ArrayList<>(Arrays.asList(new Instructor(1L,"name","email")));


public List<Instructor> getInst() {
    List<Instructor> in = new ArrayList<>();
   for(Instructor i : inr.findAll()){
    in.add(i);
   }
   return in;
    
    
}


public void addInst(Instructor inst) {
    inss.add(inst);
  
}


public Instructor getInsbyId(Long id) {
    return inr.findById(id).orElse(null);
    }
}


