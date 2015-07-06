package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Drop extends Game{
	 public SpriteBatch batch;
	 public Texture img;
	    public BitmapFont font;

	    public void create() {
	        batch = new SpriteBatch();
	        //Use LibGDX's default Arial font.
	        font = new BitmapFont();
	        this.setScreen(new MainMenuScreen(this));

	    }	    

	    public void render() {
	        super.render(); //important!
//	        batch.begin();
//			batch.draw(img, 0, 0);
//			batch.end();
	    }

	    public void dispose() {
	        batch.dispose();
	        font.dispose();
	        super.dispose();
	    }

}
