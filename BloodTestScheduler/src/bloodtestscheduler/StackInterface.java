/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Lenovo
 */
public interface StackInterface {

    void push(Patients p);  // Adds a patient to the stack (no-show patients)

    Patients pop();         // Removes the most recent patient (from top of stack)

    Patients peek();        // Views the most recent patient without removing

    boolean isEmpty();      // Checks if the stack is empty

    int size();             // Returns the size of the stack

}
