package Entities;

import Entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(UnidadMedida.class)
public class UnidadMedida_ { 

    public static volatile SingularAttribute<UnidadMedida, String> descripcion;
    public static volatile SingularAttribute<UnidadMedida, Integer> codUnimed;
    public static volatile CollectionAttribute<UnidadMedida, Producto> productoCollection;
    public static volatile SingularAttribute<UnidadMedida, String> nombreUnidadMedida;

}