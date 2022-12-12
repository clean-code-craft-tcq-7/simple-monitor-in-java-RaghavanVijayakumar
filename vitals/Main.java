package vitals;

public class Main {
    static boolean batteryIsOk(float tempertature,float soc,float chargeRate) {
    	if(isTemperatureinrange(tempertature)==false || isSOCValid(soc)==false || isChargeRateinRange(chargeRate)==false) {
    		return false;
    	}
        return true;
    }
    
    
  public static boolean isTemperatureinrange(float tempertature) {
	  if(temperature < 0 || temperature > 45) {
          System.out.println("Temperature is out of range!");
          return false;
      }
  }
  
  public static boolean isSOCValid(float soc) {
	  if(soc < 20 || soc > 80) {
          System.out.println("State of Charge is out of range!");
          return false;
      }
  }

  public static boolean isChargeRateinRange(float chargeRate) {
	  if(chargeRate > 0.8) {
          System.out.println("Charge Rate is out of range!");
          return false;
      }
  }
    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f) == true);
        assert(batteryIsOk(50, 85, 0.0f) == false);
        System.out.println("Some more tests needed");
    }
}
