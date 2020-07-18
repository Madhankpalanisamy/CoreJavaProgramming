package org.accenture.training.day2;


class House{
	
	//Method
	public void construct() {
		System.out.println("Inside the House class and into construnct Method");
		
		Kitchen kit = new Kitchen();
		kit.kitchen();
		
		Hall ha = new Hall();
		ha.hall();

	}
}

class Kitchen{
	
	public void kitchen() {
		
		System.out.println("Kitchen is constructed");
	}
	
}

class Hall {
	
	public void hall() {
		System.out.println("hall is constructed");

	}
}


	public class CompositionHasARelationship {  //composition & Aggregation
	
		public static void main(String[] args) {
			
			House h = new House();
			h.construct();
		
	}

}
