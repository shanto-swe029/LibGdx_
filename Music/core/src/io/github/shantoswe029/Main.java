package io.github.shantoswe029;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Music;

public class Main extends ApplicationAdapter implements InputProcessor{
	
	Music coldMess;
	boolean shouldPlay = false;
	
	@Override
	public void create () {
		coldMess = Gdx.audio.newMusic( Gdx.files.internal("coldmess.mp3"));
//		coldMess.play();
//		coldMess.setVolume( 0.5f );
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		if( shouldPlay == true ) {
			shouldPlay = false;
			coldMess.play();
			coldMess.setVolume( 0.5f );
		}
		
	}
	
	@Override
	public void dispose () {
		coldMess.dispose();
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		if( keycode == Input.Keys.SPACE) {
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
