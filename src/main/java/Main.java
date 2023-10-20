
import controller.InputStringManager;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
     public static void main(String[] args) {
        String title = "===== Analysis String program ====";
        String[] s = new String[]{"Input String", "Exit"};
        Menu<String> menu = new InputStringManager(title, s);
        menu.run();
    }
}
