package com.ig.Stream_API_Tasks_car;

import java.util.List;
import java.util.Set;

public interface CarService {
	public double sumOfPrices(List<Car> carList);
	public List<String> getCarNames(List<Car> carList);
	public Set<String> getCarMakers(List<Car> carList);
	//returns price of the car which has highest price
	public double getHighPricedCar(List<Car> carList);
	//returns Car which has lowest price
	public Car getCarWithLowPricedCar(List<Car> carList);
}
