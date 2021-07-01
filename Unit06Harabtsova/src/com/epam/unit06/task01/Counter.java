package com.epam.unit06.task01;

public class Counter {

	private int currentState;
	private int minValue;
	private int maxValue;

	public Counter() {

		currentState = 0;
		minValue = 0;
		maxValue = 1000;

	}

	public Counter(int currentState2, int minValue2, int maxValue2) {
		currentState = currentState2;
		minValue = minValue2;
		maxValue = maxValue2;
	}

	public int increaseCounter(int increase) {
		this.currentState = this.currentState + increase;
		return this.currentState;
	}

	public int decreaseCounter(int decrease) {
		this.currentState = this.currentState - decrease;
		return this.currentState;
	}

	public int getcurrentState() {
		if (this.currentState > maxValue) {
			throw new RuntimeException("The value exceeds Max value.");
		} else if (this.currentState < this.minValue) {
			throw new RuntimeException("The value is lower than min value.");
		}
		return this.currentState;

	}

}
