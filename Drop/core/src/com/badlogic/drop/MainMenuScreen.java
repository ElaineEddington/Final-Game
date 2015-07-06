package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class MainMenuScreen implements Screen {

	   final Drop game;

	    OrthographicCamera camera;

	    public MainMenuScreen(final Drop gam) {
	        game = gam;

	        camera = new OrthographicCamera();
	        camera.setToOrtho(false, 1200, 720);

	    }
	
	
	 @Override
	    public void render(float delta) {
	        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        Texture wp;
	        wp = new Texture("wp.png");

	        camera.update();
	        game.batch.setProjectionMatrix(camera.combined);

	        game.batch.begin();
	        game.batch.draw(wp,50,0);
	        game.font.draw(game.batch, "WELCOME! ", 600, 360);
	        game.font.draw(game.batch, "Tap anywhere to begin!", 600, 300);
	        game.batch.end();

	        if (Gdx.input.isTouched()) {
	            game.setScreen(new GameScreen(game));
	            dispose();
	        }
	    }
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
