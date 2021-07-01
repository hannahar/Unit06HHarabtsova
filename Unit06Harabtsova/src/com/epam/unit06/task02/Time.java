package com.epam.unit06.task02;

public class Time {

	private int hour;
	private int minutes;
	private int seconds;

	public Time() {
		hour = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hour2, int minutes2, int seconds2) {
		hour = hour2;
		minutes = minutes2;
		seconds = seconds2;
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public int updateHours(int hourAmount) {
		if (hourAmount > 60) {
			hourAmount = 0;
		}
		this.hour = this.hour + hourAmount;
		return this.hour;
	}

	public int updateMinutes(int minutesAmout) {
		if (minutesAmout > 60) {
			minutesAmout = 0;
		}
		this.minutes = this.minutes + minutesAmout;
		return this.minutes;
	}

	public int updateSeconds(int secondsAmount) {
		if (secondsAmount > 60) {
			secondsAmount = 0;
		}
		this.seconds = this.seconds + secondsAmount;
		return this.seconds;
	}
	public int changeTheWholeTime (int amount) {
		int timeInSec;
		 timeInSec = (this.hour * 3600) + (this.minutes * 60) + this.seconds + amount;
		 return timeInSec;
	}

}
