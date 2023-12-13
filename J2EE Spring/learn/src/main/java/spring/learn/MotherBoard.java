package spring.learn;

public class MotherBoard {
        String brand;
        int price;

        public MotherBoard() {
                super();
        }

        public MotherBoard(String brand, int price) {
                super();
                this.brand = brand;
                this.price = price;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        @Override
        public String toString() {
                return "MotherBoard [brand=" + brand + ", price=" + price + "]";
        }
}
