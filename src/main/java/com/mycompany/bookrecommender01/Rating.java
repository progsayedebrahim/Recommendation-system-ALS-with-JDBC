/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookrecommender01;

/**
 *
 * @author AbdrhmnAns
 */
public class Rating {
    private int userId;
    private int recommendations;
    private int rate;
   
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getrecommendations() {
        return recommendations;
    }

    public void setrecommendations(int recommendations) {
        this.recommendations = recommendations;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

   
}
