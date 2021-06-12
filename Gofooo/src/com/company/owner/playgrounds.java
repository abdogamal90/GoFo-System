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

public class playgrounds {
    playground theplaygrounds[] = new playground[50];     // Array that stores 'playground' Objects.
    public static int count;    // Counter for No of playground objects Added in Array.
    Scanner input = new Scanner(System.in);
    public int compareplaygroundObjects(playground b1, playground b2){

        if (b1.playgroundName.equalsIgnoreCase(b2.playgroundName)){

            System.out.println("playground of this Name Already Exists.");
            return 0;

        }if (b1.sno==b2.sno){

            System.out.println("playground of this Serial No Already Exists.");
            return 0;
        }

        return 1;
    }
    public void addplayground(playground b){

        for (int i=0; i<count; i++){

            if (this.compareplaygroundObjects(b, this.theplaygrounds[i]) == 0)
                return;

        }

        if (count<50){

            theplaygrounds[count] = b;
            count++;

        }
        else{

            System.out.println("No Space to Add More playgrounds.");

        }

    }
    public void showAllplaygrounds(){


        System.out.println("\t\t\t\tSHOWING ALL playgrounds\n");
        System.out.println("S.No\t\tplaygroundName\t\townerName\t\tAvailable Qty\t\tTotal Qty");
        for (int i=0; i<count; i++){


            System.out.println(theplaygrounds[i].playgroundName + "\t\t" + theplaygrounds[i].ownerName + "\t\t"  +
                    theplaygrounds[i].pgQtyCopy + "\t\t" + theplaygrounds[i].pgQty);

        }

    }public void upgradePlaygroundQty(){

        System.out.println("\t\t\t\tUPGRADE QUANTITY OF A Playground\n");
        System.out.println("Enter sno  No of the playground");
        int sno = input.nextInt();
        for (int i=0; i<count; i++){

            if (sno == theplaygrounds[i].sno){

                System.out.println("Enter No of the playgrounds to be Added:");
                int addingQty = input.nextInt();
                theplaygrounds[i].pgQty += addingQty;
                theplaygrounds[i].pgQtyCopy += addingQty;
                return;

            }

        }

    }
    public void dispMenu(){

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Enter 0 to Exit Application.");
        System.out.println("Enter 1 to Add new Playground.");
        System.out.println("Enter 2 to Upgrade Quantity of a Playground.");
        System.out.println("Enter 3 to Show All Playground.");
        System.out.println("Enter 4 to Register player.");
        System.out.println("Enter 5 to Show All Registered players.");
        System.out.println("Enter 6 to Check Out playground. ");
        System.out.println("--------------------------------------------------------------------------------------");

    }
    public int isAvailable(int sno){

        //returns the index number if available



        for (int i=0; i<count; i++){

            if (sno == theplaygrounds[i].sno){
                if(theplaygrounds[i].pgQtyCopy > 0){

                    System.out.println("the playground is Available.");
                    return i;

                }
                System.out.println("the playground is Unavailable");
                return -1;

            }

        }

        System.out.println("No playground of Serial Number " + " Available in playgrounds.");
        return -1;

    }
    public playground checkOutplayground(){

        System.out.println("Enter Serial No of playground to be sign in.");
        int sNo = input.nextInt();

        int playgroundIndex =isAvailable(sNo);

        if (playgroundIndex!=-1){

            //int bookIndex = isAvailable(sNo);
            theplaygrounds[playgroundIndex].pgQtyCopy--;

            return theplaygrounds[playgroundIndex];
        }

        return null;

    }

    public void checkInplayground(playground b){

        for (int i=0; i<count; i++){

            if (b.equals(theplaygrounds[i]) ){

                theplaygrounds[i].pgQtyCopy++;
                return;

            }

        }

    }







}