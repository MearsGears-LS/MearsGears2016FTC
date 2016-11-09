
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
@TeleOp(name="DriveMode")

public class DriveMode extends OpMode {

    DcMotor left;
    DcMotor right;

    DcMotor leftgrabber;
    DcMotor rightgrabber;

    //Servo leftarm;
    //Servo rightarm;


    double leftwheelpower;
    double rightwheelpower;
    public final static double left_MIN_RANGE  = -1;
    public final static double left_MAX_RANGE  = 1;
    public final static double right_MIN_RANGE  = -1;
    public final static double right_MAX_RANGE  = 1;



    @Override
    public void init() {
        left = hardwareMap.dcMotor.get("leftwheel");
        right = hardwareMap.dcMotor.get("rightwheel");
        left.setDirection(DcMotor.Direction.REVERSE);

        //leftarm = hardwareMap.servo.get("leftservo");
        //rightarm = hardwareMap.servo.get("rightservo");
        //rightarm.setDirection(Servo.Direction.REVERSE);

        leftgrabber = hardwareMap.dcMotor.get("leftgrabber");
        rightgrabber = hardwareMap.dcMotor.get("rightgrabber");
        rightgrabber.setDirection(DcMotor.Direction.REVERSE);



    }

    @Override()
    public void loop() {
        left.setPower(-leftwheelpower);
        right.setPower(-rightwheelpower);

        if (gamepad1.left_trigger>1){
            leftgrabber.setPower(0.5);
            rightgrabber.setPower(0.5);
        }
        if(gamepad1.right_trigger>1){
            leftgrabber.setPower(-0.5);
            rightgrabber.setPower(-0.5);
        }

        if (gamepad1.right_bumper) {
            leftwheelpower = gamepad2.left_stick_y;
            rightwheelpower = gamepad2.right_stick_y;
            if (gamepad2.left_trigger>1){
                leftgrabber.setPower(0.5);
                rightgrabber.setPower(0.5);
            }
            if(gamepad2.right_trigger>1){
                leftgrabber.setPower(-0.5);
                rightgrabber.setPower(-0.5);
            }
        } else {
            leftwheelpower = gamepad1.left_stick_y;
            rightwheelpower = gamepad1.right_stick_y;
        }


        //if(gamepad1.left_trigger>0){
            //leftarm.setPosition(left_MAX_RANGE);
            //rightarm.setPosition(right_MAX_RANGE);
        //}else {
            //leftarm.setPosition(left_MIN_RANGE);
            //rightarm.setPosition(right_MIN_RANGE);
        //}

    }
}


