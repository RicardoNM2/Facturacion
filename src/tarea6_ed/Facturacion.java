
package tarea6_ed;


public class Facturacion {
     public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>CANTIDAD_PRODUCTOS_PARA_DESCUENTO)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*0.8;
            consolaSalida(Total);
        }else {
            Total = precioProducto*0.95;
            consolaSalida(Total);
        }   

    }
    public static final int CANTIDAD_PRODUCTOS_PARA_DESCUENTO = 3;

    private void consolaSalida(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}
    
