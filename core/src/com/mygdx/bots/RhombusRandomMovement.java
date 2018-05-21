package com.mygdx.bots;


import com.mygdx.game.model.RhombusMovement;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class RhombusRandomMovement extends RhombusMovement{
    
    public RhombusRandomMovement(float speed, float height, float width, float initialX, float initialY) {
        super(speed, height, width, initialX, initialY);        
    }
    
    protected Random randomizer = new Random();
    
    protected int genereteNextDirection(int prevNode, int nextNode) {
        if (prevNode == 1) {
            if (nextNode == 2){
                return 1;
            } else if (nextNode == 4){
                return 2;
            }
        }
        if (prevNode == 2) {
            if (nextNode == 1){
                return 3;
            } else if (nextNode == 3){
                return 2;
            }
        }
        if (prevNode == 3) {
            if (nextNode == 2){
                return 4;
            } else if (nextNode == 4){
                return 3;
            }
        }
        if (prevNode == 4) {
            if (nextNode == 3){
                return 1;
            } else if (nextNode == 1){
                return 4;
            }
        }
        return 1;
    }
    
    protected int genereteNextNode(int prevNode, int currentDirection) {
        switch (prevNode) {
            case 1:
                return randomizer.nextInt(2) == 0 ? 2 : 4;
            case 2:
                return randomizer.nextInt(2) == 0 ? 3 : 1;
            case 3:
                return randomizer.nextInt(2) == 0 ? 2 : 4;
            case 4:
                return randomizer.nextInt(2) == 0 ? 3 : 1;
        }
        return 1;
    }
    
    
}
