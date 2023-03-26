package Entities;

import Entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(TipoDoc.class)
public class TipoDoc_ { 

    public static volatile SingularAttribute<TipoDoc, String> codTdoc;
    public static volatile SingularAttribute<TipoDoc, String> tipoDoc;
    public static volatile CollectionAttribute<TipoDoc, Usuario> usuarioCollection;

}