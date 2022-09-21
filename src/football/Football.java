/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import java.util.*;

/**
 *
 * @author price
 */
public class Football {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSource source = new ScoreSource();
        Subcriber sub = new Subcriber();
        System.out.print("Regritant : ");
        int people = sc.nextInt();
        System.out.println();
        sc.nextLine();
        for(int i = 0; i < people ; i++){
            source.addSub(sub);
        }
        while (true){
        System.out.print("Enter Score ");
        String s = sc.nextLine();
        if (!s.equals("")) {
            source.setScoreLine(s);
        }
        else break;
         
        }        
    }
    
}
