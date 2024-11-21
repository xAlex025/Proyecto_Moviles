package com.example.proyecto_moviles.Utilidades;

import com.example.proyecto_moviles.Models.Animal;
import com.example.proyecto_moviles.R;

import java.util.ArrayList;

public class Utilidades {

    public static final String IMAGEN = "imagen";
    public static final String NOMBRE = "nombre";
    public static final String DESC = "desc";


    private static ArrayList<Animal> animales;

    public Utilidades() {

        this.animales = new ArrayList<>();
        this.animales.add(new Animal(
                "León",
                "El león, conocido como el rey de la selva, es uno de los depredadores más icónicos y majestuosos del reino animal.\n" +
                        "Habita principalmente en las sabanas y praderas de África, pero en el pasado también se encontraba en regiones de Asia y Europa.\n" +
                        "Su gran tamaño, poderosa musculatura y distintiva melena en los machos lo convierten en un símbolo universal de fuerza y liderazgo.\n" +
                        "La melena de los machos varía en tamaño y color, siendo un indicador de su salud y dominio dentro de la manada.\n\n" +
                        "A diferencia de la mayoría de los felinos, los leones son animales sociales que viven en manadas organizadas, generalmente lideradas\n" +
                        "por uno o dos machos dominantes y conformadas por varias hembras y sus crías. Las hembras son las principales responsables de la caza,\n" +
                        "trabajando en equipo para atrapar presas como cebras, ñus y antílopes, mientras que los machos protegen a la manada de posibles amenazas,\n" +
                        "como otros machos rivales o depredadores.\n\n" +
                        "Una de las características más impresionantes del león es su rugido, que puede escucharse a más de ocho kilómetros de distancia.\n" +
                        "Este rugido no solo sirve como una advertencia para intrusos, sino también como una forma de comunicación con los miembros de su grupo.\n" +
                        "Los leones son animales territoriales y dedican gran parte de su tiempo a marcar y defender su territorio.\n\n" +
                        "A pesar de ocupar la cima de la cadena alimenticia, los leones enfrentan numerosas amenazas, como la pérdida de hábitat,\n" +
                        "la caza furtiva y el conflicto con los humanos. Estos desafíos han reducido sus poblaciones drásticamente en las últimas décadas.\n" +
                        "Sin embargo, los leones siguen siendo una especie fascinante y esencial para el equilibrio de los ecosistemas donde habitan,\n" +
                        "además de ser un recordatorio de la necesidad de proteger nuestra biodiversidad.",
                R.drawable.lion
        ));


        this.animales.add(new Animal(
                "Elefante",
                "El elefante es el mamífero terrestre más grande del mundo y una de las especies más icónicas de la fauna.\n" +
                        "Existen dos especies principales: el elefante africano, que es más grande y habita en las sabanas y bosques de África,\n" +
                        "y el elefante asiático, más pequeño y característico de las selvas y praderas del continente asiático.\n\n" +
                        "Los elefantes son conocidos por su inteligencia excepcional, comparable a la de los delfines y primates,\n" +
                        "así como por su memoria impresionante. Un rasgo distintivo es su trompa multifuncional, que utilizan para respirar,\n" +
                        "alimentarse, comunicarse y bañarse. También tienen colmillos de marfil que emplean para cavar, pelar cortezas de árboles\n" +
                        "y defenderse, aunque tristemente, estos colmillos los han convertido en víctimas de la caza furtiva,\n" +
                        "lo que ha puesto a muchas poblaciones en peligro crítico de extinción.\n\n" +
                        "Los elefantes son animales altamente sociales, que viven en manadas lideradas por una matriarca.\n" +
                        "Poseen complejos rituales de duelo y muestran comportamientos como el juego, el altruismo y la empatía.\n" +
                        "Con una esperanza de vida de hasta 70 años, los elefantes representan no solo fuerza y grandeza,\n" +
                        "sino también la vulnerabilidad de las especies ante las amenazas humanas.",
                R.drawable.elephant
        ));

        this.animales.add(new Animal(
                "Gato",
                "El gato doméstico, descendiente de los gatos salvajes africanos, es uno de los animales de compañía\n" +
                        "más queridos y populares en todo el mundo. Su historia de domesticación se remonta a más de 9,000 años,\n" +
                        "cuando comenzaron a convivir con humanos en las primeras civilizaciones agrícolas, ayudando a controlar las plagas.\n\n" +
                        "Hoy en día, los gatos son conocidos por su naturaleza curiosa, ágil e independiente, aunque también pueden ser\n" +
                        "increíblemente afectuosos con sus dueños. Dotados de un oído extremadamente sensible y una visión nocturna impresionante,\n" +
                        "los gatos son cazadores expertos que se mueven con sigilo gracias a sus almohadillas suaves.\n\n" +
                        "Además, su comportamiento único, como frotarse contra las personas, ronronear y amasar con las patas,\n" +
                        "no solo es entrañable, sino también una forma de comunicación y expresión de comodidad. El ronroneo, en particular,\n" +
                        "es un sonido asociado con la felicidad, aunque también puede indicar que el gato busca consuelo.\n\n" +
                        "Con una esperanza de vida que puede superar los 15 años, los gatos son animales profundamente adaptables\n" +
                        "que disfrutan tanto de la compañía humana como de momentos de soledad. Su capacidad de cazar, su agudo sentido\n" +
                        "del equilibrio y su legendario reflejo de \"caer de pie\" los convierten en criaturas fascinantes que han capturado\n" +
                        "la atención y el cariño de los seres humanos durante siglos.",
                R.drawable.cat
        ));

        this.animales.add(new Animal(
                "Perro",
                "El perro, conocido como el mejor amigo del hombre, es un animal leal y sociable que ha acompañado a los seres humanos\n" +
                        "durante miles de años. Su domesticación se remonta a tiempos ancestrales, cuando comenzó a convivir con las primeras\n" +
                        "civilizaciones humanas. Existen cientos de razas de perros, cada una con características únicas en términos de tamaño,\n" +
                        "personalidad y habilidades. Desde los pequeños chihuahuas hasta los majestuosos grandes daneses, los perros han demostrado\n" +
                        "ser compañeros versátiles y confiables.\n\n" +
                        "Los perros son animales inteligentes, capaces de aprender una amplia variedad de comandos y tareas, y tienen un sentido\n" +
                        "del olfato increíblemente desarrollado, que los convierte en aliados indispensables en tareas como el rescate, la detección\n" +
                        "de sustancias peligrosas y la asistencia a personas con discapacidades. Además de ser trabajadores incansables, los perros\n" +
                        "son mascotas cariñosas que forman fuertes vínculos emocionales con sus dueños, ofreciendo consuelo, protección y alegría\n" +
                        "a lo largo de sus vidas.",
                R.drawable.dog
        ));

        this.animales.add(new Animal(
                "Tigre",
                "El tigre es el felino más grande y poderoso del mundo, conocido por su majestuoso pelaje naranja cubierto de rayas negras únicas.\n" +
                        "Cada tigre tiene un patrón de rayas distintivo, similar a una huella dactilar, que lo hace único. Habita en Asia, principalmente\n" +
                        "en bosques tropicales, manglares y zonas de densa vegetación. El tigre de Bengala, una de las subespecies más emblemáticas,\n" +
                        "es un símbolo de fuerza y poder en muchas culturas alrededor del mundo.\n\n" +
                        "Los tigres son cazadores solitarios y expertos, capaces de recorrer grandes distancias para encontrar alimento. Su habilidad\n" +
                        "para nadar los distingue de otros felinos, ya que disfrutan pasar tiempo en el agua para refrescarse y cazar. A pesar de su\n" +
                        "posición en la cima de la cadena alimenticia, los tigres enfrentan amenazas significativas como la pérdida de hábitat\n" +
                        "y la caza furtiva, lo que ha puesto a muchas subespecies en peligro de extinción.",
                R.drawable.tiger
        ));

        this.animales.add(new Animal(
                "Jirafa",
                "La jirafa es el animal terrestre más alto del mundo, famosa por su largo cuello y patas esbeltas que le permiten alcanzar\n" +
                        "las hojas en las copas de los árboles altos, especialmente las acacias, su principal fuente de alimento. Habita en las\n" +
                        "sabanas y zonas abiertas de África, donde su distintivo pelaje cubierto de manchas únicas actúa como un camuflaje natural\n" +
                        "contra los depredadores.\n\n" +
                        "A pesar de su gran altura y apariencia tranquila, las jirafas son capaces de correr a velocidades de hasta 50 kilómetros\n" +
                        "por hora para escapar de amenazas como los leones. Son animales sociales que suelen vivir en grupos pequeños y mantienen\n" +
                        "una comunicación sutil basada en vibraciones de baja frecuencia que los humanos no pueden percibir. Su elegancia y\n" +
                        "comportamiento pacífico las convierten en símbolos de serenidad en la naturaleza.",
                R.drawable.giraffe
        ));

        this.animales.add(new Animal(
                "Cebra",
                "La cebra es un animal fascinante que habita en las sabanas africanas y es reconocida por su distintivo pelaje a rayas negras\n" +
                        "y blancas. Estas rayas no solo le otorgan un aspecto único, sino que también sirven como camuflaje para confundir a los\n" +
                        "depredadores, además de ayudar a regular su temperatura corporal y actuar como repelente natural contra los insectos.\n\n" +
                        "Cada cebra tiene un patrón de rayas único, similar a una huella dactilar, lo que las hace fácilmente identificables.\n" +
                        "Son animales sociales que viven en manadas lideradas por un macho dominante, y dependen del grupo para protegerse de\n" +
                        "depredadores como los leones. Aunque son similares a los caballos, las cebras tienen un temperamento más salvaje y no\n" +
                        "han sido domesticadas. Su resistencia y adaptabilidad les permiten sobrevivir en entornos difíciles, enfrentándose\n" +
                        "a los desafíos de la vida en las vastas sabanas.",
                R.drawable.zebra
        ));

        this.animales.add(new Animal(
                "Pingüino",
                "El pingüino es un ave única que habita principalmente en el hemisferio sur, siendo la Antártida el hogar de varias de\n" +
                        "sus especies más emblemáticas. Aunque no pueden volar, los pingüinos son nadadores excepcionales que utilizan sus alas\n" +
                        "como aletas para desplazarse rápidamente bajo el agua, donde cazan peces, krill y otros pequeños organismos marinos.\n\n" +
                        "El pingüino emperador es especialmente fascinante por sus largas caminatas a través del hielo para llegar a sus áreas\n" +
                        "de cría. Durante el invierno antártico, los machos cuidan los huevos soportando temperaturas extremas mientras las hembras\n" +
                        "viajan grandes distancias para buscar alimento. Los pingüinos tienen una vida social compleja y forman colonias enormes\n" +
                        "donde interactúan mediante sonidos distintivos y rituales únicos. Su apariencia encantadora y su resistencia en entornos\n" +
                        "hostiles los convierten en una de las especies más admiradas del reino animal.",
                R.drawable.penguin
        ));



    }

    public static ArrayList<Animal> getAnimales() {
        return animales;
    }

    public static void setAnimales(ArrayList<Animal> animales) {
        Utilidades.animales = animales;


    }
}
