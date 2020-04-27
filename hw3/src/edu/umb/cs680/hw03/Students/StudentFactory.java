package edu.umb.cs680.hw03.Students;

public class StudentFactory {


    private StudentFactory() {}
    public static Student createInState(String name, String usAddr) {
          return new Student(name, usAddr, 0, 0, null, StudentStatus.INSTATE);
    }

    public static Student createOutState(String name, String usAddr, int yrsInState) {
       return new Student(name, usAddr, yrsInState, 0, null, StudentStatus.OUTSTATE);
    }
    public static Student createIntlState(String name, String usAddr, int i20num, String foreignAddr) {
        return new Student(name, usAddr, 0, i20num, foreignAddr, StudentStatus.INTL);

    }

    public static class Student {
        private float tuition;
        private String name;
        private int i20num;
        private String usAddr;
        private int yrsInState;
        private String foreignAddr;
        private StudentStatus status;
        protected Student(String name, String usAddr, int yrsInState, int i20num, String foreignAddr,
                          StudentStatus status) {
            this.name = name;
            this.usAddr = usAddr;
            this.yrsInState = yrsInState;
            this.i20num = i20num;
            this.foreignAddr = foreignAddr;
            this.status = status;
        }



        public float getTuition() {
           return status.getTuition();
        }
        public String getName() {
            return name;
        }
        public StudentStatus getStatus() {
            return status;
        }
        public int getI20Number() {
            return i20num;
        }
        public String getUSAddress() {
            return usAddr;
        }
        public int getyrsInState() {
            return yrsInState;
        }
        public String getForeignAddr() {
            return foreignAddr;
        }
    }

    public static void main(String[] arg) {
        Student Sin=StudentFactory.createInState("Joe", "localStreet");
        System.out.println("Instate Student " + Sin.getName()+ " Tuition Fee: " + Sin.getTuition());

        Student Sout=StudentFactory.createOutState("Tom", "OutStreet", 2222);
        System.out.println("Outstate Student " + Sout.getName()+ " Tuition Fee: " + Sout.getTuition());

        Student Sinl=StudentFactory.createIntlState("Sam", "OutCountryStreet", 3333, "Out");
        System.out.println("Inlstate Student " + Sinl.getName()+ " Tuition Fee: " + Sinl.getTuition());

    }
}

