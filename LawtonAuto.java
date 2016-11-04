
package org.firstinspires.ftc.teamcode;                        //You can ignore this stuff

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 This is lawton's TeleOp program :)
 */

@Autonomous(name="LawtonAuto")                                  //Title of your program

public class LawtonAuto extends LinearOpMode{                   //type of program, Lawton auto is name of program

    DcMotor left;                                               //give motors a name
    DcMotor right;



    @Override
    public  void runOpMode() throws InterruptedException {      //Happens when program starts up
        left = hardwareMap.dcMotor.get("leftwheel");            //Declare the motors and give them a name to be refered to
        right = hardwareMap.dcMotor.get("rightwheel");
        left.setDirection(DcMotor.Direction.REVERSE);           //sets one of the motors reverse becaues the motors face opposite directions



        waitForStart();                                         //waits for start button to be pressed
        sleep(0);                                            //sleep: time of wait in millaseconds
        forward(1);                                             //forward: referring to code below
        sleep(3000);
        forward(1);
        sleep(2000);
        back(0.5);
        sleep(1000);
        right(1);
        sleep(700);
        forward(1);
        sleep(3000);
        forward(0.5);
        sleep(2000);
        back(1);
        sleep(1000);
        right(1);
        sleep(700);
        forward(1);
        sleep(3000);
        forward(1);
        sleep(2000);
        back(0.5);
        sleep(1000);
        right(1);
        sleep(700);
        forward(1);
        sleep(3000);
        forward(0.5);
        sleep(2000);
        back(1);
        sleep(1000);
        right(1);
        sleep(700);
        stop();



    }
    public void forward(double power){                              //This stuff is a shortcut. If you want a robot to move foward, instead of saying both motors should run foward every time you want to drive foward just say the name, in this case forward the double is a value that will be refered to. If you want to make a motor run forward at different speeds you can just change the speed every time you add it
        left.setPower(power);
        right.setPower(power);
    }
    public void stop(double power){
        forward(0);
    }                  //is saying to use "forward" but with power 0, meaning it will stop
    public void right(double power){
        left.setPower(power);
        right.setPower(-power);
    }
    public void left(double power){
        left.setPower(-power);
        right.setPower(power);
    }
    public void back(double power){
        left.setPower(-power);
        right.setPower(-power);
    }

}















//Servo leftClaw;
//Servo rightClaw;
//Servo armMovement;





//        if (gamepad2.right_bumper){
//            leftClaw.setPosition(1);
//            rightClaw.setPosition(1);
//        }else{
//            leftClaw.setPosition(0);
//            rightClaw.setPosition(0);

//        if (gamepad2.dpad_up){
//            armMovement.setPosition(1);
//        }else{
//            armMovement.setPosition(0);
//        }
//        launcher1.setPower(1);
