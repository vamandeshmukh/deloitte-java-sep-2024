package com.deloitte.demo.day3.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> rtaCodes = new HashMap<>();

		rtaCodes.put("MH", "Maharashtra");
		rtaCodes.put("AP", "Andhra Pradesh");
		rtaCodes.put("TG", "Telangana");

		rtaCodes.forEach((s1, s2) -> {
			System.out.println(s1 + " " + s2);
		});

		System.out.println(rtaCodes.get("TG"));
		System.out.println(rtaCodes.keySet());
		System.out.println(rtaCodes.values());

	}

}
