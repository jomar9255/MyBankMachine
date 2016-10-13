/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;

/**
 *
 * 
 */
public class MyBankMachine extends ATM {

    public static void main(String[] args) {
        boolean atmCond = true;
        ATM myATM = new ATM("Generic Bank", 30000);
        System.out.println(myATM.toString());
        System.out.println(myATM.withdraw(31000));
        
   }
    
}
