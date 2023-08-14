package org.mql.location.exemple;

import org.mql.location.business.LocationService;
import org.mql.location.business.LocationServiceDefault;
import org.mql.location.models.Car;

public class Exemple {
    private LocationService services;

    public Exemple() {
        services = new LocationServiceDefault();
        exp01();
    }

    private void exp01() {
        if (services != null) { // Ajouter cette condition pour vérifier si services est initialisé
            Car c = new Car("ar25kh", "mac", "2001", "red", "200dh", "mac.jsp", 5);
            Car c1 = new Car("ar284", "pool", "2004", "bleu", "207dh", "mas.jsp", 5);
            Car c2 = new Car("agk12h", "hdsl", "2012", "blac", "250dh", "pgac.jsp", 6);
            services.saveCar(c);
            services.saveCar(c1);
            services.saveCar(c2);
        } else {
            System.out.println("LocationService n'a pas été initialisé correctement.");
        }
    }

    public static void main(String[] args) {
        new Exemple();
    }
}
