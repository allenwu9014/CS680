package edu.umb.cs680.hw03.Students;
import java.lang.Override;
public enum StudentStatus {
    INSTATE {
        @Override
        public float getTuition() {
            return 1000;
        }
    },
    OUTSTATE{
        @Override
        public float getTuition() {
            return 3000;
        }
    },
    INTL{
        @Override
        public float getTuition() {
            return 5000;
        }
    };

    public abstract float getTuition();
}
