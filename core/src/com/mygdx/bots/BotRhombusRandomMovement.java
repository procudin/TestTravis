package com.mygdx.bots;

import com.mygdx.game.model.*;

/**
 * Класс движения
 * @author Admin
 */
public class BotRhombusRandomMovement extends Component{    
    @Override
    public void load(){
        levelModel.playerShip().setComponent("Movement", new RhombusRandomMovement(200,300,60,100,200));        
        levelModel.playerShip().transform().X = 100;
        levelModel.playerShip().transform().Y = 200;
    }
}
