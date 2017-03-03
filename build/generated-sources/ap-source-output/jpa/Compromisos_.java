package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Actas;
import jpa.Personas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-02T19:43:55")
@StaticMetamodel(Compromisos.class)
public class Compromisos_ { 

    public static volatile SingularAttribute<Compromisos, Personas> responsable;
    public static volatile SingularAttribute<Compromisos, Actas> actaId;
    public static volatile SingularAttribute<Compromisos, Date> fechaEntrega;
    public static volatile SingularAttribute<Compromisos, Integer> id;
    public static volatile SingularAttribute<Compromisos, String> actividad;

}