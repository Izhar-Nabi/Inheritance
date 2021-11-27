class DigitalWatch{
	String Company;
	String Day;
	String Date;
	String Time;
	String Location;
	String Calling;
}
 	class AnalogWatch extends DigitalWatch{
	public void Function(){
	System.out.println("Old Watch Working Function");	}
	public static void main(String args[]){
	AnalogWatch Watch= new AnalogWatch();
	Watch.Company="XYZ";
	Watch.Time="2:39 ";
	Watch.Day="Xyz day";
	Watch.Date="28/11/2021";
	System.out.println("Company Name is "+Watch.Company);
	System.out.println("Time HH:MM = "+Watch.Time); 
	System.out.println("Company Name is "+Watch.Day);
	System.out.println("Company Name is "+Watch.Date);	
		}
	
	}