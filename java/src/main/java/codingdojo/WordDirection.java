package codingdojo;

public enum WordDirection {
    HORIZONTAL {
        @Override
        public Square next(Square previous) {
            return previous.right();
        }
    },
    VERTICAL {
        @Override
        public Square next(Square previous) {
            return previous.down();
        }
    };

    public abstract Square next(Square previous);
}
