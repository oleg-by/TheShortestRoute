package com.solvd.laba.dao;

import com.solvd.laba.model.Route;
import java.util.List;

public interface IRouteDAO extends IBaseDAO<Route> {
    void showAllRoutes();

    void removeEntity(int id);

    List<Route> getAllRoutes();

    List<Route> getAllNeighborsById(int id);

}
