package com.toxicbakery.kfinstatemachine

@Suppress("unused")
class KfinPlugin {

    companion object {

        fun registerMachine(id: String, machine: IStateMachine<*>) = Unit

        fun unregisterMachine(id: String) = Unit

        val registeredMachines: List<Pair<String, IStateMachine<*>>> = listOf()

    }

}
