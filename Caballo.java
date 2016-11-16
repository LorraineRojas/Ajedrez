package Data;

/**
 *
 * @author Lisseth
 */
public class Caballo extends Ficha {

    public Caballo(int x, int y, char color) {
        super('c', x, y, color);
    }

    @Override
    public void moverFicha(int x, int y) {
        if ((x < 1) || (x > 8) || (y < 1) || (y > 8)||(super.getX() == 0)){
            System.out.println("error se sale del tablero");
          }else if((x == super.getX())&&(y == super.getY())){
            System.out.println("no se puede mover a la misma posicion");
        }else if(x == super.getX()+2&&y==super.getY()+1||y==super.getY()-1){
            
            super.setPosicion(x, y);
        }
        else if(x == super.getX()-2&&y==super.getY()+1||y==super.getY()-1){
            
            super.setPosicion(x, y);
        }
        else if(y == super.getY()-2&&x==super.getX()+1||x==super.getX()-1){
            
            super.setPosicion(x, y);
        }
        
        else if(y == super.getY()+2&&x==super.getX()+1||x==super.getX()-1){
            
            super.setPosicion(x, y);
        }
        else {
            System.out.println("error");
        }
    }

}
