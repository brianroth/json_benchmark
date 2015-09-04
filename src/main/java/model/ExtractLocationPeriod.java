package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ExtractLocationPeriod implements Serializable {
	private int roq;
	private int offset;
	private float targetInventory;
	private float forecastedInventory;
	private float salesForecast;

	public ExtractLocationPeriod(int roq, int offset, float targetInventory, float forecastedInventory,
			float salesForecast) {
		this.roq = roq;
		this.offset = offset;
		this.targetInventory = targetInventory;
		this.forecastedInventory = forecastedInventory;
		this.salesForecast = salesForecast;
	}

	public int getRoq() {
		return roq;
	}

	public int getOffset() {
		return offset;
	}

	public float getTargetInventory() {
		return targetInventory;
	}

	public float getForecastedInventory() {
		return forecastedInventory;
	}

	public float getSalesForecast() {
		return salesForecast;
	}
}
