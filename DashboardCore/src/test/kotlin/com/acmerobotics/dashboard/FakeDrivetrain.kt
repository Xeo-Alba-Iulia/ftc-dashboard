package com.acmerobotics.dashboard

import com.pedropathing.Drivetrain
import com.pedropathing.math.Vector

object FakeDrivetrain : Drivetrain() {
    override fun calculateDrive(
        correctivePower: Vector?,
        headingPower: Vector?,
        pathingPower: Vector?,
        robotHeading: Double
    ): DoubleArray? {
        TODO("Not yet implemented")
    }

    override fun updateConstants() {
        TODO("Not yet implemented")
    }

    override fun breakFollowing() {}

    override fun runDrive(drivePowers: DoubleArray?) {
        TODO("Not yet implemented")
    }

    override fun startTeleopDrive() {
        TODO("Not yet implemented")
    }

    override fun startTeleopDrive(brakeMode: Boolean) {
        TODO("Not yet implemented")
    }

    override fun xVelocity(): Double {
        TODO("Not yet implemented")
    }

    override fun yVelocity(): Double {
        TODO("Not yet implemented")
    }

    override fun setXVelocity(xMovement: Double) {
        TODO("Not yet implemented")
    }

    override fun setYVelocity(yMovement: Double) {
        TODO("Not yet implemented")
    }

    override fun getVoltage(): Double {
        TODO("Not yet implemented")
    }

    override fun debugString(): String? {
        TODO("Not yet implemented")
    }
}