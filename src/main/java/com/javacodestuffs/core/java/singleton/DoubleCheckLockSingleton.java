package com.javacodestuffs.core.java.singleton;

public class DoubleCheckLockSingleton {
	private static volatile DoubleCheckLockSingleton instance = null;

	private DoubleCheckLockSingleton() {
		// private constructor
	}

	public static DoubleCheckLockSingleton getInstance() {
		if (instance == null) {
			// synchronized block removed
			synchronized (DoubleCheckLockSingleton.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new DoubleCheckLockSingleton();
				}

			}
		}
		return instance;
	}
}