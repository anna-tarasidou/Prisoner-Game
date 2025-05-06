//Tarasidou Anna 

import java.util.Random;

public class ComputerPlayer extends Player {
    
    public ComputerPlayer(String name) {
        super(name);
    }

    public int selectNumber() {
        int max = 5;
        int min = 1;
        Random t = new Random();

        int num = (t.nextInt(max - min + 1)) * 1000;
        try {
            Thread.sleep(num);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random r = new Random();
        int number = r.nextInt(max - min + 1);
        number += min;

        System.out.println("Player " + getName() + " selected " + number);
        return number;
    }
}
