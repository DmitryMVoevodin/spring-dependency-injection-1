package com.netcracker.spring.task2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Harbor {

    private List<ShipI> shipList;
    private Set<ShipI> shipSet;
    private Map<Integer, ShipI> shipMap;

    public Harbor() {
        //
    }

    public Harbor(List<ShipI> shipList, Set<ShipI> shipSet, Map<Integer, ShipI> shipMap) {
        this.shipList = shipList;
        this.shipSet = shipSet;
        this.shipMap = shipMap;
    }

    public void setShipList(List<ShipI> shipList) {
        this.shipList = shipList;
    }

    public void setShipSet(Set<ShipI> shipSet) {
        this.shipSet = shipSet;
    }

    public void setShipMap(Map<Integer, ShipI> shipMap) {
        this.shipMap = shipMap;
    }

    @Override
    public String toString() {
        String s = "List = { ";
        for(ShipI sh : shipList) s += sh + " ";
        s += "}\nSet = { ";
        for(ShipI sh : shipSet) s += sh + " ";
        s += "}\nMap = { ";
        Iterator<Map.Entry<Integer, ShipI>> itr = shipMap.entrySet().iterator();
        while (itr.hasNext()) s += itr.next() + " ";
        s += "}";
        return s;
    }

}