package playground.example.abstractfactory.base

import playground.example.abstractfactory.enums.EngineCylinder
import playground.example.abstractfactory.enums.EngineTorque
import playground.example.abstractfactory.enums.EngineType
import playground.example.abstractfactory.enums.EngineVolume

interface Engine {

    fun getType(): EngineType

    fun getNumCylinder(): EngineCylinder

    fun getCylinderVolume(): EngineVolume

    fun getTorque(): EngineTorque
}