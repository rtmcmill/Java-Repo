/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharacters;

/**
 *
 * @author mrobert
 */
public class StringCharacters
{
    public static void main(String[] args)
    {
    String text = "To be or not to be, that is the question;"
    +"Whether `tis nobler in the mind to suffer"
    +" the slings and arrows of outrageous fortune,"
    +" or to take arms against a sea of troubles,"
    +" and by opposing end them?";
    int spaces = 0,
    vowels = 0,
    letters = 0;
    
    for(int i = 0 ; i < text.length(); i++){
        switch(text.charAt(i)){
            case 'a': vowels++;
            case 'e': vowels++;
            case 'i': vowels++;
            case 'o': vowels++;
            case 'u': vowels++;
            case ' ': spaces++;
            case '.': 
            case '?': 
            case ',':
            case '`':
            default : letters++;
        }
    }
          
    
    
    System.out.println("The text contained vowels: " + vowels);
    System.out.println("consonants :" + letters);
    System.out.println("spaces: " + spaces);
    }
}
   