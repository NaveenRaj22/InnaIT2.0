package com.qa.innait.helper;

public class PropertyReaderManager {

	static PropertyReaderManager prm = new PropertyReaderManager();

	private PropertyReaderManager() {

	}

	public PropertyReader pr;

	public static PropertyReaderManager getInstance() {
		return prm;
	}

	public PropertyReader getPr() throws Throwable {
		if (pr == null) {
			pr = new PropertyReader();
		}
		return pr;
	}
}
