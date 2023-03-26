package Entities;

import Entities.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Short> estado;
    public static volatile SingularAttribute<Inventario, Integer> codInv;
    public static volatile SingularAttribute<Inventario, Date> fecSalida;
    public static volatile SingularAttribute<Inventario, Producto> codProducInv;
    public static volatile SingularAttribute<Inventario, Date> fecIngreso;
    public static volatile SingularAttribute<Inventario, String> cantidad;

}