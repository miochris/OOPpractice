package com.fdmgroup.io;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class CountCharTest {
	
	@Test
	public void test_countOneLetterFromfile () throws IOException{
		//Arrange
		String fileAddress=new String();
		CountChar cc = new CountChar(fileAddress);
		fileAddress= "H:/test/test.txt";
		//Act
//		cc.readFile(fileAddress);
		
		//Assert
//		System.out.println(cc.getToString());
	}

}
