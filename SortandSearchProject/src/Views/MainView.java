/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

/**
 *
 * @author quoch
 */
public class MainView {
    public static void main(String[] args) {
        String title = "\n========SEARCH SORT PROGRAM=======\n";
        String[] options = {
            "Enter a new array",
            "Random a array",
            "Sort a array by bubble sort",
            "Sort a array by quick sort",
            "Search a position of value with linear search",
            "Search a position of value with binary search"
        };
        MenuView menu = new MenuView(title, options);
        menu.run();
    }
}
