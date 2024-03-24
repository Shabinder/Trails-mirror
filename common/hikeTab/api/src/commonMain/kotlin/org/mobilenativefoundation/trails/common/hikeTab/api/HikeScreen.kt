package org.mobilenativefoundation.trails.common.hikeTab.api

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.slack.circuit.runtime.CircuitUiEvent
import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.Screen

interface HikeScreen : Screen {
    object State : CircuitUiState

    sealed interface Event : CircuitUiEvent {
    }

    interface Ui {
        @Composable
        fun Content(state: State, modifier: Modifier)
    }

    interface Presenter {
        @Composable
        operator fun invoke(): State
    }
}