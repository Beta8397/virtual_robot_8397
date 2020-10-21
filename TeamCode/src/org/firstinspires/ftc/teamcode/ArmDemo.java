package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.teamcode.mecbot.MecBotAutonomous;
import virtual_robot.controller.robots.classes.ArmBot;

@Autonomous(name="Arm Demo", group = "tutorial")
public class ArmDemo extends MecBotAutonomous {

    ArmRobot bot;
    public void runOpMode(){
        bot = new ArmRobot();
        bot.init(hardwareMap);
        super.setBot(bot);
        bot.grabber.setPosition(1);
        bot.setPose(48,9,90);
        bot.setHeadingDegrees(90);
        waitForStart();

        driveStraight(100, 102, 90, new Predicate() {
            public boolean isTrue() {
                return bot.getPose().y > 89;
            }
        });
        bot.arm.setPower(1);
        sleep(1000);
        bot.arm.setPower(0);
        bot.grabber.setPosition(0);
        sleep(200);
        driveStraight(100, -30, 90, new Predicate() {
            @Override
            public boolean isTrue() {
                return bot.getPose().y < 74;
            }
        });
    }
}
