package.tutorials;

public class MemoryUsage {
    /**
     * Java divides memory into two main areas: Young Generation and Old Generation.
     *
     * Young Generation:
     * - This is where new objects are created.
     * - It's divided into Eden space and Survivor spaces.
     * - New objects start in the Eden space.
     * - When Eden fills up, a minor garbage collection (GC) happens:
     *     - Objects still in use are moved to Survivor spaces.
     *     - Unused objects are removed.
     * - Objects that survive many GCs move to the Old Generation.
     *
     * Old Generation:
     * - This is for objects that live a long time.
     * - Major GCs happen here, but less often.
     * - Unused objects are removed during major GCs.
     *
     * Garbage Collection (GC):
     * - GC automatically removes objects that are no longer used.
     * - Minor GC cleans the Young Generation.
     * - Major GC cleans both Young and Old Generations.
     * - The Mark and Sweep method is often used:
     *     - Mark: GC marks objects that are still in use.
     *     - Sweep: GC removes objects that aren't marked.
     */
}
