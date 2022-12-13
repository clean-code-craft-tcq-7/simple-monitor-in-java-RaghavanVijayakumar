package vitals;

public class BMSTest
{
   public static void assertBMSParameters()
   {
     BMSControl BMSControl = new BMSControl();
        assert(batteryIsOk(25, 70, 0.7f) == true);
        assert(batteryIsOk(50, 85, 0.0f) == false);
        assert(batteryIsOk(35, 60, 0.8f) == false);
        assert(batteryIsOk(45, 80, 0.79f)==false);
        assert(batteryIsOk(0, 20, 0.6f)==false);
   } 
}
