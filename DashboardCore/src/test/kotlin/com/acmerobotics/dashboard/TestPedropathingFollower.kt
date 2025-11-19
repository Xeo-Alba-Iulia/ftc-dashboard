package com.acmerobotics.dashboard

import com.acmerobotics.dashboard.config.VariableProvider
import com.acmerobotics.dashboard.testopmode.TestOpMode
import com.pedropathing.follower.Follower
import com.pedropathing.follower.FollowerConstants

class TestPedropathingFollower : TestOpMode("Follower") {
    lateinit var follower: Follower

    override fun init() {
        follower = Follower(FollowerConstants(), FakeLocalizer, FakeDrivetrain)
        TestDashboardInstance.getInstance().core.run {
            try {
                addConfigVariable("TestFollower", "follower", VariableProvider(follower))
            } catch (e: Throwable) {
                e.printStackTrace()
                throw RuntimeException(e)
            }
            updateConfig()
        }
        println("Initialized Pedropathing Follower test opmode")
    }

    override fun loop() {}
}