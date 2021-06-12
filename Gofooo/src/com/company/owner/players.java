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

public class players {

    Scanner input = new Scanner(System.in);

    player theplayers[] = new player[50];

//playgrounds playground;


    public static int count = 0;

    public void addplayer(player s){

        for (int i=0; i<count; i++){

            if(s.regNum.equalsIgnoreCase(theplayers[i].regNum)){

                System.out.println("player of Reg Num " + s.regNum + " is Already Registered.");
                return;
            }

        }

        if (count<=50){

            theplayers[count] = s;
            count++;

        }

    }
    public void showAllplayers(){

        System.out.println("player Name\t\tReg Number");
        for (int i=0; i<count; i++){

            System.out.println(theplayers[i].playerName + "\t\t" + theplayers[i].regNum);

        }


    }

    public int isplayer(){
        //return index number of player if available

        //System.out.println("Enter player Name:");
        //String playerName = input.nextLine();

        System.out.println("Enter Reg Number:");
        String regNum = input.nextLine();

        for (int i=0; i<count; i++){

            if (theplayers[i].regNum.equalsIgnoreCase(regNum)){

                return i;

            }

        }
        System.out.println("player is not Registered.");
        System.out.println("Get Registered First.");


        return -1;

    }
    public void checkOutplayground(playgrounds pg){
        int playerIndex =this.isplayer();

        if (playerIndex!=-1){
            System.out.println("checking out");

            pg.showAllplaygrounds();//jjjjjjjjjjjj
            playground b = pg.checkOutplayground();
            System.out.println("checking out");
            if (b!= null){

                if (theplayers[playerIndex].playgroundsCount<=3){
                    System.out.println("adding playground");
                    theplayers[playerIndex].signPlayground[theplayers[playerIndex].playgroundsCount] = b;
                    theplayers[playerIndex].playgroundsCount++;
                    return;

                }
                else {

                    System.out.println("player Can not sign in  more than 3 playgrounds.");
                    return;

                }
            }
            System.out.println("playground is not Available.");

        }

    }






}