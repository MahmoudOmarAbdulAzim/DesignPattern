/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesignPattern.Patterns.BehavioralPatterns.Observer;

/**
 *
 * @author Mahmoud_AbdulAzim
 */
public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyobs();
    public void update(double updatedTemperature,double updatedHumidity);
}
