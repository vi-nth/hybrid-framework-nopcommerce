package javaOOP;

public class CarOOP {
	private String carCompany;
	private String carType;
	private String fuelType;
	private Float mileAge;
	private Double carPrice;
	
	protected CarOOP(String carCompany, String carType, String fuelType, Float mileAge, Double carPrice) {
		super();
		this.carCompany = carCompany;
		this.carType = carType;
		this.fuelType = fuelType;
		this.mileAge = mileAge;
		this.carPrice = carPrice;
	}

	protected String getCarCompany() {
		return carCompany;
	}

	protected void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	protected String getCarType() {
		return carType;
	}

	protected void setCarType(String carType) {
		this.carType = carType;
	}

	protected String getFuelType() {
		return fuelType;
	}

	protected void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	protected Float getMileAge() {
		return mileAge;
	}

	protected void setMileAge(Float mileAge) {
		this.mileAge = mileAge;
	}

	protected Double getCarPrice() {
		return carPrice;
	}

	protected void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
	protected void showCarInfor() {
		System.out.println("Car Company =" + getCarCompany());
		System.out.println("Car Type =" + getCarType());
		System.out.println("Car fuel Type =" + getFuelType());
		System.out.println("Car mile Age =" + getMileAge());
		System.out.println("Car Price =" + getCarPrice());
	}
	
	public static void main(String[] args) {
		CarOOP honda = new CarOOP("Honda","City","Petrol", 150f, 5000d);
		honda.showCarInfor();
		
		CarOOP toyota = new CarOOP("Toyota", "Camry", "Diesel", 250f, 7000d);
		toyota.showCarInfor();
		
		
		
	}


}
