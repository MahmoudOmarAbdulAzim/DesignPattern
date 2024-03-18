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
public class Director extends RequestHandler {

    public Director() {
        super("Director");
    }

    @Override
    public void setNext(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void approve(int id) {
        if (id >= 41 && id <= 80) {
            System.out.println("Director Request Approved");
        } else {
            super.approve(id);
        }
    }
}
