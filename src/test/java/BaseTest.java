/*
 * Copyright Konvergence Business & Technologies 2016
 */


import java.util.concurrent.TimeoutException;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import static org.testfx.api.FxToolkit.setupStage;

/**
 * Some tests in order to verify that we are going to another cell by pressing
 * one direction on spanned cell.
 */
public class BaseTest extends FxRobot {

     static {
        System.setProperty("testfx.robot", "glass");
        System.setProperty("testfx.headless", "true");
        System.setProperty("prism.order", "sw");
        System.setProperty("prism.text", "t2k");
    }
     
    protected Stage stage;

    @BeforeClass
    public static void setupClass() throws TimeoutException {
        FxToolkit.registerPrimaryStage();
    }

    @Before
    public void setup() throws TimeoutException {
        setupStage(localStage -> {
           

            StackPane sceneRoot = new StackPane(new Label());
            localStage.setScene(new Scene(sceneRoot, 1000, 800));
            localStage.setX(0);
            localStage.setY(0);
            localStage.show();
        });
    }

    @Test
    public void test(){
        System.out.println("doing nothing.");
    }
}
