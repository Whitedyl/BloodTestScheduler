/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Lenovo
 */
public class SLList implements SLListInterface {

    private Node head;
    int count = 0; //to track size of list

    @Override
    public void add(Patients p) {
        Node newNode = new Node(p);
        
        //if the list is empty
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            //loop until last node and add new node at the end
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++; //increae count
    }

    @Override
    public void remove(Patients p) {
        if (head == null) {
            return;
        } 
       
        if (head.data.equals(p)) {
            head = head.next;
            count--; //decrease count 
            return; 
        }

        Node temp = head; //to start the loop at head
        //loop to find node to delete
        while (temp.next != null) {
        if (temp.next.data.equals(p)) { // If the next node is the one to remove
            temp.next = temp.next.next; // Skip over the node
            count--; // Decrease count
            return; // Exit once the node is removed
        }
        temp = temp.next;
        }
    }
    @Override
    public void display(){
        Node temp = head;
        
        //if no patients in list
        if(temp == null){
            System.out.println("No Patients in list");
            return;
        }
        
        //loop through patients and print 
        while(temp != null){
            System.out.println(temp.data);//print
            temp = temp.next;//move to next patient
        }
    }
    @Override
    public int size(){
        return count;
    }
    
    
}
