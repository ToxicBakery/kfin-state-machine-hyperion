package com.toxicbakery.kfinstatemachine

class KfinPlugin {

    fun registerMachine(id: String, machine: IStateMachine<*>) = Unit

    fun unregisterMachine(id: String) = Unit

}
