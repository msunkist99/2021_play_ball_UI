package org.launchcode.play_ball_UI.models.dataAccessObjects;

import org.launchcode.play_ball_UI.models.GamePlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class LookupDataAccessObject {

    public static Map<String, String> getLookupData(EntityManager entityManager) {

        List<Object[]> objectList = entityManager.createNamedStoredProcedureQuery("get-lookup-data")
                .getResultList();

        Map<String, String> lookupData = new HashMap<>();

        for (Object[] row : objectList) {
            lookupData.put(row[0].toString() + row[1].toString(), row[2].toString());
        }

        return lookupData;
    }
}
