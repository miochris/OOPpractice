package com.fdmgroup.collections;

import java.util.PriorityQueue;

public class Sort {
	
	private PriorityQueue<Double> pq;

	public void sortNumber(double n1, double n2) {
		
		pq.offer( n1);
		pq.add(n2);
		System.out.println(n1+" " +n2);
	}

	public PriorityQueue<Double>  getPriorityQueue() {
		// TODO Auto-generated method stub
		return pq;
	}

}
