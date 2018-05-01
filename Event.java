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
public abstract class Event {
    private Person owner;
    private EventTime dateAndTime;
    
    public Event(Person owner, int year, int month, int day, int hour, int minute, int duration){
        this.owner = owner;
        dateAndTime = new EventTime(year, month, day, hour, minute, duration);
    }
    
    public Event(Person owner){
        this.owner = owner;
        dateAndTime = new EventTime();
    }
}
