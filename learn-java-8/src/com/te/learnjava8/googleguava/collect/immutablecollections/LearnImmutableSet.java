package com.te.learnjava8.googleguava.collect.immutablecollections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class LearnImmutableSet {
	public static void main(String[] args) {
		ImmutableSet<String> trafficLights = ImmutableSet.of("RED", "YELLOW", "GREEN");
		trafficLights.stream().forEach(s -> System.out.println(s));
		
		System.out.println("--------");
		trafficLights.forEach(s -> System.out.println(s));
		
		System.out.println("--------");
		// ["RED", "YELLOW", "GREEN", "PINK"] <== ["RED", "YELLOW", "GREEN"] + ["PINK"]
		ImmutableSet<String> trafficLights_ = ImmutableSet.<String>builder().addAll(trafficLights).add("PINK").build();
		trafficLights_.stream().forEach(s -> System.out.println(s));
		
		System.out.println("--------");
		ImmutableList<String> trafficLightsList = ImmutableList.<String>copyOf(trafficLights_);
		trafficLightsList.stream().forEach(s -> System.out.println(s));
		
		System.out.println("--------");
		String string = trafficLights_.asList().get(1);
		System.out.println(string);
		
	}
}
