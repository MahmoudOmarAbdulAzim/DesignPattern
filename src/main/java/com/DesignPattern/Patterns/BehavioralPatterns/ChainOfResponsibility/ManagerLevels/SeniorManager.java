/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesignPattern.Patterns.BehavioralPatterns.ChainOfResponsibility.ManagerLevels;

/**
 *
 * @author Mahmoud_AbdulAzim
 */
public class SeniorManager extends RequestHandler {

    public SeniorManager() {
        super("Senior manager");
    }

    @Override
    public void setNext(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void approve(int id) {
        if (id >= 21 && id <= 40) {
            System.out.println("Senior Manager Request Approved");
        } else {
            super.approve(id);
        }
    }
}
