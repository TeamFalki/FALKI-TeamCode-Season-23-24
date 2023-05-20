package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="TeleOpFALKI", group = "FALKI-TeleOp")
public class TeleOpFALKI extends LinearOpMode {
final ElapsedTime runtime = new ElapsedTime();

    public void runOpMode() {

        //Define motors

        //Set motor directions



        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();

        //Here comes the program itself

    }
}
