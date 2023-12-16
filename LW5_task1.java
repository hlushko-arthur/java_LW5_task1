import java.util.ArrayList;
import java.util.List;

class LW5_task1 {
	public static class Mobile {
		private List<PhoneModel> phoneModels = new ArrayList<>();

		public void addPhoneModel(String modelName, String brand, double screenSize, int batteryCapacity) {
			PhoneModel phoneModel = new PhoneModel(modelName, brand, screenSize, batteryCapacity);
			phoneModels.add(phoneModel);
		}

		public void displayPhoneModels() {
			System.out.println("Phone Models:");
			for (PhoneModel phoneModel : phoneModels) {
				System.out.println(phoneModel);
			}
		}

		public class PhoneModel {
			private String modelName;
			private String brand;
			private double screenSize;
			private int batteryCapacity;

			public PhoneModel(String modelName, String brand, double screenSize, int batteryCapacity) {
				this.modelName = modelName;
				this.brand = brand;
				this.screenSize = screenSize;
				this.batteryCapacity = batteryCapacity;
			}

			public String getModelName() {
				return modelName;
			}

			public String getBrand() {
				return brand;
			}

			public double getScreenSize() {
				return screenSize;
			}

			public int getBatteryCapacity() {
				return batteryCapacity;
			}

			@Override
			public String toString() {
				return "PhoneModel{" +
						"modelName='" + modelName + '\'' +
						", brand='" + brand + '\'' +
						", screenSize=" + screenSize +
						", batteryCapacity=" + batteryCapacity +
						'}';
			}
		}
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();

		mobile.addPhoneModel("iPhone 13", "Apple", 6.1, 3095);
		mobile.addPhoneModel("Galaxy S21", "Samsung", 6.2, 4000);
		mobile.addPhoneModel("Pixel 6", "Google", 6.4, 4600);

		mobile.displayPhoneModels();
	}
}
