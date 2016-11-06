package com.fdmgroup.collections;

import java.awt.Color;
import java.util.HashMap;

public class Colorzzz {
	private static HashMap<String, Color> colorMap = new HashMap<String, Color>();


	public HashMap<String, Color> getColorMap() {

		colorMap.put("Black", Color.BLACK);
		colorMap.put("Blue", Color.BLUE);
		colorMap.put("Cyan", Color.CYAN);
		colorMap.put("Darkgray", Color.DARK_GRAY);
		colorMap.put("Gray", Color.GRAY);
		colorMap.put("Green", Color.GREEN);
		colorMap.put("Magenta", Color.MAGENTA);
		colorMap.put("Orange", Color.ORANGE);
		colorMap.put("Pink", Color.PINK);
		colorMap.put("Red", Color.RED);
		colorMap.put("White", Color.WHITE);
		colorMap.put("Yellow", Color.YELLOW);
		colorMap.put("Lightgray", Color.LIGHT_GRAY);

		return colorMap;

	}


}
