/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 * PROGRAMACION ORIENTADA A OBJETOS II
 * Santiago Columba
 * Sexto Sistemas
 */
/**
* Pedido realizado a la fábrica
*/
public class Pedido implements Comparable<Pedido> {

/**
* Días necesarios para producir el pedido
*/
private int díasProducción;

/**
* Contaminación producida en la fabricación del pedido
*/
private double contaminación;

/**
*	Crea un pedido
*	@param díasProducción días necesarios para producir el pedido
*	@param contaminación contaminación producida en la fabricación
*	del pedido
*/
public Pedido(int díasProducción, double contaminación) { this.díasProducción = díasProducción; this.contaminación = contaminación;
}

/**
*	Retorna los días necesarios para producir el pedido
*	@return días necesarios para producir el pedido
*/
public int díasProducción() {
return díasProducción;
}

/**
*	Retorna la contaminación producida en la fabricación del
*	pedido
*	@return contaminación producida en la fabricación del pedido
*/
public double contaminaciónTotal() {
return contaminación;
}
/**
*	Compara los pedidos en base a su contaminación por día
*	@param pedido objeto a comparar con el actual
*/ @Override
public int compareTo(Pedido p) {
return (int)(contaminación/díasProducción
- p.contaminación/p.díasProducción);
}

}

