package Creational.ResourceAcquisitionIsInitialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReusablePool {
    private int poolSize = 10;
    private List<ReusableResource> reusableResourceList;
    private static ReusablePool reusablePool = null;

    private ReusablePool(){
        reusableResourceList = new ArrayList<>();
    }

    public static ReusablePool getInstance(){
        if(reusablePool==null){
            reusablePool = new ReusablePool();
        }
        return reusablePool;
    }

    public ReusableResource acquireReusableResource() {
        try(CustomLock lock = new CustomLock()) {

            for (ReusableResource reusableResource : reusableResourceList) {
                if (!reusableResource.getInUse()) {
                    reusableResource.setInUse(true);
//                lock.release();
                    return reusableResource;
                }
            }

            if (reusableResourceList.size() == poolSize) {
                System.out.println("All the resources are currently in use.");
//            lock.release();
                return null;
            }

            ReusableResource reusableResource = new ReusableResource();
            reusableResource.setInUse(true);
            reusableResourceList.add(reusableResource);
//        lock.release();

            return reusableResource;
        }
    }

    public void releaseReusableResource(ReusableResource reusableResource){
        CustomLock lock = new CustomLock();
        int i = reusableResourceList.indexOf(reusableResource);
        if(i==-1) {
            System.out.println("The instance doesn't belong to the pool.");
            lock.release();
            return;
        }

        ReusableResource resource = reusableResourceList.get(i);
        resource.setInUse(false);
        lock.release();
    }



}
