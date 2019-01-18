package codingdojo;

public enum WordDirection {
    HORIZONTAL {
        @Override
        public Square move(Square previous) {
            return previous.right();
        }
    },
    VERTICAL {
        @Override
        public Square move(Square previous) {
            return previous.down();
        }
    };

    public abstract Square move(Square previous);
}
