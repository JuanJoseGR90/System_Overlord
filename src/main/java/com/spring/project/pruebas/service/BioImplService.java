package com.spring.project.pruebas.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class BioImplService implements SolarSystemService {

    String bioEarth = "Biodiversidad en la Tierra:\n" +
            "La biodiversidad en la Tierra es asombrosamente variada y compleja, abarcando desde las profundidades abisales del océano hasta las cimas de las montañas más altas. Este amplio espectro de vida incluye una asombrosa variedad de organismos, desde diminutas bacterias hasta majestuosos mamíferos y gigantescos árboles. Los ecosistemas terrestres, acuáticos y aéreos albergan una interconexión de formas de vida, cada una desempeñando un papel crucial en el equilibrio y la estabilidad de los sistemas naturales. La biodiversidad no solo proporciona beneficios ecológicos indispensables, como la purificación del aire y del agua, sino que también es fuente de inspiración, medicinas y alimentos para la humanidad.";
    String bioMars = "Biodiversidad en Marte:\n" +
            "Aunque Marte ha sido objeto de intensa investigación y especulación, hasta el momento no se ha encontrado evidencia concluyente de vida en el planeta rojo. Su ambiente inhóspito, con una delgada atmósfera y radiación dañina, presenta desafíos significativos para la existencia de formas de vida tal como las conocemos. Sin embargo, la posibilidad de encontrar microorganismos o evidencia de vida pasada sigue siendo un objetivo importante para futuras misiones de exploración. La búsqueda de biodiversidad en Marte no solo ofrece una fascinante oportunidad científica, sino que también podría proporcionar conocimientos fundamentales sobre la evolución planetaria y la habitabilidad fuera de la Tierra.";

    public String earth () {
        return bioEarth;
    }

    public String mars () {
        return bioMars;
    }
}
