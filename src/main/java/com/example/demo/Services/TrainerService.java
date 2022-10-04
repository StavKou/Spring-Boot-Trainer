package com.example.demo.Services;

import com.example.demo.Repositoty.TrainerRepo;
import com.example.demo.model.Trainers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stkou
 */
@Service
public class TrainerService implements TrainerServiceInterface {

    @Autowired
    TrainerRepo trr;

    @Override
    public void insertTrainer(Trainers tr) {

        trr.save(tr);
    }

    // All Trainers //
    public List<Trainers> AllTrainers() {

        return trr.findAll();
    }

    //Get Trainer By Id //
    public Trainers getTrainerById(Integer trid) {

        return trr.findById(trid).get();
    }

    // Delete Trainers //
    public void deleteTrainer(Trainers tr) {
        trr.delete(tr);
    }

    // Update //
    public void updateTrainer(Trainers tr) {

    }

}
