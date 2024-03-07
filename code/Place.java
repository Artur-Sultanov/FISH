    public class Place {
        private String name;
        private double latitude;
        private double longitude;
    
        // Конструктор
        public Place(String name, double latitude, double longitude) {
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
        }
    
        // Геттеры и сеттеры
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getLatitude() {
            return latitude;
        }
    
        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    
        public double getLongitude() {
            return longitude;
        }
    
        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    
        // Метод для вывода информации о месте
        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Latitude: " + latitude);
            System.out.println("Longitude: " + longitude);
        }
    
}
