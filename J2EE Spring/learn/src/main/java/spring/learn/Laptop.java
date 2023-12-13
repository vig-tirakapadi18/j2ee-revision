package spring.learn;

public class Laptop {
        MotherBoard mb;

        public Laptop() {
                super();
        }

        public Laptop(MotherBoard mb) {
                super();
                this.mb = mb;
        }

        public MotherBoard getMb() {
                return mb;
        }

        public void setMb(MotherBoard mb) {
                this.mb = mb;
        }

        @Override
        public String toString() {
                return "Laptop [mb=" + mb + "]";
        }
}
