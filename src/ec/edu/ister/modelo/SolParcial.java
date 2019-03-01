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
public class SolParcial {
    public SolParcial(Pedido[] pedidos)
    {}
/*Construye una solución parcial vacía (sin ningún pedido incluido) Parameters:
pedidos - pedidos que tiene la empresa*/


public boolean factible(Pedido pedido)
{
return factible(pedido);
}
/*
Indica si la solución parcial sigue siendo factible (no supera los límites de contaminación en el intervalo de control) si se le añade el pedido indicado

Parameters:
pedido - pedido a añadir a la solución actual Returns:
true si se puede añadir el pedido sin superar los límites de contaminación y false en caso contrario
*/

public void añadePedido(Pedido pedido)
{}
/*
Añade el pedido a la solución parcial Parameters:
pedido - pedido a añadir*/


public void eliminaPedido(Pedido pedido)
{}
/*
Elimina el pedido de la solución actual Parameters:
pedido - pedido a eliminar*/


public boolean pedidoIncluido(Pedido pedido)
{
return pedidoIncluido(pedido);
}
/*
Indica si el pedido está ya incluido en la solución parcial Parameters:
pedido - pedido a comprobar si está incluido Returns:
true si el pedido ya está incluido en la solución parcial y false en caso contrario*/


public int numPedidosIncluidos()
{
return numPedidosIncluidos();
}
/*
Retorna el número de pedidos incluidos en la solución parcial*/
public Pedido[] ordenDeFabricación()
{
return ordenDeFabricación();
}
/*Retorna un array con los pedidos incluidos en la solución parcial en el orden en el que fueron añadidos

Returns:
array con los pedidos incluidos en la solución parcial en el orden en el que fueron añadidos
*/

}
