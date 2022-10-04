
package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author stkou
 */
@Controller
public class HomePageController {
    
    @GetMapping("/")
    public String homepage() {
        
    return "homepage";
    }
    
}
