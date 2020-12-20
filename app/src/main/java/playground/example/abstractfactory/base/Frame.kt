package playground.example.abstractfactory.base

import playground.example.abstractfactory.enums.FrameMaterial
import playground.example.abstractfactory.enums.FrameType

interface Frame {

    fun getType(): FrameType

    fun getMaterial(): FrameMaterial
}