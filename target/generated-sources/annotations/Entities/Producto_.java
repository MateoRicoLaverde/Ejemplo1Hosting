package Entities;

import Entities.Categoria;
import Entities.DetalleEntrada;
import Entities.DetallePedido;
import Entities.Inventario;
import Entities.UnidadMedida;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripción;
    public static volatile SingularAttribute<Producto, Integer> codProd;
    public static volatile SingularAttribute<Producto, UnidadMedida> codUnimed;
    public static volatile SingularAttribute<Producto, Categoria> codCategoria;
    public static volatile CollectionAttribute<Producto, DetallePedido> detallePedidoCollection;
    public static volatile CollectionAttribute<Producto, Inventario> inventarioCollection;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile CollectionAttribute<Producto, DetalleEntrada> detalleEntradaCollection;

}