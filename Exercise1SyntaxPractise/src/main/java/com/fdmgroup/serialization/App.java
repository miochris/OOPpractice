package com.fdmgroup.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.serialization.game.Board;
import com.fdmgroup.serialization.game.Player;

public class App {

	public static void main(String[] args)  {
		List<Player> list =new ArrayList<Player>();
		
		Wizard wwww1 = new Wizard("wwww1", 0);
		// w1.setName("W1");
		Player p1 = new Player();
		p1.setName("P1");
		Wizard w2 = new Wizard("w2", 0);
		// w1.setName("W2");

		Board board = new Board();

		System.out.println("wwww1's heath Points is " + wwww1.getHealthPoints());
		System.out.println("w2's heath Points is " + w2.getHealthPoints());

		board.attack(p1, w2);
		board.loseHealthPoint(w2);
		board.attack(p1, w2);
		board.loseHealthPoint(w2);
		board.loseHealthPoint(wwww1);
		// board.attack(w1, w2);
		// board.loseHealthPoint(w2);
		// board.attack(w2, w1);
		// board.loseHealthPoint(w1);
		
		list.add(wwww1);
		list.add(w2);
		

		System.out.println("wwww1's heath Points is " + wwww1.getHealthPoints());
		System.out.println("w2's heath Points is " + w2.getHealthPoints());

		ObjectOutputStream output = null;

		// serialization
		try {
			output = new ObjectOutputStream(new FileOutputStream("./Serialization.txt"));
			output.writeObject(list);
			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		



		// de-serialization
		List<Player> oldList=new ArrayList<Player>();
//		Wizard oldW1 = null;
		ObjectInputStream input;
		try {
			input = new ObjectInputStream(new FileInputStream("./Serialization.txt"));
			oldList = (List<Player>) input.readObject();
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wizard oldW1 = (Wizard) list.get(0);
		Wizard oldW2 = (Wizard) list.get(1);

//		System.out.println(oldW1.getHealthPoints());
//		System.out.println(oldW1.getName());
		System.out.println(oldW1.getName());
		System.out.println(oldW1.getHealthPoints());
		System.out.println(oldW2.getName());
		System.out.println(oldW2.getHealthPoints());

	}

}
