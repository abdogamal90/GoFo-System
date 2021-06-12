/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.owner;

/**
 *
 * @author 2021
 */




import java.util.Scanner;
public class player {

    String playerName;
    String regNum;

    playground[] signPlayground = new playground[3];
    public int playgroundsCount = 0;

    Scanner input = new Scanner(System.in);

    public player(){

        System.out.println("Enter player Name:");
        this.playerName = input.nextLine();

        System.out.println("Enter Reg Number:");
        this.regNum = input.nextLine();

    }
}