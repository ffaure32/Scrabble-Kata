package codingdojo;

public enum WordDirection {
    HORIZONTAL {
        @Override
        public Square move(Square previous) {
            return previous.right();
        }

        @Override
        public SquareKT move(SquareKT previous) {
            return previous.right();
        }
    },
    VERTICAL {
        @Override
        public Square move(Square previous) {
            return previous.down();
        }

        @Override
        public SquareKT move(SquareKT previous) {
            return previous.down();
        }
    };

    public abstract Square move(Square previous);
    public abstract SquareKT move(SquareKT previous);
}
