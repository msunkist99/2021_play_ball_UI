package org.launchcode.play_ball_UI.models;

import javax.persistence.*;

@Entity
@NamedStoredProcedureQuery(name= "get-lookup-data", procedureName= "play_ball.GetLookupData")

public class Lookup {
    @Id
    private String data_type;
    private String data_code;
    private String data_text;

    // no argument constructor, required for Hibernate to create an object.
    public Lookup(){ }
}
