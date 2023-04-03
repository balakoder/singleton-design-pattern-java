package com.javacodestuffs.core.java.singleton;
 public class LazySingleton {
	/* private instance, so that it can be 
    accessed by only by getInstance() method  */
	private static LazySingleton instance;

	private LazySingleton() {
		// private constructor 
	}

	//method to return instance of class 
	public static LazySingleton getInstance() {
		if (instance == null) {
			// if instance is null, initialize 
			instance = new LazySingleton();
		}
		return instance;
	}
}