package io.github.shantoswe029;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter implements InputProcessor{
	SpriteBatch batch;
	Texture img;
	Sprite sprite;
	boolean movingRight = false;
	boolean movingLeft = false;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		sprite = new Sprite(img);
		sprite.setPosition(Gdx.graphics.getWidth() / 2 - sprite.getWidth() / 2, 
				Gdx.graphics.getHeight() / 2 - sprite.getHeight() / 2);
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		
		if( movingRight ) {
			sprite.translateX(1f);
		}
		if( this.movingLeft ) {
			sprite.translateX(-1f);
		}
		
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		batch.draw(sprite, sprite.getX(), sprite.getY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	@Override
	public boolean keyDown(int keycode) {
		if( keycode == Input.Keys.RIGHT ) {
			movingRight = true;
		}
		if( keycode == Input.Keys.LEFT ) {
			movingLeft = true;
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		if( keycode == Input.Keys.RIGHT ) {
			movingRight = false;
		}
		if( keycode == Input.Keys.LEFT ) {
			movingLeft = false;
		}
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
		if( amountY > 0 ) {
			sprite.translateY(1f);
		}
		if( amountY < 0 ) {
			sprite.translateY(-1f);
		}
//		if( amountX > 0 ) {
//			sprite.translateX(1f);
//		}
//		if( amountX < 0 ) {
//			sprite.translateX(-1f);
//		}
		return false;
	}
	
}
