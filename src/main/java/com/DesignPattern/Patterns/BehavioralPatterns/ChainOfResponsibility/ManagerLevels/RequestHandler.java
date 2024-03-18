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
public abstract class RequestHandler {

    String name;
    RequestHandler nextHandler;

    private RequestHandler() {

    }

    public RequestHandler(String name) {
        this.name = name;
    }

    public abstract void setNext(RequestHandler nextHandler);

    public void approve(int id) {
        if (this.nextHandler != null) {
            this.nextHandler.approve(id);
        } else {
            System.out.println("request cannot be approved");
        }
    }
}
