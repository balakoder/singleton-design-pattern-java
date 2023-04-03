package com.javacodestuffs.core.java.singleton;
public class StaticBlockSingleton {
	// public instance 
	public static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
		// private constructor 
	}
	static {
		// static block to initialize instance 
		instance = new StaticBlockSingleton();
	}
}