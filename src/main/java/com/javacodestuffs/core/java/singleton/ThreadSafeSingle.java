package com.javacodestuffs.core.java.singleton;
public class ThreadSafeSingle {
	private static volatile ThreadSafeSingle instance = null;

	// private constructor
	private ThreadSafeSingle() {}

	public static ThreadSafeSingle getInstance() {
		if (instance == null) {
			synchronized(ThreadSafeSingle.class) {
				// Double check
				if (instance == null) {
					instance = new ThreadSafeSingle();
				}
			}
		}
		return instance;
	}
}