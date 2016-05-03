/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathcalc;


import java.util.ArrayList;

/**
 *
 * @author mrobert
 */
public class Primes
{
public static void main(String[] args)
{
    int nValues = 50;
    ArrayList<Integer> primeNum = new ArrayList<>();
    for(int i = 2; i <= nValues; i++)
    {
        for(int j = 2; j < i ; j++){
            
            if(i % j == 0)
                continue;
            
            
            if(primeNum.contains(j))
                continue;
            
            primeNum.add(j);
            
            
              
            
        }
   
    }
    
    

    for(int k = 0 ; k < primeNum.size(); k++)
        {
        System.out.println(primeNum.get(k));
        }

    }
} 
