package dogfight;

import dogfight.controller.DogfightController;
import dogfight.model.DogfightModel;
import dogfight.vue.DogfightView;

public class DogfightMain {

	public static void main(String[] args) {
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play(); 

	}
}
