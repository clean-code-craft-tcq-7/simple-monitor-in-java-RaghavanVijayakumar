package vitals;

public class BMSTest
{
   public static void assertBMSParameters()
   {
     BMSControl bmscontrol = new BMSControl();
        assert(bmscontrol.batteryIsOk(25, 70, 0.7f) == true);
        assert(bmscontrol.batteryIsOk(50, 85, 0.0f) == false);
        assert(bmscontrol.batteryIsOk(35, 60, 0.8f) == false);
        assert(bmscontrol.batteryIsOk(45, 80, 0.79f)==false);
        assert(bmscontrol.batteryIsOk(0, 20, 0.6f)==false);
   } 
}
