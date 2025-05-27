package frc.robot.gamepad;

//Import the joystick class
import edu.wpi.first.wpilibj.Joystick;

public class OI
{
    //Create the joystick
    Joystick drivePad;

    public OI()
    {
        //initialize the joystick 
        drivePad = new Joystick(GamepadConstants.DRIVE_USB_PORT);
    }

    /**
     * Drive Controller
     */

        /**
         * @return the y-axis value from the drivePad right joystick
         */
        public double getRightDriveY()
        {
            double joy = drivePad.getRawAxis(GamepadConstants.RIGHT_ANALOG_Y);
            if(Math.abs(joy) < 0.05)
                return 0.0;
            else  
                return joy;
        }

        /**
         * @return the x-axis value from the drivePad right Joystick
         */
        public double getRightDriveX()
        {
            double joy = drivePad.getRawAxis(GamepadConstants.RIGHT_ANALOG_X);
            if(Math.abs(joy) < 0.05)
                return 0.0;
            else
                return joy;
        }

        /**
         * @return the y-axis value from the drivePad left joystick
         */
        public double getLeftDriveY()
        {
            double joy = drivePad.getRawAxis(GamepadConstants.LEFT_ANALOG_Y);
            if(Math.abs(joy) < 0.05)
                return 0.0;
            else  
                return joy;
        }
    
        /**
         * @return the x-axis value from the drivePad left Joystick
         */
        public double getLeftDriveX()
        {
            double joy = drivePad.getRawAxis(GamepadConstants.LEFT_ANALOG_X);
            if(Math.abs(joy) < 0.05)
                return 0.0;
            else
                return joy;
        }
}