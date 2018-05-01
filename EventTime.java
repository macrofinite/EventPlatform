/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplatform;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author pvanhorn
 */
public class EventTime {
    private Calendar time;
    private int duration;
    
    public EventTime(int year, int month, int day, int hour, int minute, int duration){
        time = new Calendar.Builder().setDate(year, month, day).setTimeOfDay(hour, minute, 0).build();
        this.duration = duration;
    }
    
    //constructor with no arguments initializes calendar to current time, strips out second and millisecond
    public EventTime(){
        time = Calendar.getInstance();
        time.set(Calendar.SECOND, 0);
        time.set(Calendar.MILLISECOND, 0);
        duration = 0;
    }
    
    public EventTime(int duration){
        time = Calendar.getInstance();
        time.set(Calendar.SECOND, 0);
        time.set(Calendar.MILLISECOND, 0);
        this.duration = duration;
    }
    
    public Calendar getCalendar(){
        return time;
    }
    
    public void setDay(int newDayOfMonth){
       time.set(Calendar.DAY_OF_MONTH, newDayOfMonth);
    }
    
    public void setDate(int newMonth, int newDayOfMonth){
        time.set(Calendar.MONTH, newMonth);
        time.set(Calendar.DAY_OF_MONTH, newDayOfMonth);
    }
    
    public void setTime(int newHour, int newMinute){
        time.set(Calendar.HOUR_OF_DAY, newHour);
        time.set(Calendar.MINUTE, newMinute);
    }
    
    public void setDuration(int newDuration){
        duration = newDuration;
    }
    
    public int getDuration(){
        return duration;
    }
    
    public int getYear(){
        return time.get(Calendar.YEAR);
    }
    
    public int getMonth(){
        return time.get(Calendar.MONTH);
    }
    
    public int getDayOfMonth(){
        return time.get(Calendar.DAY_OF_MONTH);
    }
    
    public int getDayOfWeek(){
        return time.get(Calendar.DAY_OF_WEEK);
    }
    
    public int getHour(){
        return time.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getMinute(){
        return time.get(Calendar.MINUTE);
    }
    
    public String getDateString(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        format.setCalendar(time);
        return format.format(time.getTime());
    }
    
    public String getDateTimeString(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd kk:mm");
        format.setCalendar(time);
        return format.format(time.getTime());
    }
    
    public Calendar getEndTime(){
        Calendar endTime = (Calendar) time.clone();
        endTime.add(Calendar.MINUTE, duration);
        return endTime;
    }
}
