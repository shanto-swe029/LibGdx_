package io.github.shantoswe029.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.ScreenUtils;

public class TextDemo extends ApplicationAdapter {
	SpriteBatch batch;
	BitmapFont font, font2;
	String myText, myText2;
	GlyphLayout glyph, glyph2;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		font  = new BitmapFont( Gdx.files.internal("font1.fnt") );
		font2 = new BitmapFont( Gdx.files.internal("font1.fnt") );
		
		myText = "Hello LibGdx World";
		glyph = new GlyphLayout(font, myText);
		
		myText2 = "xxxxxxxxxxxxxxxxxxxx\n" +
					"xxxxxxxxxx\n" + 
					"xxxxx\n" + 
					"xxx";
		glyph2 = new GlyphLayout(font, myText2);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		font.setColor(Color.WHITE);
		batch.begin();
		font.draw(batch, 
				myText, 
				Gdx.graphics.getWidth() / 2 - glyph.width / 2, 
				170 + Gdx.graphics.getHeight() / 2 + glyph.height / 2);
		
		font2.setColor(Color.RED);
		font2.getData().setScale(1.2f);
		font2.draw(batch, 
				myText2, 
				Gdx.graphics.getWidth() / 2 - glyph2.width * 1.2f / 2, 
				Gdx.graphics.getHeight() / 2 + glyph2.height * 1.2f / 2, 
				glyph2.width * 1.2f, 
				Align.center, 
				true);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
		font2.dispose();
	}
}
