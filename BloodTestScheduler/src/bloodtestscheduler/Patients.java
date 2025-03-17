package bloodtestscheduler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Patients {
    String name, priority, gpDetails;
    boolean fromHospital;
    int age;

    public Patients(String name, String priotity, String gpDetails, boolean fromHospital, int age) {
        this.name = name;
        this.priority = priotity;
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
        return "Patients{" + "name=" + name + ", priotity=" + priority + ", gpDetails=" + gpDetails + ", fromHospital=" + fromHospital + ", age=" + age + '}';
    }
    
    
}
