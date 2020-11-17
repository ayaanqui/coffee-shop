import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CoffeeShopController implements Initializable {
    @FXML private HBox optionButtonsContainer;

    @FXML private Button creamButton;
    @FXML private Button sugarButton;
    @FXML private Button extraShotButton;
    @FXML private Button whippedCreamButton;
    @FXML private Button iceButton;

    @FXML private ListView receiptList;

    @FXML private Button orderButton;
    @FXML private Button newOrderButton;

    private Order order = new Order();

    private void defaultOrder() {
        this.receiptList.getItems().add(String.format("Black coffee: $%.2f", this.order.total()));
    }

    public void creamButtonAction(Event e) {
        double creamPrice = this.order.addCream();
        this.receiptList.getItems().add(String.format(" + cream: $%.2f", creamPrice));
    }

    public void sugarButtonAction(Event e) {
        double sugarPrice = this.order.addSugar();
        this.receiptList.getItems().add(String.format(" + sugar: $%.2f", sugarPrice));
    }

    public void extraShotButtonAction(Event e) {
        double extraShotPrice = this.order.addExtraShot();
        this.receiptList.getItems().add(String.format(" + extra shot: $%.2f", extraShotPrice));
    }

    public void whippedCreamButtonAction(Event e) {
        double whippedCreamPrice = this.order.addWhippedCream();
        this.receiptList.getItems().add(String.format(" + whipped cream: $%.2f", whippedCreamPrice));
    }

    public void iceButtonAction(Event e) {
        double icePrice = this.order.addIce();
        this.receiptList.getItems().add(String.format(" + ice: $%.2f", icePrice));
    }

    public void orderButtonAction(Event e) {
        this.receiptList.getItems().add(String.format("Total: $%.2f", this.order.total()));
        optionButtonsContainer.setDisable(true);
        orderButton.setDisable(true);
    }

    public void newOrderButtonAction(Event e) {
        this.order = new Order();
        this.receiptList.getItems().clear();
        this.defaultOrder();
        this.orderButton.setDisable(false);
        this.optionButtonsContainer.setDisable(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.defaultOrder();
    }
}
