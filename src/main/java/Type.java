public enum Type {

    ROCK {
        @Override
        public boolean beats(Type type) {
            return type == SCISSORS;
        }
    },
    PAPER {
        @Override
        public boolean beats(Type type) {
            return type == ROCK;
        }
    },
    SCISSORS {
        @Override
        public boolean beats(Type type) {
            return type == PAPER;
        }
    };

    public abstract boolean beats(Type type);


}
