package codingdojo;

public enum WordDirection {
    HORIZONTAL {
        @Override
        public SquareKT move(SquareKT previous) {
            return previous.right();
        }
    },
    VERTICAL {
        @Override
        public SquareKT move(SquareKT previous) {
            return previous.down();
        }
    };

    public abstract SquareKT move(SquareKT previous);
}
