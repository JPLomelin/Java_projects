package tareas;

import java.time.LocalTime;

public class DateTime extends Date {

	private int seconds = 59;
	private int minutes = 59;
	private int hours = 23;
	protected int FORMAT = get_format();
	
/////////CONSTRUCTORES//////////
	public DateTime(int hours, int minutes, int seconds, int day, int month, int year) {
		super(year, month, day);
		if(isValidTime(hours, minutes, seconds)) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
	}
	
	public DateTime(int hours, int minutes, int seconds) {
		if(isValidTime(seconds, minutes, hours)) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
	}
	
	public DateTime() {
		super();
		toSystemTime();
	}
	
	public DateTime(Date d) {
		 super(d.getDay(),d.getMonth(),d.getYear());
	     toSystemTime();
	}

////////GETTERS////////
	public int getSeconds() { return seconds; }
	public int getMinutes() { return minutes; }
	public int getHours() { return hours; }
	public int getFormat() { return format; }
	
////////SETTERS////////
	public void setSeconds(int seconds) {
		if (isValidTime(seconds, minutes, hours)) this.seconds = seconds;
	}
	
	public void setMinutes(int minutes) {
		if (isValidTime(seconds, minutes, hours)) this.minutes = minutes;
	}
	
	public void setHours(int hours) {
		if (isValidTime(seconds, minutes, hours)) this.hours = hours;
	}
	
	public void setFORMAT(int FORMAT) {
		this.FORMAT = FORMAT;
		setFormat(FORMAT);
	}
///////////TOSYSTEMTIME///////////
	public void toSystemTime() {
		 LocalTime cTime = LocalTime.now();
	     this.hours = cTime.getHour();
	     this.minutes = cTime.getMinute();
	     this.seconds = cTime.getSecond();
	}
///////////ISVALIDTIME////////////
	public static boolean isValidTime(int seconds, int minutes, int hours) {
		if (seconds < 0 || seconds > 59) return false;
		
		if (minutes < 0 || minutes > 59) return false;
		
		if (hours <= 0 || hours > 24) return false;
		
		return true;
	}
///////////CLONE//////////////
    public DateTime clone(DateTime obj1) {
        DateTime cloned = new DateTime(this.hours, this.minutes, this.seconds, this.day, this.month, this.year);
        cloned.setFormat(this.getFormat());
        return cloned;

    }
///////////EQUALS///////////	
    public boolean equals(DateTime e) {
        if(e == null)
        {
            return false;
        }
        else if(getClass() != e.getClass()) { return false; }
        else if(this.seconds != e.seconds) { return false; }
        else if(this.minutes != e.minutes) { return false; }
        else if(this.hours != e.hours) { return false; }
        else if(this.day != e.day) { return false; }
        else if(this.month != e.month) { return false; }
        else if(this.year != e.year) { return false; }
        return true;

    }
 //////////NEXT//////////   
    public void next() {
    	
    	this.seconds += 1;
    	if(seconds > 59) {
    		this.seconds = 0;
    		this.minutes += 1;
    		if(minutes > 59) {
    			this.minutes = 0;
    			this.hours += 1;
    			if(hours > 23) {
    				this.hours = 0;
    				super.next();
    			}
    		}
    	}
    }
	
    public Date toDate(){
    	
    	return new Date();
    }
    
///////////TOSTRING///////////
    public String toString() {
    	
    	if(this.format == 1) {
    		if(hours < 12) {
    			return "[" + this.hours + ":" + this.minutes + ":" + this.seconds + " AM] " + this.day + "-" + this.mName + "-" + this.year;
    		}
    		else {
    			return "[" + this.hours + ":" + this.minutes + ":" + this.seconds + " PM] " + super.toString();
    		}
    	}
    	else if(this.format == 2) {
    		if(hours < 12) {
    			return "[" + this.hours + ":" + this.minutes + ":" + this.seconds + " AM] " + this.day + " de " + this.mName + " de " + this.year;
    		}
    		else {
    			return "[" + this.hours + ":" + this.minutes + ":" + this.seconds + " PM] " + super.toString();
    		}
    	}
    	else {
    		return "[" + this.hours + ":" + this.minutes + ":" + this.seconds + "] " + super.toString();
    	}
    }
	
	
}
