package com.toxicbakery.kfinstatemachine

import com.google.auto.service.AutoService
import com.willowtreeapps.hyperion.plugin.v1.Plugin
import com.willowtreeapps.hyperion.plugin.v1.PluginModule
import java.util.*

@AutoService(Plugin::class)
class KfinPlugin : Plugin() {

    override fun createPluginModule(): PluginModule? {
        return KfinPluginModule()
    }

    companion object {

        private val _registeredMachines: MutableMap<String, IStateMachine<*>> = HashMap()

        fun registerMachine(id: String, machine: IStateMachine<*>) {
            _registeredMachines[id] = machine
        }

        fun unregisterMachine(id: String) {
            _registeredMachines.remove(id)
        }

        val registeredMachines: List<Pair<String, IStateMachine<*>>>
            get() = _registeredMachines
                    .map { entry -> entry.key to entry.value }

    }

}
