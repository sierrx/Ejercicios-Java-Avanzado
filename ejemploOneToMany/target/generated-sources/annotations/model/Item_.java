package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Carrito;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-30T19:42:00", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, String> nombreItem;
    public static volatile SingularAttribute<Item, Long> id;
    public static volatile SingularAttribute<Item, Carrito> carrito;

}