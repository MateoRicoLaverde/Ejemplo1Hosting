package Entities;

import Entities.Rol;
import Entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T20:34:30")
@StaticMetamodel(UsuarioRol.class)
public class UsuarioRol_ { 

    public static volatile SingularAttribute<UsuarioRol, Integer> codUtr;
    public static volatile SingularAttribute<UsuarioRol, Usuario> ndocUsu;
    public static volatile SingularAttribute<UsuarioRol, Rol> codRol;

}