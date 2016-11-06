package com.fdmgroup.threading.clock;

public class Minute implements Runnable {

	private int minute;

	Clock c;
	Clock c2;

	public Minute(Clock c, Clock c2) {
		this.c = c;
		this.c2 = c2;

	}

	@Override
	public void run() {

			for (int i = c.getMinute(); i <= 60; i++) {

				if (i == 60) {
					i = -1;
					minute = 0;
					c.setMinute(minute);

					synchronized (c2) {

						c2.notify();
//						System.out.println("minute");
					}
				} else {
					minute=i;

					c.setMinute(minute);
					synchronized (c) {
					try {
						c.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					}
				}
			}

		}
}
