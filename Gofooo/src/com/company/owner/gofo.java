/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.owner;

import java.util.Scanner;

/**
 *
 * @author 2021
 */
public class gofo {









    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println("********************Welcome to the GOFO APPLICATION!********************");
    System.out.println("              Please Select From The Following Options:               ");
    System.out.println("**********************************************************************");
       
        playgrounds ob = new playgrounds();
        players obplayer = new players();
        int choice;
        int searchChoice;

        do{

            ob.dispMenu();
            choice = input.nextInt();

            switch(choice){

                case 1:
                    playground b = new playground();
                    ob.addplayground(b);
                    break;

                case 2:
                    ob.upgradePlaygroundQty();
                    break;

                case 3:
                    ob.showAllplaygrounds();
                    break;
                case 4:
                    player s = new player();
                    obplayer.addplayer(s);
                    break;
                case 5:
                    obplayer.showAllplayers();
                    break;
                case 6:
                    obplayer.checkOutplayground(ob);
                    break;

                default:
                    System.out.println("CHOICE SHOULD BE BETWEEN 0 TO 6.");

            }

        }
        while (choice!=0);
































    }

}
