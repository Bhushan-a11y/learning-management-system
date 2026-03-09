package com.lms.learning_management_system.Instructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InstructorController {
@Autowired
private InstructorService ins;
@RequestMapping("/instructors")
public List<Instructor> getIns(){
    return ins.getInst();
}
@RequestMapping(method=RequestMethod.POST,value="/instructors")
public void addIns(@RequestBody Instructor inst){
    ins.addInst(inst);

}
@RequestMapping(method=RequestMethod.GET,value="instructors/{id}")
public Instructor getInsbyId(@PathVariable Long id){
    return ins.getInsbyId(id);

}


}
