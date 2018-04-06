package com.askrakesh.java10;

import java.lang.Runtime.Version;

public class TimeBasedVersioning {
	public static void main(String[] args) {

		Version version = Runtime.version();
		version.feature();
		version.interim();
		version.update();
		version.patch();

	}
}
