package objetos.parcial3.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testArea(){
        //Inicializacion
        Rectangle rectangle = new Rectangle(10,5);

        //Ejecucion
        double area = rectangle.getArea();

        //Validacion
        Assertions.assertEquals(50.0, area);
    }

    @Test
    public void testPerimeter(){
        //Inicializacion
        Rectangle rectangle = new Rectangle(10,5);

        //Ejecucion
        double perimeter = rectangle.getPerimeter();

        //Validacion
        Assertions.assertEquals(30.0, perimeter);
    }
}
