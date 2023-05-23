package telcel.appfacturas;

import telcel.appfacturas.modelo.Cliente;
import telcel.appfacturas.modelo.Factura;
import telcel.appfacturas.modelo.ItemFactura;
import telcel.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String args[]){
        Cliente cliente = new Cliente();
        cliente.setRfc("MSM060jjjjggg08");
        cliente.setNombre("Pedro");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura");
        String desc  = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i= 0; i<5; i++){
            producto =new Producto();
            System.out.println("Ingrese producto n " + producto.getCodigo()+ " : " );
            nombre = s.next();
            producto.setNombre(nombre);
            System.out.print("Ingrese el precio: ");
            precio = (float) s.nextFloat();
            producto.setPrecion(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();

        }

        System.out.println(factura.generarDetalle());


    }
}
