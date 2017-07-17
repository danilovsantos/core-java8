package com.java.inner.classes;

public class GearBox {

	private int gearBoxNum;

	public GearBox(){}
	
	public GearBox(int gearBoxNum){
		this.gearBoxNum = gearBoxNum;
	}
	
	public void printGearBoxNum(){
		System.out.println(this.gearBoxNum);
	}
	
	public int getGearBoxNum() {
		return gearBoxNum;
	}
	public void setGearBoxNum(int gearBoxNum) {
		this.gearBoxNum = gearBoxNum;
	}


	public class Gear{
		
		private int gearNum;

		public Gear(){}
		
		public Gear(int gearNum){
			this.gearNum = gearNum;
		}
		
		public void printGearNum(){
			System.out.println(this.gearNum);
		}
		
		public int getGearNum() {
			return gearNum;
		}

		public void setGearNum(int gearNum) {
			this.gearNum = gearNum;
		}
		
	}
	
	public interface GearInterface {
		public void useIt(int num);
	}
	
	
}
