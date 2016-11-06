package com.fdmgroup.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.fdmgroup.serialization.game.Backpack;
import com.fdmgroup.serialization.game.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.fdmgroup.serialization.game.Board;
import com.fdmgroup.serialization.game.Player;

public class Wizard extends Player implements Serializable {

	public Power p;

	public Wizard(String name, int healthPoint) {
		setName(name);
		setHealthPoints(healthPoint);

	}

	public Wizard(String name) {
		setName(name);

	}

	public transient Backpack bp = new Backpack();


	private void writeObject(ObjectOutputStream output) throws IOException {
		output.defaultWriteObject();
		output.writeObject(getName());
		output.writeObject(getHealthPoints());

	}

	private void readObject(ObjectInputStream input) throws IOException, ClassNotFoundException {
		input.defaultReadObject();

		setName((String) input.readObject());
		setHealthPoints((Integer)input.readObject());
	}

}
