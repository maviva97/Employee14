import Employee.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercitiul 1");
           Employee p=new Programmer("Ion","ALC");
           p.attendTraining();
           Employee m=new Manager("Stela", "HR");
           m.attendTraining();
        Manager m1=new Manager("Zina","DAPS");
        m1.attendTraining();
        m1.conductInterview();


        System.out.println("Exercitiul 2");
Training p1 = new Programmer("Ion","ALC");
Training m2=new Manager("Stela", "HR");
Training m3=new Manager("Zina","DAPS");
       MeetingRoom meetingRoom = new MeetingRoom();
       meetingRoom.join(new Training[]{p1, m2, m3});

       System.out.println("Exercitiul 3");
        List <Employee>employees= Arrays.asList(new Programmer("Iona","ALC"),new Manager("Stela","HR"));
        for(int i=0; i<employees.size();i++){
        if (employees.get(i) instanceof Programmer) {
            Programmer p2=(Programmer) employees.get(i);
            p2.attendTraining();
        }else if (employees.get(i) instanceof Manager){
            Manager m4=(Manager) employees.get(i);
            m4.conductInterview();
        }

        }


    }
    }
