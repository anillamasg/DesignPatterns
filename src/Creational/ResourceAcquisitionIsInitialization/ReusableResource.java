package Creational.ResourceAcquisitionIsInitialization;

public class ReusableResource {
    private boolean inUse=false;

    public void setInUse(boolean inUse){
        this.inUse = inUse;
    }

    public boolean getInUse(){
        return inUse;
    }

    public void doSomethingImportant(){
        System.out.println("IMPORTANT TASK UNDER OPERATION BY: "+this.hashCode());
    }

}
