package io.github.shantoswe029;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends ApplicationAdapter implements InputProcessor{
	Sound blip;
	boolean shouldPlay = false;
	
	@Override
	public void create () {
		blip = Gdx.audio.newSound(Gdx.files.internal("blip.mp3"));
		
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		if( shouldPlay == true ) {
			long soundId = blip.play();
			blip.setVolume(soundId, 0.3f);
			shouldPlay = false;
		}
	}
	
	@Override
	public void dispose () {
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		if( keycode == Input.Keys.M ) {
			shouldPlay = true;
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
