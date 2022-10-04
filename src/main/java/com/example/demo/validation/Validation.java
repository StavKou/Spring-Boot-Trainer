package com.example.demo.validation;

import com.example.demo.model.Trainers;

/**
 *
 * @author stkou
 */
public class Validation {

    public boolean validateStringInput(Trainers tr) {

        String fname = tr.getTrainerFname();
        String lname = tr.getTrainerLname();
        String subject = tr.getSubject();
        
        if ((fname == null && lname == null) || (fname.equals("") && lname.equals(""))
                || (fname.length() < 3 && lname.length() < 3)) {

            return (false);
        }
        return (true);
    }

}