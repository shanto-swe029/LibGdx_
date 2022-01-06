package io.github.shantoswe029;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite sprite;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		sprite = new Sprite(img);
		sprite.setPosition(Gdx.graphics.getWidth() / 2 - sprite.getWidth() / 2, Gdx.graphics.getHeight() / 2 - sprite.getHeight() / 2);
	}

	@Override
	public void render () {
		
		if( Gdx.input.isKeyPressed(Input.Keys.LEFT) ) {
			sprite.translateX(-1f);
		}
		if( Gdx.input.isKeyPressed(Input.Keys.RIGHT) ) {
			sprite.translateX(1f);
		}
		
		if( Gdx.input.isButtonJustPressed(Input.Buttons.LEFT) ) {
			sprite.setPosition( Gdx.input.getX(), Gdx.graphics.getHeight() -  Gdx.input.getY());
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
}
