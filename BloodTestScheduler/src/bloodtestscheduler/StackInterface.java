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

    void push(Patients p);

    Patients pop();       

    Patients peek();      

    boolean isEmpty();      

    int size();            

}
