
package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author stkou
 */
@Controller
public class Controllers {
    
    @GetMapping("/trainerForm")
    public String TrainerForm() {
    
    return "trainerForm";
    }
}
