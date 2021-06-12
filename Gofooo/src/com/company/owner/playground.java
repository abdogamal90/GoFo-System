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

public class playground {


    public String playgroundName;
    public String ownerName;
    public int pgQty;//totall pg
    public int pgQtyCopy; //available ==
    public int sno; // upgrade qty playground

    Scanner input = new Scanner(System.in);

    public playground(){


        System.out.println("Enter playground Name:");
        this.playgroundName = input.nextLine();
        System.out.println("Enter owner Name:");
        this.ownerName = input.nextLine();

    }
}