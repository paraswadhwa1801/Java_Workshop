public interface FrogBoilable {
 
    // static method
    static int getCToF(int cTemp) {
        return (cTemp * 9/5) + 32;
    }

    // default method
    default String hop() { return "hopping"; }
}
