/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A simple subclass of Student class
 *
 * @author gkjus
 */
public class PartTimeStudent extends Student {

    private int numberOfHours; // number of credit hours

    /**
     * Subclass constructor
     */
    public PartTimeStudent(String name, String stdId, int hours) {
        super(name, stdId);
        this.numberOfHours = hours;
    }

    /**
     * @return the numberOfHours
     */
    public int getNumberOfHours() {
        return numberOfHours;
    }

    /**
     * @param numberOfHours the numberOfHours to set
     */
    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
    
    
}
