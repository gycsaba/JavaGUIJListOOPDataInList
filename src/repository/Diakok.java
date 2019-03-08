/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import modell.Diak;

/**
 *
 * @author gycsaba
 */
public class Diakok {
    
    List <Diak> diakok;
    
    public Diakok() {
        DiakTestAdatok dta=new DiakTestAdatok();
        diakok=dta.getTestAdatok();
    }
            
    
}
