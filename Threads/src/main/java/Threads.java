/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 *
 * @author god
 */
class ThreadJob{
    Threads problem;
    Vector<Integer> numbers = new Vector<>();
    float average = 0;
    
    ThreadJob(Threads problem, Vector numbers){
        this.problem = problem;
        this.numbers = numbers;
    }

    ThreadJob() {
    }
    
    public void run(){
        average = problem.findAverage(numbers);
        System.out.println(average +" is the average of " + numbers + System.lineSeparator());
    }
    
}

public class Threads{
    Scanner input = new Scanner(System.in);
    
    Vector<Integer> getNumbers(Vector<Integer>numbers){
        String line = input.nextLine();
        String number;
        int num;
        while(!(" ".equals(line))){
            String words = line;
            number = words;
            num = Integer.parseInt(number);
            numbers.add(num);
            line = input.nextLine();
        }
       return numbers;
    }
    
    float findAverage(Vector<Integer> numbers){
        float ave = 0;
        for(int i = 0; i < numbers.size(); i++){
            ave = ave + numbers.get(i);
        }
        ave = ave/numbers.size();
        return ave;
    }
    
    void parallelEval(int threads) {
        ArrayList<ThreadJob> jobs = new ArrayList<>(threads);
        for (int thread = 0; thread < threads; ++thread) {
            
            Vector<Integer> list = new Vector<>();
            list = getNumbers(list);
            jobs.add(new ThreadJob(this, list));
        }
        jobs.parallelStream().forEach(ThreadJob->ThreadJob.run());  
    }
    
    void parallelEval() {
        int cores = Runtime.getRuntime().availableProcessors();
        int threads = 2 * cores;
        parallelEval(threads);
    }
    
}
