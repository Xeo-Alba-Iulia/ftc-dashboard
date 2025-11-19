package com.acmerobotics.dashboard

import com.pedropathing.geometry.Pose
import com.pedropathing.localization.Localizer
import com.pedropathing.math.Vector

object FakeLocalizer : Localizer {
    override fun getPose() = Pose()

    override fun getVelocity() = Pose()

    override fun getVelocityVector() = Vector()

    override fun setStartPose(setStart: Pose) {

    }

    override fun setPose(setPose: Pose) {

    }

    override fun update() {

    }

    override fun getTotalHeading() = 0.0

    override fun getForwardMultiplier() = 1.0

    override fun getLateralMultiplier() = 1.0

    override fun getTurningMultiplier() = 1.0

    override fun resetIMU() {}

    override fun getIMUHeading() = 0.0

    override fun isNAN() = false
}