package org.launchcode.play_ball_UI.models.dataAccessObjects;

import org.launchcode.play_ball_UI.models.Year;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class YearDataAccessObject {
    @Autowired
    private EntityManager entityManager;

    public Iterable<Year> getYearsData() {

        List<Integer> objectList = entityManager.createNamedStoredProcedureQuery("get-year-data")
                .getResultList();

        List<Year> years = new ArrayList<>();

        for (Integer row : objectList) {
            Year year = new Year();
            year.setGameYear(row);
            years.add(year);
        }

        return years;
    }
}
