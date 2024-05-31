package com.spring.project.pruebas.service;

import org.springframework.stereotype.Service;

@Service
public class SolarSystemImplService implements SolarSystemService {

    private String planetaTierra = "El planeta Tierra, el tercer cuerpo celeste desde el Sol en nuestro sistema solar, " +
            "es el único mundo conocido que alberga vida. Con una superficie cubierta en su mayoría por agua, " +
            "se destaca por su diversidad biológica y su atmósfera rica en oxígeno. A lo largo de su vasta historia, " +
            "ha experimentado cambios geológicos, climáticos y biológicos significativos. Además de ser el hogar de millones" +
            " de especies, incluida la humanidad, la Tierra es un objeto de estudio para científicos que buscan comprender " +
            "su compleja historia, su funcionamiento y su futuro en el vasto cosmos. Su fragilidad y su belleza incomparable" +
            " nos recuerdan la importancia de cuidar y proteger nuestro único hogar en el universo.";

    @Override
    public String earth() {
        return planetaTierra;
    }
}
