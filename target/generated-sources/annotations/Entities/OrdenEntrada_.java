package Entities;

import Entities.Cartera;
import Entities.DetalleEntrada;
import Entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(OrdenEntrada.class)
public class OrdenEntrada_ { 

    public static volatile CollectionAttribute<OrdenEntrada, Cartera> carteraCollection;
    public static volatile SingularAttribute<OrdenEntrada, String> numFactura;
    public static volatile SingularAttribute<OrdenEntrada, Integer> numOrdEnt;
    public static volatile SingularAttribute<OrdenEntrada, Usuario> ndocProveedor;
    public static volatile CollectionAttribute<OrdenEntrada, DetalleEntrada> detalleEntradaCollection;
    public static volatile SingularAttribute<OrdenEntrada, Date> fecFtura;

}