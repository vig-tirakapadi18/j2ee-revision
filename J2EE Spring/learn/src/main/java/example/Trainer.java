package example;

public class Trainer {
        String name;
        String tech;

        public Trainer() {
                super();
        }

        public Trainer(String name, String tech) {
                super();
                this.name = name;
                this.tech = tech;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getTech() {
                return tech;
        }

        public void setTech(String tech) {
                this.tech = tech;
        }

        @Override
        public String toString() {
                return "Trainer [name=" + name + ", tech=" + tech + "]";
        }
}
