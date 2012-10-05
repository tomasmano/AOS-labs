/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.cvicenie02b;

/**
 *
 * @author manotoma
 */
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name="aosDate")
public class Class2ServiceDate {
 
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private int millisecond;
 
    ///GETTERS AND SETTERS
    public int getDay() {
        return day;
    }
 
    public void setDay(int day) {
        this.day = day;
    }
 
    public int getHour() {
        return hour;
    }
 
    public void setHour(int hour) {
        this.hour = hour;
    }
 
    public int getMillisecond() {
        return millisecond;
    }
 
    public void setMillisecond(int millisecond) {
        this.millisecond = millisecond;
    }
 
    public int getMinute() {
        return minute;
    }
 
    public void setMinute(int minute) {
        this.minute = minute;
    }
 
    public int getMonth() {
        return month;
    }
 
    public void setMonth(int month) {
        this.month = month;
    }
 
    public int getSecond() {
        return second;
    }
 
    public void setSecond(int second) {
        this.second = second;
    }
 
    public int getYear() {
        return year;
    }
 
    public void setYear(int year) {
        this.year = year;
    }
 
    ///TOSTRING
    @Override
    public String toString() {
        return "[" + year + "/" + month + "/" + day + " "+ hour + ":" + minute + ":" + second + "::" + millisecond + "]";
    }
 
 
}
