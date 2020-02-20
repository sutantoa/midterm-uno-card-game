/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author MANDA
 */
public class UserNameValidator {
    
    public static boolean checkName(String name){
        boolean check = false;
        if (name.length() > 0)
            check = true;
        return check;
    }
    
}
