package com.mygdx.bots;


import com.mygdx.game.model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template dick, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BotRhombusMovement extends Component{
    
    @Override
    public void load(){
        levelModel.playerShip().setComponent("Movement", new RhombusMovement(350,300,30,50,200));
        levelModel.playerShip().transform().X = 50;
        levelModel.playerShip().transform().Y = 200;
    }
}
