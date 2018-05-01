/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplatform;

/**
 *
 * @author pvanhorn
 */
public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final int personID;
    
    public Person(String firstName, String lastName, int personID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.personID = personID;
    }
}
