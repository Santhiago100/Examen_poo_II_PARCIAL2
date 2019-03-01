/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;
import java.util.Arrays;

/**
 * PROGRAMACION ORIENTADA A OBJETOS II
 * Santiago Columba
 * Sexto Sistemas
 */
public class ResuleveHeuristico {
    /**
*	Heurístico que busca el mayor número de pedidos que es
*	posible realizar sin superar los límites de contaminación.
*	El criterio de selección utilizado consiste en ir eligiendo
*	los pedidos de menor a mayor contaminación por día.
*	No siempre encuentra la solución óptima.
 
*	@param pedidos conjunto de pedidos a fabricar
*	@return orden de realización de pedios encontrado
*/
public static Pedido[] resuelve(Pedido[] pedidos) { 
    SolParcial sol = new SolParcial(pedidos);

// ordena el array de pedidos de menor a mayor contaminación
// por día 
Arrays.sort(pedidos);

// va metiendo pedios a la solución hasta que no se
// puedan meter más 
for(Pedido p: pedidos) {
if (!sol.factible(p)) {
// no se pueden seguir metiendo pedidos 
return sol.ordenDeFabricación();
}

// añade el pedido y pasa al siguiente 
sol.añadePedido(p);

}
// retorna el mejor orden de fabricación encontrado 
return sol.ordenDeFabricación();
}
}

    

