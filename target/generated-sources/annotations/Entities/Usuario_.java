package Entities;

import Entities.OrdenEntrada;
import Entities.Pedido;
import Entities.TipoDoc;
import Entities.UsuarioRol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> rs;
    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, String> pnom;
    public static volatile SingularAttribute<Usuario, String> numDoc;
    public static volatile SingularAttribute<Usuario, String> snom;
    public static volatile SingularAttribute<Usuario, TipoDoc> tipoDocumento;
    public static volatile SingularAttribute<Usuario, String> pape;
    public static volatile CollectionAttribute<Usuario, OrdenEntrada> ordenEntradaCollection;
    public static volatile SingularAttribute<Usuario, String> sape;
    public static volatile CollectionAttribute<Usuario, UsuarioRol> usuarioRolCollection;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> tel;
    public static volatile CollectionAttribute<Usuario, Pedido> pedidoCollection;

}