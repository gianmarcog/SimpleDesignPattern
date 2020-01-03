public abstract class Building {

    public final void templateMethod() {
        System.out.println("Start");
        excavateExcavationPit();
        bodyshopSites();
        mountingTheRoof();
        closeProject();
    }

    protected final void excavateExcavationPit() {
        System.out.println("Excavate is starting");
    }

    protected abstract void bodyshopSites();

    protected abstract void mountingTheRoof();

    protected abstract void closeProject();
}