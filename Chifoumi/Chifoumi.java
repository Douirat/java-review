public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        switch(chifoumiAction){
            case ChifoumiAction.ROCK:
                return ChifoumiAction.SCISSOR;
            case ChifoumiAction.PAPER:
                return ChifoumiAction.ROCK;
            case ChifoumiAction.SCISSOR:
                return ChifoumiAction.PAPER;
            default:
                throw new RuntimeException("Invalid chifoumi action!");
        }
    }
}