/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.model.buffs;

import com.mygdx.game.model.GameObject;
import com.mygdx.game.model.spaceships.*;

/**
 * Класс бафа
 * @author Admin
 */
public class Buff extends GameObject{
    /**
     * КОнструктор
     * @param target 
     */
    protected Buff(SpaceShip target){
        this.target = target;
    }
    
    protected SpaceShip target;         /// Целевой корабль
}
