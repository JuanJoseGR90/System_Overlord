package com.spring.project.pruebas.di.service;

import org.springframework.stereotype.Service;

@Service
public class SolarSystemImplService implements SolarSystemService {

    private String planetaTierra = "El planeta Tierra, el tercer cuerpo celeste desde el Sol en nuestro sistema solar, " +
            "es el único mundo conocido que alberga vida. Con una superficie cubierta en su mayoría por agua, se destaca" +
            " por su diversidad biológica y su atmósfera rica en oxígeno. A lo largo de su vasta historia, " +
            "ha experimentado cambios geológicos, climáticos y biológicos significativos. Además de ser el hogar de " +
            "millones de especies, incluida la humanidad, la Tierra es un objeto de estudio para científicos que buscan " +
            "comprender su compleja historia, su funcionamiento y su futuro en el vasto cosmos. Su fragilidad y su " +
            "belleza incomparable nos recuerdan la importancia de cuidar y proteger nuestro único hogar en el universo.";

    private String marte = "Marte, el cuarto planeta en orden de distancia desde el Sol, ha fascinado a la humanidad durante siglos " +
            "con su color rojo intenso y su potencial para albergar vida. Con una superficie caracterizada por vastas " +
            "llanuras, altas montañas y profundos cañones, Marte ha sido objeto de exploración tanto por parte de " +
            "sondas espaciales como de misiones robóticas. Aunque ahora se sabe que su atmósfera es delgada y su " +
            "clima extremo, los científicos han descubierto evidencia de agua pasada en su superficie, lo que " +
            "alimenta la esperanza de que alguna vez pudo haber albergado formas de vida. Con un futuro que incluye " +
            "misiones tripuladas y la posibilidad de establecer bases humanas en suelo marciano, Marte sigue siendo " +
            "un misterio por descubrir y un símbolo de la exploración espacial y la búsqueda de nuestros orígenes " +
            "en el vasto cosmos";

    @Override
    public String earth() {
        return planetaTierra;
    }

    @Override
    public String mars() {
        return marte;
    }
}
