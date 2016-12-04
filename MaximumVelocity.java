import acm.program.*;


public class MaximumVelocity extends ConsoleProgram {
	


    public void run() {

}

class Vehicles{

    public String Description;

    public double getMaximumVerlocity(double P, double DENSITY, double A, double CW){
        //Calculate Maximum Velcoity with ilearn-Formula
        return Math.cbrt((2*P)/(DENSITY*A*CW))*3.6;
    }
}

class WaterVehicles extends Vehicles{

    //Motorpower in Watt
    public double P;
    
    //Front Surface
    public double A;
    
    //Water density
    public final int WATER_DENSITY = 1028;
    
    //coeffizent
    public final double CW = 0.3;

    @Override
    public double getMaximumVerlocity(double P, double DENSITY, double A, double CW) {
        //Return Value from Superclass with Km/h to Knot calculation
        return super.getMaximumVerlocity(P, WATER_DENSITY, A, CW)/1.85;
    }
}

class LandVehicles extends Vehicles{

	//Motorpower
	protected int P;
	
	//Front Window Size
	private final double A = 2.5;
	
	//Air density
	private final double Air_Density = 1.3;
	
	//drag coeffizent
	private final double CW = 0.35;
	
	public void Cars(int power){
		this.P = power;
	}

class Cars extends LandVehicles{

    //Front Window Size
    public final double A = 2.5;

    public Cars(String description, int ps){

        this.Description = description;
        this.P = (int) (ps * 735.49875);

    }

    public double getMaximumVerlocity(){
        return super.getMaximumVerlocity(P, Air_Density, A, CW);
    }

    public String getOutput(){
        return Description + " (" + (int)(P/735.49875)+ " PS" + ")" + ": " + (int)this.getMaximumVerlocity() + "km/h";
    }

}

class Steamships extends WaterVehicles {

    public double displaceVolume;
    public double length;

    public Steamships(String description, int ps, double displaceVolume, double length) {

        this.Description = description;
        this.displaceVolume = displaceVolume;
        this.length = length;
        this.P = ps * 735.49875;
        this.A = displaceVolume / length;

    }

    public double getMaximumVerlocity() {
        return super.getMaximumVerlocity(P, WATER_DENSITY, A, CW);
    }

    public String getOutput(){
        return Description +" ("+ (int)(P/735.49875) + "PS, " + (int)displaceVolume + "m³, " + (int)length + "m): "
                +(int)(this.getMaximumVerlocity()*1.85) + "Km/h ("+ (int)this.getMaximumVerlocity() + "kts)";
    }
}

class RowingBoats extends WaterVehicles{

    public int persons;
    public double width;
    public double draught;

    public RowingBoats(String description, int persons, double width, double draught){

        this.Description = description;
        this.P = persons * 100;
        this.A = 0.5 * width * draught;
        this.persons = persons;
        this.width = width;
        this.draught =  draught;

    }

    public double getMaximumVerlocity(){
        return super.getMaximumVerlocity(P, WATER_DENSITY, A, CW);
    }

    public String getOutput(){
        return Description + "(" + persons+ " rowers, b = " + width + ", a = " + draught + " ): "
                + (int)(this.getMaximumVerlocity()*1.85) + "km/h (" + (int)getMaximumVerlocity() + "kts)";
    }
}

class Bicycles extends LandVehicles {

    public double a;
    public double b;
    public double cdA;
   
        }
    }

  
    public String getOutput(){
		return null;


    }

}

