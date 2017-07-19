package functional;

public interface ITGorilla {
	
	String move();

	public class GorillaFamily {
		 
		String walk = "walk";
		
		void everyonePlay(boolean baby){
			
			String approach = "amble";
			//approach = "run";
			
			play(() -> walk);
			play(() -> baby ? "hitch a ride" : "run");
			play(() -> approach);
			
		}
		
		void play(ITGorilla g){
			System.out.println(g.move());
		}
		
	}
	
}
