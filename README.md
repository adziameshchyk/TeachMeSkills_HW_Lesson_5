# OOP in Java. Classes and objects

>This repository was created for homework in lesson №5 - "Classes and objects".
## Tasks

### Mandatory tasks:
0. Create a CreditCard class with the fields account number and current amount in the account.  
   Add a method that allows you to charge the amount to your credit card  
   Add a method that allows you to withdraw a certain amount from the card.   
   Add a method that displays current card information.  
   Write a program that creates three objects of the CreditCard class with the given account number and initial amount.  
   Test script for verification:  
     >Place money on the first two cards and withdraw from the third.  
     >Display the current status of all three cards.  
### Additional tasks:
1. Create a class to describe a computer; this class should contain the following fields: cost, model (string type), RAM and HDD.  
   You should create your own classes for the RAM and HDD fields.  
   Classes for RAM and HDD must have a default constructor and a constructor with all parameters.  
   The RAM class has fields "name" and "volume".  
   The HDD class has the fields "name", "volume" and "type" (external or internal).  
   The Computer class must have two constructors:  
     >the first one - with the parameters cost and model  
     >second - with all fields.  
   
   When creating a "computer" object using the first constructor, the RAM and HDD fields must be created using the default constructors.
   In each of the classes, provide methods for displaying complete information (displaying all fields and all values).
   Test script for verification:  
     >create the object “computer 1” using the first constructor and display the information on the screen  
     >create the object “computer 2” using the second constructor and display the information on the screen  
2. Create a class that describes an ATM.  
   The set of banknotes in the ATM must be specified by three properties: number of bills in denominations of 20, 50 and 100.  
   Make methods for adding money to an ATM.  
   Make a function that withdraws money, which accepts an amount of money and returns a Boolean value indicating the success of the operation.  
   When withdrawing money, the function should print how many bills of what denomination the amount is issued.  
   Create a constructor with three parameters - the number of banknotes of each denomination.
### Extra credit task:
3. Rewrite the additional task by adding a “type” field to the “computer” class and let this field be Enum (values: laptop or desktop).
