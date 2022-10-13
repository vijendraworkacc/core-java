package com.te.learnjava8.designpattern.prototype;

public class ComplexObject implements Cloneable {
	private int readDataFromSensor1;
	private int readDataFromSensor2;
	private int readDataFromSensor3;
	private int readDataFromSensor4;
	private int readDataFromSensor5;
	private int readDataFromSensor6;
	private int readDataFromSensor7;
	private int readDataFromSensor8;
	private int readDataFromMongodb;
	private int readDataFromRDS;
	private int readDataFromOracle;

	public ComplexObject() {
		super();
	}

	public ComplexObject(int readDataFromSensor1, int readDataFromSensor2, int readDataFromSensor3,
			int readDataFromSensor4, int readDataFromSensor5, int readDataFromSensor6, int readDataFromSensor7,
			int readDataFromSensor8, int readDataFromMongodb, int readDataFromRDS, int readDataFromOracle) {
		super();
		this.readDataFromSensor1 = readDataFromSensor1;
		this.readDataFromSensor2 = readDataFromSensor2;
		this.readDataFromSensor3 = readDataFromSensor3;
		this.readDataFromSensor4 = readDataFromSensor4;
		this.readDataFromSensor5 = readDataFromSensor5;
		this.readDataFromSensor6 = readDataFromSensor6;
		this.readDataFromSensor7 = readDataFromSensor7;
		this.readDataFromSensor8 = readDataFromSensor8;
		this.readDataFromMongodb = readDataFromMongodb;
		this.readDataFromRDS = readDataFromRDS;
		this.readDataFromOracle = readDataFromOracle;
	}

	public int getReadDataFromSensor1() {
		return readDataFromSensor1;
	}

	public void setReadDataFromSensor1(int readDataFromSensor1) {
		this.readDataFromSensor1 = readDataFromSensor1;
	}

	public int getReadDataFromSensor2() {
		return readDataFromSensor2;
	}

	public void setReadDataFromSensor2(int readDataFromSensor2) {
		this.readDataFromSensor2 = readDataFromSensor2;
	}

	public int getReadDataFromSensor3() {
		return readDataFromSensor3;
	}

	public void setReadDataFromSensor3(int readDataFromSensor3) {
		this.readDataFromSensor3 = readDataFromSensor3;
	}

	public int getReadDataFromSensor4() {
		return readDataFromSensor4;
	}

	public void setReadDataFromSensor4(int readDataFromSensor4) {
		this.readDataFromSensor4 = readDataFromSensor4;
	}

	public int getReadDataFromSensor5() {
		return readDataFromSensor5;
	}

	public void setReadDataFromSensor5(int readDataFromSensor5) {
		this.readDataFromSensor5 = readDataFromSensor5;
	}

	public int getReadDataFromSensor6() {
		return readDataFromSensor6;
	}

	public void setReadDataFromSensor6(int readDataFromSensor6) {
		this.readDataFromSensor6 = readDataFromSensor6;
	}

	public int getReadDataFromSensor7() {
		return readDataFromSensor7;
	}

	public void setReadDataFromSensor7(int readDataFromSensor7) {
		this.readDataFromSensor7 = readDataFromSensor7;
	}

	public int getReadDataFromSensor8() {
		return readDataFromSensor8;
	}

	public void setReadDataFromSensor8(int readDataFromSensor8) {
		this.readDataFromSensor8 = readDataFromSensor8;
	}

	public int getReadDataFromMongodb() {
		return readDataFromMongodb;
	}

	public void setReadDataFromMongodb(int readDataFromMongodb) {
		this.readDataFromMongodb = readDataFromMongodb;
	}

	public int getReadDataFromRDS() {
		return readDataFromRDS;
	}

	public void setReadDataFromRDS(int readDataFromRDS) {
		this.readDataFromRDS = readDataFromRDS;
	}

	public int getReadDataFromOracle() {
		return readDataFromOracle;
	}

	public void setReadDataFromOracle(int readDataFromOracle) {
		this.readDataFromOracle = readDataFromOracle;
	}

	@Override
	public String toString() {
		return "ComplexObject [readDataFromSensor1=" + readDataFromSensor1 + ", readDataFromSensor2="
				+ readDataFromSensor2 + ", readDataFromSensor3=" + readDataFromSensor3 + ", readDataFromSensor4="
				+ readDataFromSensor4 + ", readDataFromSensor5=" + readDataFromSensor5 + ", readDataFromSensor6="
				+ readDataFromSensor6 + ", readDataFromSensor7=" + readDataFromSensor7 + ", readDataFromSensor8="
				+ readDataFromSensor8 + ", readDataFromMongodb=" + readDataFromMongodb + ", readDataFromRDS="
				+ readDataFromRDS + ", readDataFromOracle=" + readDataFromOracle + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
