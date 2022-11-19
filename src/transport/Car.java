package transport;

public class Car {
    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public class Insurance {
        private int validityPeriod;
        private double cost;
        private String number;

        public Insurance(int validityPeriod, double cost, String number) {
            this.validityPeriod = validityPeriod;
            if (isInsuranceExpired()) System.out.println("Внимание! Нужно обновить страховку!");
            this.cost = (cost <= 0) ? 1 : cost;
            this.number = (isNumberCorrect()) ? number : "Информация не указана";
        }

        public boolean isInsuranceExpired() {
            return (2022 - validityPeriod) < 0;
        }

        public boolean isNumberCorrect() {
            if (number.length() != 9) return false;
            else {
                char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                char[] result = number.toCharArray();
                int a = 0;
                for (int i=0; i<result.length; i++) {
                    for (int j=0; j<num.length; j++) {
                        if (result[i] == num[j]) a++;
                    }
                }
                return a == 9;
            }
        }

        public int getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean isWinterTiresOn;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = (brand.isEmpty() || brand.isBlank() || brand == null) ? "default" : brand;
        this.model = (model.isEmpty() || model.isBlank() || model == null) ? "default" : model;
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
        this.color = (color.isEmpty() || color.isBlank() || color == null) ? "белый" : color;
        this.productionYear = (productionYear <= 0) ? 2000 : productionYear;
        this.productionCountry = (productionCountry.isEmpty() || productionCountry.isBlank() || productionCountry == null) ? "default" : productionCountry;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean isWinterTiresOn) {
        this.brand = (brand.isEmpty() || brand.isBlank() || brand == null) ? "default" : brand;
        this.model = (model.isEmpty() || model.isBlank() || model == null) ? "default" : model;
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
        this.color = (color.isEmpty() || color.isBlank() || color == null) ? "белый" : color;
        this.productionYear = (productionYear <= 0) ? 2000 : productionYear;
        this.productionCountry = (productionCountry.isEmpty() || productionCountry.isBlank() || productionCountry == null) ? "default" : productionCountry;
        this.transmission = (transmission.isEmpty() || transmission.isBlank()) ? "Автомат" : transmission;
        this.bodyType = (bodyType.isEmpty() || bodyType.isBlank()) ? "седан" : bodyType;
        this.registrationNumber = (isRegNumCorrect(registrationNumber)) ? registrationNumber : "default";
        this.numberOfSeats = (numberOfSeats <= 0) ? 5 : numberOfSeats;
        this.isWinterTiresOn = isWinterTiresOn;
    }

    public static boolean isRegNumCorrect(String number) {
        if (number.length() != 9) return false;
        else {
            char[] abc = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
            char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            char[] result = number.toUpperCase().toCharArray();
            int a = 0;
            for (int i=0; i<result.length; i++) {
                if (i == 0 || i == 4 || i == 5) {
                    for (int j=0; j<abc.length; j++) {
                        if (result[i] == abc[j]) a++;
                    }
                } else {
                    for (int k=0; k<num.length; k++) {
                        if (result[i] == num[k]) a++;
                    }
                }
            }
            if (a == 9) return true;
            else return false;

        }
    }

    public void changeTires() {
        this.setWinterTiresOn(!this.isWinterTiresOn);
    }

    public void info() {
        System.out.println("Марка: "+this.getBrand()+"; "+
                "Модель: "+this.getModel()+"; "+
                "Объем двигателя: "+this.getEngineVolume()+" л; "+
                "Цвет: "+this.getColor()+"; "+
                "Год выпуска: "+this.getProductionYear()+"; "+
                "Страна производства: "+this.getProductionCountry());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", isWinterTiresOn=" + isWinterTiresOn +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission.isEmpty() || transmission.isBlank()) ? "Автомат" : transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = (bodyType.isEmpty() || bodyType.isBlank()) ? "седан" : bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (isRegNumCorrect(registrationNumber)) ? registrationNumber : "default";
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = (numberOfSeats <= 0) ? 5 : numberOfSeats;
    }

    public boolean isWinterTiresOn() {
        return isWinterTiresOn;
    }

    public void setWinterTiresOn(boolean winterTiresOn) {
        isWinterTiresOn = winterTiresOn;
    }
}
