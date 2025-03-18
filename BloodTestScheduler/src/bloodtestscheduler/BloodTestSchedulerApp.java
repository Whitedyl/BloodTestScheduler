/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Lenovo
 */
public class BloodTestSchedulerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Initialize the data structures
        PriorityQueue queue = new PriorityQueue();
        Stack noShowStack = new Stack();
        SLList patientList = new SLList();

        // Create some Patients
        Patients p1 = new Patients("Alice", "High", "Dr. Smith", false, 30);
        Patients p2 = new Patients("Bob", "Low", "Dr. Lee", true, 45);
        Patients p3 = new Patients("Charlie", "High", "Dr. Brown", false, 50);
        Patients p4 = new Patients("David", "Medium", "Dr. White", true, 40);
        Patients p5 = new Patients("Eva", "Low", "Dr. Green", false, 60);
        Patients p6 = new Patients("Frank", "High", "Dr. Blue", true, 55);

        // Enqueue patients in the PriorityQueue
        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);
        queue.enqueue(p4);
        queue.enqueue(p5);
        queue.enqueue(p6);

        // Display the queue (peek at the highest priority)
        System.out.println("Peek at highest priority patient: " + queue.peek().getName());

        // Simulate no-show scenario (patients who don't show up for their appointments)
        Patients noShow = queue.dequeue();  // Bob
        System.out.println(noShow.getName() + " has missed the appointment, moving to stack.");
        noShowStack.push(noShow);  // Add to stack

        noShow = queue.dequeue();  // Charlie
        System.out.println(noShow.getName() + " has missed the appointment, moving to stack.");
        noShowStack.push(noShow);  // Add to stack

        noShow = queue.dequeue();  // Eva
        System.out.println(noShow.getName() + " has missed the appointment, moving to stack.");
        noShowStack.push(noShow);  // Add to stack

        // Test the size of the stack after adding no-shows
        System.out.println("\nNo-show stack size: " + noShowStack.size());

        // Test the stack's peek method (most recent no-show)
        System.out.println("Most recent no-show: " + noShowStack.peek().getName());

        // Simulate adding more patients and ensuring the stack holds only the latest 5 no-shows
        Patients p7 = new Patients("Grace", "Medium", "Dr. Yellow", true, 50);
        queue.enqueue(p7);
        noShow = queue.dequeue();  // Grace
        System.out.println(noShow.getName() + " has missed the appointment, moving to stack.");
        noShowStack.push(noShow);  // Add to stack

        // Display the stack contents (peek at top no-show)
        System.out.println("\nNo-show stack size after adding more: " + noShowStack.size());
        System.out.println("Most recent no-show: " + noShowStack.peek().getName());

        // Print all no-show patients in the stack
        System.out.println("\nAll no-show patients in the stack:");
        while (!noShowStack.isEmpty()) {
            Patients p = noShowStack.pop();
            System.out.println(p.getName() + " missed their appointment.");
        }

        // Testing the SLList by adding and removing a patient
        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);
        patientList.display();  // Display patients in the list

        // Removing a patient
        patientList.remove(p2);  // Remove Bob
        System.out.println("\nList after removing Bob:");
        patientList.display();  // Display updated list

        // Test the size of the patient list
        System.out.println("\nSize of the list after removal: " + patientList.size());
    
    }
}
