import com.kodilla.spring.intro.Circle;
import com.kodilla.spring.intro.Drawer;
import com.kodilla.spring.intro.Triangle;
import com.kodilla.spring.intro.shape.drawingTrials.DrawerPoli;
import com.kodilla.spring.intro.shape.drawingTrials.DrawerInterface;
import com.kodilla.spring.intro.shape.drawingTrials.DrawerModified;
import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    //Test 1
    @Test
    public void testDoDrawing() {
        //Given
        DrawerPoli drawerPoli = new DrawerPoli();
        //When
        drawerPoli.doDrawing();
        //Then
    }

    //Test 2
    @Test
    public void testDoDrawingModified() {
        //Given
        DrawerModified drawer = new DrawerModified();
        //When
        drawer.doDrawing();
        //Then
    }

    //Test 3
    @Test
    public void testDoDrawingWithInterface() {
        //Given
        DrawerInterface drawerInterface = new DrawerInterface();
        //When
        drawerInterface.doDrawing();
    }

    //Test 4
    @Test
    public void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a DI circle", result);
    }

    //Test 5
    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a DI triangle", result);
    }
}
