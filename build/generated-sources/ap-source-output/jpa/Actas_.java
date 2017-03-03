package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Compromisos;
import jpa.Personas;
import jpa.Proyectos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-02T19:43:55")
@StaticMetamodel(Actas.class)
public class Actas_ { 

    public static volatile SingularAttribute<Actas, String> descripcion;
    public static volatile SingularAttribute<Actas, Date> fecha;
    public static volatile SingularAttribute<Actas, Proyectos> proyectoId;
    public static volatile ListAttribute<Actas, Personas> personasList;
    public static volatile SingularAttribute<Actas, String> lugar;
    public static volatile SingularAttribute<Actas, Date> proximaReunion;
    public static volatile ListAttribute<Actas, Compromisos> compromisosList;
    public static volatile SingularAttribute<Actas, Integer> id;

}