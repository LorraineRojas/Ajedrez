/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Estudiante
 */
public class Torre extends Ficha {
   
    public Torre(int x, int y, char color) {
        super('r',x, y, color);
       
    }

    @Override
    public void moverFicha(int x, int y) {
        if ((x > 0 && x < 9) && (y > 0 && y< 9)) {
            if ((x == super.getX()&& y!= super.getY())||(x != super.getX()&& y== super.getY())){
                super.setPosicion(x, y);
            }
        }
    }
}
