/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java;

import com.mygdx.bots.BotRhombusMovement;
import com.mygdx.game.model.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.bots.RhombusRandomMovement;

/**
 *
 * @author Admin
 */
public class BotRhombusMovementTest {
    
    @Test
    public void testModelExist() {        
        Component movement = new RhombusRandomMovement(350,300,30,50,200);
        Assert.assertNotNull(movement.levelModel());
    }
    
    @Test
    public void testAddBotToModel() {        
        ILevelModel model = new LevelModel();
        Component.setLevelModel(model);                
        BotRhombusMovement instance = new BotRhombusMovement();
        model.addModule(instance);        
        Assert.assertEquals(model.modules().get(0), instance);
    }
}
