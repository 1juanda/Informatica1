/*
JUAN DAVID CORONADO DUSSAN
JOHANA PAOLA RINCON JUEZ
CARLOS GIOVANNI HURTADO G
 */
package colisiones;

import colisiones.objetos.Rectangulo;
import static java.awt.geom.Path2D.intersects;
import java.util.Scanner;

public class Colisiones {

    public static void main(String[] args) {
        // TODO code application logic here

        Rectangulo rectangulo1 = new Rectangulo(0, 0, 0, 0);
        Rectangulo rectangulo2 = new Rectangulo(0, 0, 0, 0);
        String xCarro1, yCarro1, anchoCarro1, altoCarro1;
        String xCarro2, yCarro2, anchoCarro2, altoCarro2;

        Scanner valores = new Scanner(System.in);
        System.out.println("Ingrese el valor en la posicion x del rectagulo 1");
        xCarro1 = valores.nextLine();
        System.out.println("Ingrese el valor en la posicion y del rectagulo 1");
        yCarro1 = valores.nextLine();
        System.out.println("Ingrese el valor del ancho del rectagulo 1");
        anchoCarro1 = valores.nextLine();
        System.out.println("Ingrese el valor del alto del rectagulo 1");
        altoCarro1 = valores.nextLine();
        System.out.println("Ingrese el valor en la posicion x del rectagulo 2");
        xCarro2 = valores.nextLine();
        System.out.println("Ingrese el valor en la posicion y del rectagulo 2");
        yCarro2 = valores.nextLine();
        System.out.println("Ingrese el valor del ancho del rectagulo 2");
        anchoCarro2 = valores.nextLine();
        System.out.println("Ingrese el valor del alto del rectagulo 2");
        altoCarro2 = valores.nextLine();

        //Definimos rectangulo 1
        rectangulo1.setX(Integer.parseInt(xCarro1));
        rectangulo1.setY(Integer.parseInt(yCarro1));
        rectangulo1.setAncho(Integer.parseInt(anchoCarro1));
        rectangulo1.setAlto(Integer.parseInt(altoCarro1));
        //Definimos rectangulo 2
        rectangulo2.setX(Integer.parseInt(xCarro2));
        rectangulo2.setY(Integer.parseInt(yCarro2));
        rectangulo2.setAncho(Integer.parseInt(anchoCarro2));
        rectangulo2.setAlto(Integer.parseInt(altoCarro2));

        if (rectangulo1.getX() - rectangulo2.getAncho() <= rectangulo2.getX() && rectangulo1.getX() + rectangulo1.getAncho() >= rectangulo2.getX()
                && rectangulo1.getY() - rectangulo2.getAlto() <= rectangulo2.getY() && rectangulo1.getY() + rectangulo1.getAlto() >= rectangulo2.getY()) {
            System.out.println("Los dos objetos colisionan");
        } else {
            System.out.println("Los dos objetos no colisionan");
        }

    }

}
