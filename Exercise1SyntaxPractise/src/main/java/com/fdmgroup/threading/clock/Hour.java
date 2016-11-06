package com.fdmgroup.threading.clock;

public class Hour implements Runnable {

	Clock c2;

	private int hour;

	public Hour(Clock c2) {
		this.c2 = c2;

	}

	@Override
	public void run() {

		for (int i = c2.getHour(); i <= 24; i++) {

			if (i == 24) {
				i = -1;
				hour = 0;
				c2.setHour(hour);

			} else {

				hour = i;
				c2.setHour(hour);
				synchronized (c2) {
					try {
						c2.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}

	}

}
