/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

/**
 *
 * @author ggarciamartinez
 */
public class Increment {

    public Increment() {
    }
    public int IncrementH(int hor){
        hor++;
        System.out.print("incrementando hora");
        return hor;
    }
    public int IncrementM(int min){
        min++;
        System.out.print("incrementando minutos");
        return min;
    }
}
