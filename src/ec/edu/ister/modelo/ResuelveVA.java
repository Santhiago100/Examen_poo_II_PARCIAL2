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
public class ResuelveVA {

/**
*	Resuelve el problema de la posibilidad de realizar un conjunto
*	de pedidos sin superar los límites de contaminación. Utiliza
*	un algoritmo basado en "Vuelta Atrás"
*	@param pedidos conjunto de pedidos a fabricar
*	@return null si no es posible fabricar los pedidos sin superar
*	los límites de contaminación o un orden de realización de los
*	pedidos que permite realizarles sin superar los límites
*/
public static Pedido[] resuelve(Pedido[] pedidos) {

// solución inicial vacía (sin ningún pedido incluido) 
SolParcial sol = new SolParcial(pedidos);

// primera llamada al algoritmo recursivo
boolean encontradaSolución = resuelveRec(pedidos, sol);

if (encontradaSolución)
return sol.ordenDeFabricación(); else
return null;
}


/**
*	Algoritmo recursivo basado en vuelta atrás que resuelve el
*	problema de la contaminación de un conjunto de pedidos
*	@param pedidos conjunto de pedidos a fabricar
*	@param sol solución parcial compuesta por un conjunto de
*	pedidos que no superan los límites de contaminación
*	@return true si ha encontrado la solución. En ese caso sol
*	será la solución al problema (incluye todos los pedidos sin
*	superar los límites de contaminación). Retorna false si no se
*	ha encontrado solución.
*/
 
private static boolean resuelveRec(Pedido[] pedidos,SolParcial sol) {
// finaliza si la solución ya contiene todos los pedidos 
if (sol.numPedidosIncluidos() == pedidos.length) {
// solución encontrada: finaliza 
return true;

}

// prueba añadiendo cada uno de los pedidos 
for(Pedido p: pedidos) {

// si el pedido ya está incluido en la solución parcial o su
// inclusión hace que la solución no sea factible, pasa al
// siguiente pedido
if (sol.pedidoIncluido(p) || !sol.factible(p)) continue; // posibilidad de ramificación no válida

// añade el pedido a la solución y realiza la llamada
// recursiva sol.añadePedido(p);
boolean encontradaSolución = resuelveRec(pedidos, sol);

// finaliza si ha encontrado la solución if (encontradaSolución)
return true;

// si con el último pedido añadido no ha encontrado la
// solución, le saca y prueba con el siguiente sol.eliminaPedido(p);
}

return false; // solución no encontrada
}
}
   

