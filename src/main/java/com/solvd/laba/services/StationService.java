package com.solvd.laba.services;

import com.solvd.laba.dao.jdbcMySQLimpl.BusDAO;
import com.solvd.laba.dao.jdbcMySQLimpl.StationDAO;
import com.solvd.laba.model.Station;

public class StationService {
    public Station getStationById(int id) {

        StationDAO stationDAO = new StationDAO();
        Station station = stationDAO.getEntityById(id);
        BusDAO busDAO = new BusDAO();
        station.setBuses(busDAO.getAllBusesByStationId(id));
        return station;
    }
}