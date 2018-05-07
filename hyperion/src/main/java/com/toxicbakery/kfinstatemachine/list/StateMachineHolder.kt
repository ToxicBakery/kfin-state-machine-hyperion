package com.toxicbakery.kfinstatemachine.list

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.toxicbakery.kfinstatemachine.R

/**
 * Display the state of the current machine
 */
class StateMachineHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val textViewId: TextView by bind(R.id.kfin_state_machine_holder_id)
    private val textViewTransitions: TextView by bind(R.id.kfin_state_machine_holder_transitions)

    fun bind(
            id: String,
            state: Any,
            transitions: String
    ) {
        textViewId.text = label(id, state)
        textViewTransitions.text = transitions
    }

    private fun label(id: String, state: Any) =
            itemView.resources
                    .getString(R.string.kfin_list_machine_label, id, state.toString())

}