package Entities;

import Entities.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(EstadoPedido.class)
public class EstadoPedido_ { 

    public static volatile SingularAttribute<EstadoPedido, String> nomEstado;
    public static volatile CollectionAttribute<EstadoPedido, Pedido> pedidoCollection;
    public static volatile SingularAttribute<EstadoPedido, String> codEstado;

}