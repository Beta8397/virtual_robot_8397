package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.teamcode.mecbot.MecBot;

public class ArmRobot extends MecBot {

    DcMotor arm;
    Servo  grabber;

    public void init(HardwareMap hwMap){
        super.init(hwMap);
        arm = hwMap.get(DcMotor.class, "arm_motor");
        grabber = hwMap.get(Servo.class, "hand_servo");
    }

}
