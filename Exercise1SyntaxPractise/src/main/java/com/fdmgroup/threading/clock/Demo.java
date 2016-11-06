package com.fdmgroup.threading.clock;

public class Demo {

	static Clock c = new Clock();
	static Clock c2 = new Clock();

	public static void main(String[] args) {
		c2.setHour(23);
		c.setMinute(59);
		c.setSecond(56);

		Thread s = new Thread(new Second(c, c2));
		s.start();
		Thread m = new Thread(new Minute(c, c2));
		m.start();
		Thread h = new Thread(new Hour(c2));
		h.start();

	}

}
