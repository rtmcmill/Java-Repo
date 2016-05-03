/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mrobert
 */
public class Ball {

	private double capacity = 0;

	/**
	 * Constructor that creates a new ball object with the specified weight and
	 * capacity.
	 * 
	 * @param capacity
	 *            Capacity of the new object.
	 */
	public Ball(double capacity) {
		this.capacity = capacity;
	}

	/**
	 * Returns the capacity of the Ball.
	 * 
	 * @return the capacity of the Ball.
	 */
	public double getCapacity() {
		return capacity;
	}

}