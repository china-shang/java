package com.gmail.the.CarMeter;

//汽车计费器抽象类
//定义两个构造函数及需要的属性
public abstract class CarMeterAbstract {

    protected float mileage = 0;
    protected float startingPrice;
    protected float perMilePrice;
    protected float price = 0;
    protected float startingMileage = 2;

    public CarMeterAbstract() {
	startingPrice = 6;
	perMilePrice = 2;

    }

    public CarMeterAbstract(float startingPrice, float perMilePrice) {
	this.startingPrice = startingPrice;
	this.perMilePrice = perMilePrice;

    }

    public CarMeterAbstract(float startingPrice, float startingMileage, float perMilePrice) {
	this.startingPrice = startingPrice;
	this.perMilePrice = perMilePrice;
	this.startingMileage = startingMileage;

    }
}
