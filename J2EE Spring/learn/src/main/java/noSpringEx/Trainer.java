package noSpringEx;

public interface Trainer {
        void teach();

        void work();
}

class JavaTrainer implements Trainer {
        public void teach() {
                System.out.println("Java trainer is training!");
        }

        public void work() {
                System.out.println("Java trainer is working!");
        }
}

class PyTrainer implements Trainer {
        public void teach() {
                System.out.println("Python trainer is training!");
        }

        public void work() {
                System.out.println("Python trainer is working!");
        }
}

class ReactTrainer implements Trainer {
        public void teach() {
                System.out.println("React trainer is training!");
        }

        public void work() {
                System.out.println("React trainer is working!");
        }
}