package FinalProject;

public enum Field {
    EMPTY_SQUARE("\uD83D\uDFEB"), SHIP_SQUARE("\uD83D\uDEA2"), HALO_SQUARE("\uD83D\uDFE6"), HIT_SQUARE("\uD83D\uDFE9");
    private final String field;

    Field(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
