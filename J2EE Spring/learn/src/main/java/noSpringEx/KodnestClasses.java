package noSpringEx;

public class KodnestClasses {
        public static void main(String[] args) {
                // NON POLYMORPHISM & TIGHT COUPLING
                // JavaTrainer jt = new JavaTrainer();
                // PyTrainer pt = new PyTrainer();
                // ReactTrainer rt = new ReactTrainer();
                // jt.teach();
                // jt.work();
                // pt.teach();
                // pt.work();
                // rt.teach();
                // rt.work();

                // POLYMORPHISM & LOSE COUPLING
                // Trainer t;

                // JavaTrainer jt = new JavaTrainer();
                // t = jt;
                // t.teach();
                // t.work();

                // PyTrainer pt = new PyTrainer();
                // t = pt;
                // t.teach();
                // t.work();

                // ReactTrainer rt = new ReactTrainer();
                // t = rt;
                // t.teach();
                // t.work();

                // WITHOUT CODE REDUNDENCY
                JavaTrainer jt = new JavaTrainer();
                PyTrainer pt = new PyTrainer();
                ReactTrainer rt = new ReactTrainer();

                takeClass(jt);
                takeClass(pt);
                takeClass(rt);
        }

        public static void takeClass(Trainer tr) {
                tr.teach();
                tr.work();
        }

}
