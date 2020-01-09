public abstract class Building {

    // Final Method specifies the order of the methods
    public final void templateMethod() {
        System.out.println("Start");
        excavateExcavationPit();
        bodyshopSites();
        mountingTheRoof();
        closeProject();
    }

    // Final Method specifies the order of the methods
    protected final void excavateExcavationPit() {
        System.out.println("Excavate is starting");
    }

    protected abstract void bodyshopSites();

    protected abstract void mountingTheRoof();

    protected abstract void closeProject();
}
