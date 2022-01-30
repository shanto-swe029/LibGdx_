package io.github.shantoswe029;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter implements InputProcessor{
	SpriteBatch batch;
	Sprite theWorld;
	OrthographicCamera camera;
	
	final float WORLD_WIDTH = 50;
	final float WORLD_HEIGHT = 25;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		theWorld = new Sprite(new Texture(Gdx.files.internal("TheWorld.png")));
		theWorld.setPosition(0, 0);
		theWorld.setSize(WORLD_WIDTH, WORLD_HEIGHT);
		
		float aspectRatio = (float)Gdx.graphics.getHeight() / (float)Gdx.graphics.getWidth();
		
		camera = new OrthographicCamera(WORLD_HEIGHT * aspectRatio, WORLD_HEIGHT);
		camera.position.set(WORLD_WIDTH / 2, WORLD_HEIGHT / 2, 0);
		
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		
		camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		theWorld.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		if(keycode == Input.Keys.RIGHT)
	         camera.translate(1f,0f);
	    if(keycode == Input.Keys.LEFT)
	         camera.translate(-1f,0f);
	    if(keycode == Input.Keys.UP)
	         camera.translate(0f,1f);
	    if(keycode == Input.Keys.DOWN)
	         camera.translate(0f,-1f);
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
