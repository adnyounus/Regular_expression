/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comlab_1;

/**
 *
 * @author Flying Dutchman
 */
import java.util.*;
public class ComLab_1 {

    static void id_method(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ID :");
        String id_str = input.nextLine();
        if(id_str.length()==9){
            String first_part = id_str.substring(0, 3);
            String first_real = new String("011");
            if(first_part.equals(first_real) ){
                int year = Integer.valueOf(id_str.substring(3, 5));
                if(year >= 03 && year <= 21){
                    int batch = Integer.valueOf(id_str.substring(5, 6));
                    if(batch >= 1 && batch <= 3){
                        int roll = Integer.valueOf(id_str.substring(6));
                        if(roll >= 001 && roll <= 999){
                            System.out.println("Valid ID");              
                        }
                        else System.out.println("Invalid ID");
      
                    }
                    else System.out.println("Invalid ID");
  
            }
                else System.out.println("Invalid ID");
            
            }
            else System.out.println("Invalid ID");
        }
        else {
            System.out.println("Invalid ID");

        }
    
    }
    static void email_method(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Email :");
        String email_str = input.nextLine();
        char[] chars = email_str.toCharArray();
        int find_num = 0;
        
        for(int i=0; i<email_str.length();i++){
         if(Character.isDigit(chars[i])){
             find_num = i;
             break;
         }
      }
        String email_next = email_str.substring(find_num);
        //System.out.println(email_next);
        String[] arrOfStr = email_next.split("@", 2); 
//        for (String a : arrOfStr) 
//            System.out.println(a);
        String id_part = arrOfStr[0];
        String mail_part = arrOfStr[1];
 //       System.out.println(mail_part);
        String[] arrOfStr1 = mail_part.split("[.]", 2);
        String mail_first = arrOfStr1[0];
        String mail_second = arrOfStr1[1];
//               for (String b : arrOfStr1) 
//            System.out.println(b);
        String mail_first_cse = new String("bscse");
        String mail_first_eee = new String("bseee");
        String mail_domain = new String("uiu.ac.bd");
        
         if(id_part.length()==6){
             System.out.println("1");
            
                int year = Integer.valueOf(id_part.substring(0, 2));
                if(year >= 03 && year <= 21){
                    System.out.println("2");
                    int batch = Integer.valueOf(id_part.substring(2, 3));
                    if(batch >= 1 && batch <= 3){
                        System.out.println("3");
                        int roll = Integer.valueOf(id_part.substring(3));
                        if(roll >= 001 && roll <= 999){
                            System.out.println("4");
                              if((mail_first.equals(mail_first_cse)) || (mail_first.equals(mail_first_eee)) ) {
                                  System.out.println("5");
                                    if (mail_second.equals(mail_domain)){
                                        System.out.println("6");
                                            System.out.println("Valid Email");
                                    }
                                    else System.out.println("Invalid ID");
                              }           
                              else System.out.println("Invalid ID");
                        }
                        else System.out.println("Invalid ID");
      
                    }
                    else System.out.println("Invalid ID");
  
            }
                else System.out.println("Invalid ID");
            
            
            
        }
        else {
            System.out.println("Invalid ID");

        }

    
    }
    static void password_method(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Password :");
        String password_str = input.nextLine();
        char[] char_pass = password_str.toCharArray();
        int validation=0; //0 for invalid and 1 for valid
        int len = password_str.length();
        
        char[] specials = {'+', '-', '_', '|', '!', '(', ')', '{', '}', '[', ']', '^',
            '~', '*', '?', ':','=','/'};
        int sp_len = specials.length;
        
        if(password_str.length() >= 8){
            
            validation=1;
            for (int i=0; i< len-1; i++){
                if(Character.isUpperCase(char_pass[i])){
                    validation=1;
                    break;
                
                }
                else validation=0;
                
            }
            
            if(validation ==1){
            for (int j=0; j<len-1; j++){
                if(Character.isLowerCase(char_pass[j])){
                    validation=1;
                    break;
                
                }
                else validation=0;
            
            
            }
            }
            
            if(validation ==1){
            for (int j=0; j<len-1; j++){
                if(Character.isDigit(char_pass[j])){
                    validation=1;
                    break;
                
                }
                else validation=0;
            
            
            }
            }
            
            if(validation ==1){
            
                if((password_str.contains("#")) || (password_str.contains("@")) || (password_str.contains("%")) || (password_str.contains("&"))){
                    validation=1;
                                    
                }
                else validation=0;
           
            }
            
            if(validation ==1){
            
                if( char_pass[len-1] == 'P' ){
                    validation=1;
                                    
                }
                else validation=0;
           
            }
            
            if(validation ==1){
                int count=0;
                for(int i=0; i<password_str.length();i++){
    
                    for(int j=0; j<specials.length;j++){
                                if(char_pass[i] == specials[j]){
                                   count++;
                                
                                }
  
                    }
    
                }
                if(count == 0)
                    validation=1;
                else
                    validation=0;
            }
            if(validation ==1){    
                if( char_pass[len-1] == 'P' ){
                    validation=1;
                                    
                }
                else validation=0;
           
            }
        
        
        
        }
        else System.out.println("Invalid Password");
        
        if(validation ==1)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    
    
    
    }
    static void number_method(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number :");
        String number_str = input.nextLine();
        
        char[] char_num = number_str.toCharArray();
        int len_c = char_num.length;
        int validate=1;
        
        for(int i=0; i<len_c; i++){
            if( Character.isLetter(char_num[i]) )
                validate=0;

        }
        
        if( validate == 1){
        if( (char_num[0] == '+' && char_num[1] != '-') || (char_num[0] == '-' && char_num[1] != '+') || (char_num[0] == '.' && char_num[1] != '+' && char_num[1] != '-' ) || (Character.isDigit(char_num[0])) ){
            
            if( char_num[len_c-1] != '.'  ){
                    System.out.println("Valid Number");
            
            }
            else
                System.out.println("Invalid Number");
        
        
        }
        else
            System.out.println("Invalid Number");
    
        }
        else 
            System.out.println("Invalid Number");
    
    }
    static void string_method(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String :");
        String string_str = input.nextLine();
        
        if( string_str.contains("UIU") ){
            
            String[] arrOfStr = string_str.split("UIU");
            String str1 = arrOfStr[1].substring(0,1);
            String str_rest = arrOfStr[1].substring(1);
            char[] char_str1 = str1.toCharArray();
            if( Character.isDigit(char_str1[0]) ){
                if( arrOfStr[0].equals(str_rest) ){
                    int len_1 = str_rest.length();
                    char[] char_str2 = str_rest.toCharArray();
                    int count=0;
                    for(int i=0; i<len_1; i++){
                        if( (Character.isLowerCase(char_str2[i])) && (Character.isLetter(char_str2[i])) ){
                            count++;
                        
                        }
                    
                    }
                    if( count == len_1)
                        System.out.println("Valid String");
                    else
                        System.out.println("Invalid String");
                
                
                }
                else
                    System.out.println("Invalid String");
            
            
            
            }
            else
                System.out.println("Invalid String");
        
        
        
        }
    else
            System.out.println("Invalid String");
    
    
    }

    public static void main(String[] args) {
                
        int choice;
        for(;;){
            
            System.out.println("Select 1 to validate UIU CSE ID");
            System.out.println("Select 2 to validate UIU CSE & EEE Email");
            System.out.println("Select 3 to validate Password");
            System.out.println("Select 4 to validate Number");
            System.out.println("Select 5 to validate String");
            System.out.println("Select 6 to Exit");
            System.out.print("Enter your choice: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            
            if(choice==1){
                id_method();
            
            }
            else if (choice==2){
                email_method();
          
            }
            else if (choice==3){
                password_method();
          
            }
            else if (choice==4){
                number_method();
          
            }
            else if (choice==5){
                string_method();
          
            }
            else if (choice==6){
                break;
          
            }
        
        
        
        }
            
        
        
    }
    
}
