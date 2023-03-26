package Entities;

import Entities.OrdenEntrada;
import Entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(DetalleEntrada.class)
public class DetalleEntrada_ { 

    public static volatile SingularAttribute<DetalleEntrada, Integer> idDetEnt;
    public static volatile SingularAttribute<DetalleEntrada, Producto> codProdEntrada;
    public static volatile SingularAttribute<DetalleEntrada, Integer> cantidad;
    public static volatile SingularAttribute<DetalleEntrada, OrdenEntrada> numOrdent;

}