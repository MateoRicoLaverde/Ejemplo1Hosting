package Entities;

import Entities.Pedido;
import Entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(DetallePedido.class)
public class DetallePedido_ { 

    public static volatile SingularAttribute<DetallePedido, Pedido> numPedido;
    public static volatile SingularAttribute<DetallePedido, Integer> codDetPed;
    public static volatile SingularAttribute<DetallePedido, Producto> codProd;
    public static volatile SingularAttribute<DetallePedido, Integer> cantidad;

}