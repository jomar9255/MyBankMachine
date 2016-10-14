/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;

import java.util.Scanner;

/**
 *
 * 
 */
public class MyBankMachine extends ATM {
    
static Scanner sc = new Scanner(System.in);
static boolean flag = true;

    public static void main(String[] args) {
           
        ATM myATM1 = new ATM("Generic Bank", 30000);
        ATM myATM2 = new ATM("Canada's Trust Bank");
        ATM myATM3 = new ATM();
        
        ATM[] ATMArray = {
        myATM1, myATM2, myATM3
    };
        chooseAccount(ATMArray);
        while(flag){
            System.out.println("Please type one of the below"
                               +" commands: Balance, Deposit, Withdraw, Interest");
            String input = sc.next();
            if(input.equalsIgnoreCase("Balance")){
                
            }else if(input.equalsIgnoreCase("Deposit")){
                
            }else if(input.equalsIgnoreCase("Withdraw")){
            
            }else if(input.equalsIgnoreCase("Interest")){
                
            }
            
        }    
    }
    
    private static void chooseAccount(ATM[] array){
        flag = true;
        while(flag){
            
            String input = sc.next();
            
            for(ATM i : array){
               
            }
        }
    }
}
