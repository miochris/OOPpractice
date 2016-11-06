package com.fdmgroup.threading.clock;

public class Second implements Runnable {
	Clock c;
	Clock c2;

	private int minute;
	private int second;

	public Second(Clock c, Clock c2) {
		this.c = c;
		this.c2 = c2;

	}

	@Override
	public void run() {

		for (int i = c.getSecond(); i <= 60; i++) {

			if (i == 60) {

				i = 0;
				second = 0;
				c.setSecond(second);

				synchronized (c) {

					c.notify();
					// System.out.println("second");

				}
			} else {

				second = i;
				c.setSecond(second);

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(c2.getHour() + " : " + c.getMinute() + " : " + c.getSecond());
		}

	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
