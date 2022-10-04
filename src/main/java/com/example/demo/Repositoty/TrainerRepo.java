
package com.example.demo.Repositoty;

import com.example.demo.model.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author stkou
 */

public interface TrainerRepo extends JpaRepository<Trainers, Integer>{
    
}
