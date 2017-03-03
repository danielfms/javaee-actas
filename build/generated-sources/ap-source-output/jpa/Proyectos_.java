package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Actas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-02T19:43:55")
@StaticMetamodel(Proyectos.class)
public class Proyectos_ { 

    public static volatile SingularAttribute<Proyectos, String> descripcion;
    public static volatile SingularAttribute<Proyectos, String> codigo;
    public static volatile ListAttribute<Proyectos, Actas> actasList;
    public static volatile SingularAttribute<Proyectos, Integer> id;
    public static volatile SingularAttribute<Proyectos, String> nombre;

}