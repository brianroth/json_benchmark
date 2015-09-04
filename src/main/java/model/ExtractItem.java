package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class ExtractItem implements Serializable {
	private PeriodType periodType;
	private long referenceDate;
	private String productId;
	private String locationId;
	private float unitCost;
	private float unitRetail;
	private List<ExtractLocationPeriod> locationPeriods;

	public ExtractItem(PeriodType periodType, long referenceDate, String productId, String locationId,
			float unitCost, float unitRetail) {
		this.periodType = periodType;
		this.referenceDate = referenceDate;
		this.productId = productId;
		this.locationId = locationId;
		this.unitCost = unitCost;
		this.unitRetail = unitRetail;
		this.locationPeriods = new ArrayList<>();
	}

	public void addPeriod(ExtractLocationPeriod locationPeriod) {
		this.locationPeriods.add(locationPeriod);
	}

	public List<ExtractLocationPeriod> getLocationPeriods() {
		return locationPeriods;
	}

	public PeriodType getPeriodType() {
		return periodType;
	}

	public long getReferenceDate() {
		return referenceDate;
	}

	public String getProductId() {
		return productId;
	}

	public String getLocationId() {
		return locationId;
	}

	public float getUnitCost() {
		return unitCost;
	}

	public float getUnitRetail() {
		return unitRetail;
	}
}
