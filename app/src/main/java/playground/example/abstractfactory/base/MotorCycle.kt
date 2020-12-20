package playground.example.abstractfactory.base

interface MotorCycle {

    fun getEngine(): Engine

    fun getFrame(): Frame

    fun getFuel(): Fuel

    fun getWheel(): Wheel
}