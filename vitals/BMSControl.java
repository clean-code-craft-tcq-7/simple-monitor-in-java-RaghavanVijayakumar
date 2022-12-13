package vitals;
public class BMSControl{
  
  public boolean isBatteryParameterWithinLimits(float parameter,float minLimit, float maxLimit)
  {
    return parameter >= minLimit && parameter <= maxLimit;
  }
  
  public boolean isTemperatureinValidRange(float temperature)
  {
    return (isBatteryParameterWithinLimits(temperature,BMSConstants.MinTemperature,BMSConstants.MaxTemperature));
  }
  
   public boolean isSOCinValidRange(float soc)
  {
    return (isBatteryParameterWithinLimits(soc,BMSConstants.MinSoc,BMSConstants.MaxSoc));
  }
         
  public boolean isChargeRateinValidRange(float chargeRate)
   {
      return (chargeRate <= BMSConstants.MaxChargeRate);
   }
            
   public boolean batteryIsOk(float temperature, float soc, float chargeRate) {
     return (isTemperatureinValidRange(temperature) && isSOCinValidRange(soc) && isChargeRateinValidRange(chargeRate));
   }
}            
