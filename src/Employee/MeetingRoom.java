package Employee;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {

    public void join(Training[] trainee) {
        for (Training t: trainee) {
            t.attendTraining();
        }
    }
    }



