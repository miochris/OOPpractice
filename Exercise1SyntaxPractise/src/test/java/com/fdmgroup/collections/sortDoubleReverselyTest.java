package com.fdmgroup.collections;

import java.util.PriorityQueue;

import org.junit.Test;

public class sortDoubleReverselyTest {
	
	@Test
	public void testSortTwoNumberReversely(){
		//Arrange
		double n1 = 1.2;
		double n2 =2.7;
		Sort sort = new Sort();
		PriorityQueue<Double>  pq = new PriorityQueue<Double> ();
		//Act
		sort.sortNumber(n1,n2);
		pq=sort.getPriorityQueue();
		
		System.out.println(pq);
		
		
		//Assert
		
		
		
	}

}
