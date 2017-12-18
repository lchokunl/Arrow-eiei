package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
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
	private Texture background;
	private int randCircle;
	private int randArrow;
	private int score;
	private boolean isPlaying;
	private BitmapFont font;
	
    public GameScreen(ArrowGame arrowGame) {
        this.arrowGame = arrowGame;
        redcircleImg = new Texture("red-circle.png");
        bluecircleImg = new Texture("blue-circle.png");
        uparrowImg = new Texture("up-arrow.png");
        downarrowImg = new Texture("down-arrow.png");
        leftarrowImg = new Texture("left-arrow.png");
        rightarrowImg = new Texture("right-arrow.png");
        background = new Texture("background.jpg");
        score = 0;
        font = new BitmapFont();
        isPlaying = false;
    }
	public void render (float delta) {
		SpriteBatch batch = arrowGame.batch;
        batch.begin();
        batch.draw(background, 0, 0);
        Random rand = new Random();
        
        if (!isPlaying) {
        	//if(Gdx.input.isKeyJustPressed(Keys.UP) || Gdx.input.isKeyJustPressed(Keys.DOWN) || Gdx.input.isKeyJustPressed(Keys.LEFT) || Gdx.input.isKeyJustPressed(Keys.RIGHT)){
        		randCircle = rand.nextInt(2) + 1;
        		randArrow = rand.nextInt(4) + 1;
        		isPlaying = true;
        	//}
        }
        else {
        	if(randCircle == 1) {
        		batch.draw(redcircleImg, 350, 450);
        	}
        	else if(randCircle == 2) {
        		batch.draw(bluecircleImg, 350, 450);
        	}
        
        	if(randArrow == 1) {
        		batch.draw(uparrowImg, 415, 515);
        	}
        	else if(randArrow == 2) {
        		batch.draw(downarrowImg, 415, 515);
        	}
        	else if(randArrow == 3) {
        		batch.draw(leftarrowImg, 415, 515);
        	}
        	else if(randArrow == 4) {
        		batch.draw(rightarrowImg, 415, 515);
        	}
        	
        	if (randCircle == 1) {
        		if (randArrow == 1) {
        			if( Gdx.input.isKeyJustPressed(Keys.DOWN)) {
        				score += 10;
        				isPlaying = false;
        			}
        		} else if (randArrow == 2) {
        			if( Gdx.input.isKeyJustPressed(Keys.UP)) {
        				score += 10;
        				isPlaying = false;
        			}
        		} else if (randArrow == 3) {
        			if( Gdx.input.isKeyJustPressed(Keys.RIGHT)) {
        				score += 10;
        				isPlaying = false;
        			}
        		} else if (randArrow == 4) {
        			if( Gdx.input.isKeyJustPressed(Keys.LEFT)) {
        				score += 10;
        				isPlaying = false;
        			}
        		}
        	} else if (randCircle == 2) {
        		if (randArrow == 1) {
        			if( Gdx.input.isKeyJustPressed(Keys.UP)) {
        				score += 10;
        				isPlaying = false;
        			}
        		} else if (randArrow == 2) {
        			if( Gdx.input.isKeyJustPressed(Keys.DOWN)) {
        				score += 10;
        				isPlaying = false;
        			}
        		} else if (randArrow == 3) {
        			if( Gdx.input.isKeyJustPressed(Keys.LEFT)) {
        				score += 10;
        				isPlaying = false;
        			}
        		} else if (randArrow == 4) {
        			if( Gdx.input.isKeyJustPressed(Keys.RIGHT)) {
        				score += 10;
        				isPlaying = false;
        			}
        		}	
        	}
        }
        System.out.println("score: " + score);
        font.draw(batch, "Score : " + score, 550, 60);
        font.getData().setScale(5f);
        
        batch.end();
	}

}
