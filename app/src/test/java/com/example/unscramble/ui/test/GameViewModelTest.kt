package com.example.unscramble.ui.test

import com.example.unscramble.ui.GameViewModel
import org.junit.Test

class GameViewModelTest {
    private val viewModel = GameViewModel() // gameViewModel instance tot est with

    @Test
    fun gameViewModel_CorrectWordGuessed_ScoreUpdatedAndErrorFlagUnset() {
        var currentGameUiState = viewModel.uiState.value
    }
}