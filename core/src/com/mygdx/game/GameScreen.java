package com.mygdx.game;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Random;

public class GameScreen extends ScreenAdapter {
	private ArrowGame arrowGame;
	private Texture redcircleImg;
	private Texture bluecircleImg;
	private Texture uparrowImg;
	private Texture downarrowImg;
	private Texture leftarrowImg;
	private Texture rightarrowImg;
	 
    public GameScreen(ArrowGame arrowGame) {
        this.arrowGame = arrowGame;
        Random rand = new Random();
        redcircleImg = new Texture("red-circle.png");
        bluecircleImg = new Texture("blue-circle.png");
        uparrowImg = new Texture("up-arrow.png");
        downarrowImg = new Texture("down-arrow.png");
        leftarrowImg = new Texture("left-arrow.png");
        rightarrowImg = new Texture("right-arrow.png");
        
        randCircle = rand.nextInt(1)+1;
        randArrow = rand.nextInt(3)+1;
        
    
    }
	public void render (float delta) {
		SpriteBatch batch = arrowGame.batch;
        batch.begin();
        batch.draw(redcircleImg, 350, 450);
        batch.draw(uparrowImg, 415, 515);
        batch.end();
	}

}
