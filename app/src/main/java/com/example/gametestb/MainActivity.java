package com.example.gametestb;

import com.example.GameFramework.GameMainActivity;
import com.example.GameFramework.LocalGame;
import com.example.GameFramework.gameConfiguration.GameConfig;
import com.example.GameFramework.infoMessage.GameState;
import android.os.Bundle;

public class MainActivity extends GameMainActivity {
    public GameConfig createDefaultConfig() {
        return null;
    }

    public LocalGame createLocalGame(GameState gameState) {
        return null;
    }
}