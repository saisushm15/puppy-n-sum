/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puppy.sum;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class PuppySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int sum=0;
        while(t>0)
        {
            int d=input.nextInt();
            int n=input.nextInt();
            
            for(int i=0;i<d;i++)
            {
                sum=n*(n+1)/2;
                n=sum;
            }
            System.out.println(sum);
        }
        t--;        
    }
    
}
