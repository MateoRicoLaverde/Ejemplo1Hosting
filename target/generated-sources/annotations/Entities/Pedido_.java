package Entities;

import Entities.DetallePedido;
import Entities.EstadoPedido;
import Entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> numPedido;
    public static volatile SingularAttribute<Pedido, Date> fecha;
    public static volatile SingularAttribute<Pedido, Usuario> ndocClient;
    public static volatile SingularAttribute<Pedido, EstadoPedido> codEstPedido;
    public static volatile SingularAttribute<Pedido, String> dirEnvio;
    public static volatile CollectionAttribute<Pedido, DetallePedido> detallePedidoCollection;

}