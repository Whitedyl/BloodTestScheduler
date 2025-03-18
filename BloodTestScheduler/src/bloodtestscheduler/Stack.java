/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Stack implements StackInterface {

    private ArrayList<Patients> stack = new ArrayList<Patients>();

    @Override
    public void push(Patients p) {
        stack.add(p);
    }

    //to remove the first item in stack
    @Override
    public Patients pop() {
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    //to view the first item in stack
    @Override
    public Patients peek() {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}
