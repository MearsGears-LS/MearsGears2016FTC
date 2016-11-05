
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;

/**
 This is lawton's TeleOp program :) mrs M test
 */
//hi
@TeleOp(name="LawtonDriveMode")

public class Lawton extends OpMode {

    DcMotor left;
    DcMotor right;

    Servo leftarm;
    Servo rightarm;


    double leftwheelpower;
    double rightwheelpower;


    @Override
    public void init() {
        left = hardwareMap.dcMotor.get("leftwheel");
        right = hardwareMap.dcMotor.get("rightwheel");
        left.setDirection(DcMotor.Direction.REVERSE);


        leftarm = hardwareMap.servo.get("leftservo");
        rightarm = hardwareMap.servo.get("rightservo");
        rightarm.setDirection(Servo.Direction.REVERSE);

    }

    @Override()
    public void loop() {
        left.setPower(-leftwheelpower);
        right.setPower(-rightwheelpower);

        if (gamepad2.right_bumper) {
            leftwheelpower = gamepad2.left_stick_y;
            rightwheelpower = gamepad2.right_stick_y;
        } else {
            leftwheelpower = gamepad1.left_stick_y;
            rightwheelpower = gamepad1.right_stick_y;
        }
        if(gamepad1.left_trigger>0){
            leftarm.setPosition(100);
            rightarm.setPosition(100);
        }else {
            leftarm.setPosition(0);
            rightarm.setPosition(0);
        }

    }
}


