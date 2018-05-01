/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplatform;

import java.util.Calendar;

/**
 *
 * @author pvanhorn
 */
public abstract class Event {
    private final Person owner;
    private Location location;
    private EventTime dateAndTime;
    
    /**
     * Initializes an Event with enumerated parameters. 
     * 
     * @param owner     An instance of a Person object that owns this Event
     * @param year      The year of this Event. Ex: 2018
     * @param month     The month of this Event. Ex: 01
     * @param day       The day of month of this Event. Ex: 31
     * @param hour      The hour of this Event (24 hour format). Ex: 11
     * @param minute    The minute of this Event. Ex: 59
     * @param duration  The duration of this event in minutes. Ex: 90
     */
    public Event(Person owner, int year, int month, int day, int hour, int minute, int duration){
        this.owner = owner;
        dateAndTime = new EventTime(year, month, day, hour, minute, duration);
    }
    
    /**
     *
     * @param owner
     */
    public Event(Person owner){
        this.owner = owner;
        dateAndTime = new EventTime();
    }
    
    public Calendar startOfEvent(){
        return dateAndTime.getCalendar();
    }
    
    public Calendar endOfEvent(){
        return dateAndTime.getEndTime();
    }
    
    public int duration(){
        return dateAndTime.getDuration();
    }
    
    public void changeDate(int newMonth, int newDay){
        dateAndTime.setDate(newMonth, newMonth);
    }
    
    public void changeTime(int newHour, int newMinute){
        dateAndTime.setTime(newHour, newMinute);
    }
    
    public void changeDuration(int newDuration){
        dateAndTime.setDuration(newDuration);
    }
    
    public int getOwnerID(){
        return owner.getPersonID();
    }
    
    
}
