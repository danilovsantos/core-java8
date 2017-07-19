package inner.classes;

public class Main {

	public static void main(String[] args) {

		GearBox gb = new GearBox(1);
		GearBox.Gear g = gb.new Gear(2);
		
		gb.printGearBoxNum();
		g.printGearNum();
		
		new GearBox.GearInterface(){
			@Override
			public void useIt(int num){
				System.out.println("use: "+num);
			}
		};
		
	}

}
