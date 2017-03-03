package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Actas;
import jpa.Compromisos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-02T19:43:55")
@StaticMetamodel(Personas.class)
public class Personas_ { 

    public static volatile SingularAttribute<Personas, String> codigo;
    public static volatile ListAttribute<Personas, Actas> actasList;
    public static volatile SingularAttribute<Personas, String> apellido;
    public static volatile SingularAttribute<Personas, String> correo;
    public static volatile ListAttribute<Personas, Compromisos> compromisosList;
    public static volatile SingularAttribute<Personas, Integer> id;
    public static volatile SingularAttribute<Personas, String> nombre;

}