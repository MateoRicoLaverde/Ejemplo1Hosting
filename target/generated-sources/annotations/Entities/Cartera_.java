package Entities;

import Entities.OrdenEntrada;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(Cartera.class)
public class Cartera_ { 

    public static volatile SingularAttribute<Cartera, Integer> codCartera;
    public static volatile SingularAttribute<Cartera, Date> fecIni;
    public static volatile SingularAttribute<Cartera, Date> fecFin;
    public static volatile SingularAttribute<Cartera, Short> estadoPago;
    public static volatile SingularAttribute<Cartera, OrdenEntrada> numOrdenCartera;

}