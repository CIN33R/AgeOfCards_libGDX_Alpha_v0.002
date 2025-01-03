package ageofcards.codingbat.com.game.assets.screens;

import ageofcards.codingbat.com.game.utils.GameHandler;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class TestScreen implements Screen {

    GameHandler game;
    Screen parent;
    Stage stage;

    public TestScreen(GameHandler game) {
        this.game = game;
        this.parent = this;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float v) {

    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
