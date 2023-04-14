package tareas;

import java.util.Calendar;

public class Date {
	public static final int MIN_YEAR;
	public static final int MAX_YEAR;
	
	protected int day = 30, month = 4, year = 2023, format = 0;
	protected String mName = arrMName[3];
	protected static String [] arrMName = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
										 "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	
	static {
		MIN_YEAR = 1900;
		MAX_YEAR = 3000;
	}
	
	public Date() {
		Calendar now = Calendar.getInstance();
        this.day = now.get(Calendar.DAY_OF_MONTH);
        this.month = now.get(Calendar.MONTH) + 1;
        this.year = now.get(Calendar.YEAR);
        this.format = get_format();
	}
	
	public Date(int day, int month, int year) {
		if (isValidDate(day, month, year)) {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
	}
	
	public Date(int day, int month, int year, int format) {
		if (isValidDate(day, month, year)) {
			setYear(year);
			setMonth(month);
			setDay(day);
			setFormat(format);
		}
	}
	
	public Date clone() {
		return new Date(day, month, year, format);
	}
	
	public int getDay() { return day; }
	public int getMonth() { return month; }
	public int getYear() { return year; }
	public String getMName() { return mName; }
	public int get_format() { return format; }
	
	public void setDay(int day) {
		if (isValidDate (day, month, year))	this.day = day;
	}
	
	public void setFormat(int format) {
		this.format = format;
	}
	
	public void setMonth(int month) {
		if (isValidDate(day, month, year)) { 
			this.month = month;
			this.mName = arrMName[month-1];
		}
	}
	
	public String toString() {
		if(format == 1) {
			return(this.day + "-" + this.mName.substring(0, 3) + "-" + this.year);
		}
		if(format == 2) {
			return(this.day + " de " + this.mName + " de " + this.year);
		}
		else {
			String s1 = Integer.toString(this.year);
			return(this.day + "/" + month + "/" + s1.substring(2, 4));
		}
	}
	
	
	public void setYear(int year) {
		if (isValidDate(day, month, year)) this.year = year;
	}

	public boolean isLeap() { 
		return isLeap(year); 
	}
	
	public static boolean isLeap(int year) { 
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ))	return true;
		else return false;
	}
	
	public boolean isValidDate() { return isValidDate(day, month, year); }
	
	public static boolean isValidDate(int day, int month, int year) {
		if (year < 0) return false;
	
		if (month < 0 || month > 12) return false;
		
		if (day < 0 || day > maxDay(month, year)) return false;
	
		return true;
	}
	
	public static int maxDay(int month, int year) {
		int maxDay= 31;
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				maxDay = 30;
				break;
			case 2:
				if (isLeap(year)) maxDay = 29;
				else maxDay = 28;
				break;
		}
		return maxDay;
	}
	
	
	public boolean equals(Object o) {
		if (!(o instanceof Date)) return false;
		Date r = (Date) o;
		return this.day == r.day && this.month == r.month && this.year == r.year;
	}
	
	
	
	public void next () {
		int x = isLeap(this.year)? 1:0;
		
		int maxDay= 31;
		switch (this.month) {
			case 4:
			case 6:
			case 9:
			case 11:
				maxDay = 30;
				break;
			case 2:
				if (isLeap(year)) maxDay = 29;
				else maxDay = 28;
				break;
		}
		
		if (x == 1 && month == 2 && day == 28) {
			month = 3;
			this.mName = arrMName[this.month - 1];
			day = 1;
		}else if (maxDay == 30 && this.day == 30) {
			this.month += 1; 
			this.mName = arrMName[this.month - 1];
			this.day = 1;
		}else if(this.month == 12 && this.day == 31) {
			this.year += 1;
			this.day = 1;
			this.month = 1;
			this.mName = arrMName[0];
		}else if (maxDay == 31 && this.day == 31) {
			this.month += 1; 
			this.mName = arrMName[this.month - 1];
			this.day = 1;
		}else {
			this.day += 1;
		}
	}
}