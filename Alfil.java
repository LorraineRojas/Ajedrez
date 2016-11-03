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
public class Alfil extends Ficha {

    public Alfil(char ficha, int x, int y, char color) {
        super('b', x, y, color);
    }

    @Override
    public void moverFicha(int x, int y) {
        if ((x > 0 && x < 10) && (y > 0 && y < 10)) {
            for (int i = 0; i < 9; i++) {
                if ((((x==super.getX()+i)&&(y==super.getY()-i))||((x==super.getX()+i)&&(y== super.getY()+i)))||(((x==super.getX()-i)&&(y==super.getY()+i))||((x==super.getX()-i)&&(y== super.getY()-i)))){
                super.setPosicion(x, y);
            }
                
            }
            
        }

    }

}
