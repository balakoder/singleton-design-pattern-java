package com.javacodestuffs.core.java.singleton;

public enum EnumSingleton {

	INSTANCE("property want to initialize at once");

	// @Getter and @Setter
	private String info;

	private EnumSingleton(String info) {
		this.info = info;
	}

	public EnumSingleton getInstance() {
		return INSTANCE;
	}

}