package bloodtestscheduler;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Patients implements Serializable {
    String name, priority, gpDetails;
    boolean fromHospital;
    int age;

    public Patients(String name, String priority, String gpDetails, boolean fromHospital, int age) {
        this.name = name;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }

    public void setFromHospital(boolean fromHospital) {
        this.fromHospital = fromHospital;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patients{" + "name=" + name + ", priority=" + priority + ", gpDetails=" + gpDetails + ", fromHospital=" + fromHospital + ", age=" + age + '}';
    }
    @Override
public boolean equals(Object obj) {
    if (this == obj) return true; //if same reference, they are equal
    if (obj == null || getClass() != obj.getClass()) return false; //if not same class, not equal
    
    Patients patient = (Patients) obj;
    
    //compare all fields that define equality (ignoring gpDetails if it's not needed)
    return name.equals(patient.name) &&
           priority.equals(patient.priority) && 
           fromHospital == patient.fromHospital &&
           age == patient.age;
}

//@Override
//public int hashCode() {
//    return Objects.hash(name, priority, fromHospital, age); // Ensure consistent hashing
//}
    
}
