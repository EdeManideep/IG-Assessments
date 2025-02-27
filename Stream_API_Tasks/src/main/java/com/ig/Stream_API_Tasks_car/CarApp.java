package com.ig.Stream_API_Tasks_car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CarApp{
	
	public double sumOfPrices(List<Car> carList) {
		double totalPrice = carList.stream().mapToDouble(Car::getPrice).sum();
		return totalPrice;
	}
	
	public List<String> getCarNames(List<Car> carList){
		List<String> strNames = carList.stream().map(Car::getCarName).collect(Collectors.toList());
		return strNames;
	}
	
	public Set<String> getCarMakers(List<Car> carList){
		Set<String> strCarMakers = carList.stream().map(Car::getCareMake).collect(Collectors.toSet());
		return strCarMakers;
	}
	
	public double getHighPricedCar(List<Car> carList) {
		return carList.stream().map(Car::getPrice).max(Double::compareTo).orElse(0.0);
	}
	
	public Car getCarWithLowPricedCar(List<Car> carList) {
		return carList.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);	}

	public static void main(String[] args){
		Car cars[]= {
						new Car("Maruti","Swift Dezire",810000.00),
						new Car("Hyundai","Verna",1100000.00),
						new Car("Toyota","Innova",2450000.00),
						new Car("Audi","Q3",4500000.00)
				
					};

		List<Car> carList = new ArrayList<>(Arrays.asList(cars));
		System.out.println(carList);
		CarApp obj = new CarApp();
		System.out.println(obj.sumOfPrices(carList));
		System.out.println(obj.getCarNames(carList));
		System.out.println(obj.getCarMakers(carList));
		System.out.println(obj.getHighPricedCar(carList));
		System.out.println(obj.getCarWithLowPricedCar(carList));
	}


}