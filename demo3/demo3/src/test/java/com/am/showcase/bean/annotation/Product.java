package com.am.showcase.bean.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

	@Value(value="huanggl")
	private String name;
	private double prise;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the prise
	 */
	public double getPrise() {
		return prise;
	}

	/**
	 * @param prise
	 *            the prise to set
	 */
	public void setPrise(double prise) {
		this.prise = prise;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [name=" + name + ", prise=" + prise + "]";
	}

	
}
