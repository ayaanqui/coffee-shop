import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CoffeeShop extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = new FXMLLoader(getClass().getResource("CoffeeShopScreen.fxml")).load();

		Scene coffeeShopScene = new Scene(root);
		coffeeShopScene.getStylesheets().add("CoffeeShopStyles.css");

		primaryStage.setTitle("Build your coffee");
		primaryStage.setScene(coffeeShopScene);
		primaryStage.show();
	}
}
