/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesignPattern.Patterns.BehavioralPatterns.ChainOfResponsibility;

import com.DesignPattern.Patterns.BehavioralPatterns.ChainOfResponsibility.ManagerLevels.Director;
import com.DesignPattern.Patterns.BehavioralPatterns.ChainOfResponsibility.ManagerLevels.Manager;
import com.DesignPattern.Patterns.BehavioralPatterns.ChainOfResponsibility.ManagerLevels.RequestHandler;
import com.DesignPattern.Patterns.BehavioralPatterns.ChainOfResponsibility.ManagerLevels.SeniorManager;

/**
 *
 * @author Mahmoud_AbdulAzim
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RequestHandler manager = new Manager();
        RequestHandler seniorManager = new SeniorManager();
        RequestHandler director = new Director();
        manager.setNext(seniorManager);
        seniorManager.setNext(director);
        
        // -------------> ID = 5 
        manager.approve(5);
         // -------------> ID = 21 
        manager.approve(21);
         // -------------> ID = 41
        manager.approve(41);
         // -------------> ID more Than Range Of Director
        manager.approve(90);
    }

}
