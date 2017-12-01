package com.mygdx.game;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private ArrowGame arrowGame;
	private Texture redcircleImg;
	private Texture uparrowImg;
	 
    public GameScreen(ArrowGame arrowGame) {
        this.arrowGame = arrowGame;
        redcircleImg = new Texture("red-circle.png");
        uparrowImg = new Texture("up-arrow.png");
        
    
    }
	public void render (float delta) {
		SpriteBatch batch = arrowGame.batch;
        batch.begin();
        batch.draw(redcircleImg, 350, 450);
        batch.draw(uparrowImg, 415, 515);
        batch.end();
	}

}
