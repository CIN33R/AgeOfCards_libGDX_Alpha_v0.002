package ageofcards.codingbat.com.game.utils;

import ageofcards.codingbat.com.game.assets.screens.TestScreen;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class GameHandler implements ApplicationListener {

    private Screen screen;
    private SpriteBatch batch;
    private Skin skin;
    private float globalGameHandlerTime;

    @Override
    public void create() {
        this.batch = new SpriteBatch();
        this.globalGameHandlerTime = 0.0f;
        this.skin = new Skin(Gdx.files.internal("skins/clean-crispy/skin/clean-crispy-ui.json"), new TextureAtlas(Gdx.files.internal("skins/clean-crispy/skin/clean-crispy-ui.atlas")));

        setScreen(new TestScreen(this));
    }
    @Override
    public void resize(int width, int height) {
        if (screen != null) {
            screen.resize(width, height);
        }
    }

    @Override
    public void render() {
        if (screen != null) {
            screen.render(Gdx.graphics.getDeltaTime());
        }
        globalGameHandlerTime += Gdx.graphics.getDeltaTime();
    }

    @Override
    public void pause() {
        if (screen != null) {
            screen.pause();
        }
    }

    @Override
    public void resume() {
        if (screen != null) {
            screen.resume();
        }
    }

    @Override
    public void dispose() {
        if (screen != null) {
            screen.hide();
        }
        batch.dispose();
    }

    public void setScreen(Screen screen) {
        if (this.screen != null) this.screen.hide();
        this.screen = screen;
        if (this.screen != null) {
            this.screen.show();
            this.screen.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
    }

    public Screen getScreen() {
        return screen;
    }

    public SpriteBatch getBatch() {
        return batch;
    }

    public Skin getSkin() {
        return skin;
    }

    public float getGlobalGameHandlerTime() {
        return globalGameHandlerTime;
    }
}
