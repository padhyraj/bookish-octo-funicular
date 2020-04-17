package automobile.ship;
public class Compartment 
  {
	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth)
        {
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	//method1
       public double getHeight() 
       { 
        return  height; 
       } 
  
      // method 2 
      public double getWidth() 
      { 
        return width; 
      } 
  
    // method 3 
      public double getBreadth() 
      { 
        return breadth; 
       } 
  

	@Override
	public String toString()
        {
		return ("height is:"+this.getHeight()+".\nwidth is: "+this.getWidth()+".\nbreadth is"+this.getBreadth());
	}


	public static void main(String[] args) 
        {
		Compartment compartment = new Compartment(10.5, 4.5, 8.2);
		
		System.out.println(compartment.toString());
	}
}