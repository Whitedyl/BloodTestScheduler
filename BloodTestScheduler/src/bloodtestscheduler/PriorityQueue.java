/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Lenovo
 */
public class PriorityQueue implements PriorityQueueInterface {
    private ArrayList<Patients> pQueue = new ArrayList<Patients>();
    
    public void enqueue(Patients p){
        pQueue.add(p);
        
        pQueue.sort(new Comparator<Patients>() {
        public int compare(Patients p1, Patients p2){
        int prioCompare = getPrioNum(p2.getPriority()) - getPrioNum(p1.getPriority());
        if(prioCompare !=0) {
            return prioCompare;
        }
        if(p1.isFromHospital() && !p2.isFromHospital()) {
            return -1;
        }
        if(!p1.isFromHospital() && p2.isFromHospital()){
            return 1;
        }
        return p2.getAge() - p1.getAge();
        }
    });
        

    }
    public Patients dequeue(){
        return pQueue.remove(0);
    }
    public Patients peek(){
        //if queue is empty
        if (pQueue.isEmpty()){
            System.out.println("Queue is empty");
            return null;
        } else {
            //return patient at 0(highest prio)
            return pQueue.get(0);
        }
    }
    public int size(){
        return pQueue.size();
    }
    public boolean isEmpty(){
        return pQueue.isEmpty();
    }
    
    private int getPrioNum(String priority){
        if (priority.equalsIgnoreCase("high")){
            return 3;
        } else if (priority.equalsIgnoreCase("medium")){
            return 2;
        }else if (priority.equalsIgnoreCase("low")){
            return 1;
        }else {
            return 0;
        }
    }
}
