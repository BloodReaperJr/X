package OOPS.ENUMExample;

public class Basic {

    // Enum declared inside the Basic class
    enum Week {
        // These are enum constants
        // Each of them is implicitly: public, static, and final
        // So, you can access them using Week.Monday, Week.Tuesday, etc.
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // Constructor for enum - gets called once for each constant during enum initialization
        // This is not public or protected because we don't want anyone to create new instances externally
        // Enums are constant types - like a fixed set of instances
        // Enum constructors are either private or package-private (default)
        Week() {
            System.out.println("Constructor called for " + this);
        }

        /*
         * Why not public constructors?
         * Enums are not meant to be instantiated manually.
         * Internally, the JVM creates the enum constants like:
         * public static final Week Monday = new Week();
         *
         * So making the constructor private ensures immutability and uniqueness of enum constants.
         *
         * Note: This restriction is not a special enum rule – it's enforced by visibility and design.
         *
         * Also:
         * - Enums cannot be subclassed (they are final implicitly).
         * - Enums can implement interfaces (but not extend classes).
         */
    }

    public static void main(String[] args) {
        Week week;

        // Assigning enum constant to variable
        week = Week.Monday;

        // Looping through all enum constants using values() method
        for (Week day : Week.values()) {
            // .ordinal() gives the index (0-based) of the constant in declaration order
            System.out.println(day + "    " + day.ordinal());
        }

        /*
         * Output Notes:
         * When the class is loaded and the enum is initialized,
         * the constructor is called once for each constant.
         * So you will see "Constructor called for ..." printed 7 times,
         * once for each day of the week.
         */
    }
    /*
     * ✅ Constructor Notes:
     * - Enum constructors are always private or package-private (default).
     * - You cannot use public/protected constructors in enums.
     * - This prevents creation of new enum instances outside the enum itself.
     *
     * ✅ Internal Working:
     * - Enum constants are compiled like:
     *   public static final Week Monday = new Week();
     *
     * ✅ Enum Instantiation:
     * - All enum constants are instantiated when the enum is loaded into memory.
     * - The constructor is executed once for each constant.
     *
     * ✅ Enum Inheritance:
     * - Enums cannot be extended (no subclassing).
     * - This is because enums are implicitly final — just like final classes.
     * - This ensures type safety and controlled constant values.
     *   For example, you cannot do: `class Holiday extends Week` — it's not allowed.
     *
     * ✅ Enum Features:
     * - Enums **can implement interfaces**.
     * - Enums **cannot extend other classes** (because they already extend java.lang.Enum).
     */
}
