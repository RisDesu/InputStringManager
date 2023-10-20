/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.InputStringList;
import view.Menu;
/**
 *
 * @author HP
 */
public class InputStringManager extends Menu<String>{
    private InputStringList list= new InputStringList();
    public InputStringManager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
           
            case 1:
                list.getNumber("321sdhkjDFGH!@#$%^22fdsf3");
                list.getCharacter("321sdhkjDFGH!@#$%^22fdsf3");
                break;

            case 2:
                System.exit(0);        
        }
    }
}
