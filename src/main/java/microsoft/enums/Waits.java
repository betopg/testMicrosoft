package microsoft.enums;

public enum Waits {

        IMPLICIT_WAIT("Impicit wait"),
        EXPLICIT_WAIT("Explicit wait");

        private final String value;

        Waits(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
}
