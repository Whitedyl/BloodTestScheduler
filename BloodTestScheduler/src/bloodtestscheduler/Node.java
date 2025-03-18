/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class Node implements Serializable  {
    Patients data;
    Node next;

    public Node(Patients data) {
        this.data = data;
        this.next = null;
    }
    
    
}
