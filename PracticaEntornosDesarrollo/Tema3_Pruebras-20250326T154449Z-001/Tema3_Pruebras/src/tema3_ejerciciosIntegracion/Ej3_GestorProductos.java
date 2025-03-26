package tema3_ejerciciosIntegracion;

public class Ej3_GestorProductos {
    private Ej3_BaseDeDatosProductos baseDeDatos;

    public Ej3_GestorProductos(Ej3_BaseDeDatosProductos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public boolean registrarProducto(String producto) {//El error estaba en que el metodo no regresa nada estaba en void
        if (producto == null || producto.isEmpty()) {
            System.out.println("El producto no puede estar vacío");
            return false;//Al tener que regresar un booleano le ponemos false si no contiene un producto
        }
        baseDeDatos.agregarProducto(producto);
		return true; // Y true si lo contiene
    }	

    public boolean productoRegistrado(String producto) {
        return baseDeDatos.verificarProducto(producto);  
    }
}
