package playground.example.abstractfactory.base

import playground.example.abstractfactory.enums.FuelSystem
import playground.example.abstractfactory.enums.FuelVolume

interface Fuel {

    fun getVolume(): FuelVolume

    fun getFuelSystem(): FuelSystem
}