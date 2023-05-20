package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="TeleOpFALKI", group = "FALKI-TeleOp")
public class TeleOpFALKI extends LinearOpMode {
final ElapsedTime runtime = new ElapsedTime();

    public void runOpMode() {

        // define motors

        //Set motor directions


        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();



    }
}
