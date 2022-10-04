package com.example.demo.controllers;

import com.example.demo.Services.TrainerService;
import com.example.demo.model.Trainers;
import com.example.demo.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author stkou
 */
@Controller
@RequestMapping("trainer")
public class TrainerController {

    @Autowired
    TrainerService trs;

    @PostMapping("/insert")
    public String TrainerController(@RequestParam("trainer_fname") String fname,
            @RequestParam("trainer_lname") String lname,
            @RequestParam("subject") String subject, ModelMap mm) {

        
        Trainers tr = new Trainers(fname, lname, subject);
        System.out.println(subject);
        Validation v = new Validation();
        
        if (v.validateStringInput(tr)) {
            
            tr.getTrainerFname();
            tr.getTrainerLname();
            tr.getSubject();

            trs.insertTrainer(tr);
            System.out.println("ALL GOOD!!!");

        } else {
            

           System.out.println("Error! PLZ BE CAREFUL!!!");
            
        }

       return "redirect:/trainer/showlist";
    }

    // DELETE //
    @GetMapping("/delete/{trid}")
    public String TrainerDelete(@PathVariable("trid") Integer id) {

        Trainers tr = trs.getTrainerById(id);
        tr.getTrainerFname();
        tr.getTrainerLname();
        tr.getSubject();

        trs.deleteTrainer(tr);
//        mm.addAttribute("trainerlist",trs.AllTrainers());

        return "redirect:/trainer/showlist";
    }

    // UPDATE //
    @GetMapping("/update/{trid}")
    public String updateTrainer(@PathVariable("trid") Integer trid, ModelMap mm) {

        Trainers tr = trs.getTrainerById(trid);
        mm.addAttribute("updatetrainer", tr);
        return "updateTrainer";
    }

    @PostMapping("/update")
    public String updatedTrainer(@RequestParam("trid") Integer id, @RequestParam("trainer_fname") String fname,
            @RequestParam("trainer_lname") String lname,
            @RequestParam("subject") String subject) {

        Trainers tr = trs.getTrainerById(id);
        tr.setTrainerFname(fname);
        tr.setTrainerLname(lname);
        tr.setSubject(subject);
        trs.insertTrainer(tr);

//        mm.addAttribute("trainerlist", trs.AllTrainers());
        return "redirect:/trainer/showlist";
    }

    @GetMapping("/showlist")
    public String showAllTrainers(ModelMap mm) {

        mm.addAttribute("trainerlist", trs.AllTrainers());
        return "allTrainers";
    }

    
    
}
