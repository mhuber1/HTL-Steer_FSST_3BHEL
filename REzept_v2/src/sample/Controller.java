package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;

import java.util.Optional;

public class Controller {
    public static final int REZEPTE_MAX = 100;

    public TextArea taMain;// View und dem Controller

    protected Rezept[] rezepte = new Rezept[REZEPTE_MAX];
    protected int cntRezepte = 0;


    public void New(ActionEvent actionEvent) {
        Rezept r = null;

        System.out.println("Button pressed");

        // show TextInputDialog to read title
        TextInputDialog td = new TextInputDialog("Name des Rezepts eingeben");
        td.setTitle("Rezept hinzufügen");
        //System.out.println("davor");

        //td.show();    -- nicht Modal
        //td.showAndWait(); // Modal - wartet bis der Dialog geschlossen ist

        Optional<String> result = td.showAndWait();
        System.out.println(result);
        if (result.isPresent()) {

            //System.out.println(result.get());
            r = new Rezept(result.get());
            rezepte[0]= r;
            //cntRezepte++;

            taMain.setText(r.name);
        }
        System.out.println(rezepte[0]);
    }
}
