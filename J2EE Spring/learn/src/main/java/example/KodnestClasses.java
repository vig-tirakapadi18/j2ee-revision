package example;

public class KodnestClasses {
        Trainer t;

        public KodnestClasses() {
                super();
        }

        public KodnestClasses(Trainer t) {
                super();
                this.t = t;
        }

        public Trainer getT() {
                return t;
        }

        public void setT(Trainer t) {
                this.t = t;
        }

        @Override
        public String toString() {
                return "KodnestClasses [t=" + t + "]";
        }
}
