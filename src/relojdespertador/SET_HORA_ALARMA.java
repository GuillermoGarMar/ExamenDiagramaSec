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
public class SET_HORA_ALARMA {

    int hora, minutos;
    Increment in = new Increment();
    public SET_HORA_ALARMA() {
    }

    public SET_HORA_ALARMA(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }
    //pone la hora y la incrementa
    public int setHORA() {
        System.out.print("Incrementar hora?");
        hora = in.IncrementH(hora);
        return hora;
    }
    //pone los minutos y la incrementa
    public int setMIN() {
        System.out.print("Incrementar minutos?");
        minutos = in.IncrementM(minutos);
        return minutos;
    }
    //devuelve el toString para mostrar
    @Override
    public String toString() {
        return "SET_HORA_ALARMA{" + "hora=" + hora + ", minutos=" + minutos + '}';
    }

}
