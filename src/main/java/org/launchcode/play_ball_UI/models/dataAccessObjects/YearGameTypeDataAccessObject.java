package org.launchcode.play_ball_UI.models.dataAccessObjects;

import org.launchcode.play_ball_UI.models.YearGameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class YearGameTypeDataAccessObject {

    @Autowired
    private EntityManager entityManager;

    public Iterable<YearGameType> getYearGameTypesData(int gameYear) {

        List<Object[]> objectList = entityManager.createNamedStoredProcedureQuery("get-year-game-type-data")
                .setParameter("game_year", gameYear)
                .getResultList();

        List<YearGameType> yearGameTypes = new ArrayList<>();

        for (Object[] row : objectList) {
            YearGameType yearGameType = new YearGameType();

            yearGameType.setGameType((Character) row[0]);
            yearGameType.setGameYear((Integer) row[1]);
            yearGameType.setGameTypeText(row[2].toString());

            yearGameTypes.add(yearGameType);
        }

        return yearGameTypes;
    }
}
