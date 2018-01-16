import java.util.*;

public class VehicleRegister {
    // Initializing a new HashMap which will be of format HashMap<String (P_Key)RegistrationPlate, String Owner>
    private HashMap<RegistrationPlate, String> vehicleRegister = new HashMap();


    /* Checks if the plate has an owner.
     * If it has owner, return false and do nothing.
     * If its avaliable(Owner value == null) tie the plate to the new owner and return true.
     */
    public boolean add(RegistrationPlate plate, String owner) {
        if (this.vehicleRegister.get(plate) == null) { // Checks if the plate has a owner
            this.vehicleRegister.put(plate, owner);    // puts a owner to the plate if check is passes
            return true;  // If successfull add, then return true
        }
        return false;     // already has owner? return false
    }

    public String get(RegistrationPlate plate) {
        if (vehicleRegister.get(plate) == null){
            return null;
        }
        return vehicleRegister.get(plate);
    }

    /* Deletes key plate from HashMap.                                                  *
     * Checks if the plate has owner associated with it, returns true OR false;         *
     * depending on if the plate has an owner                                           */

    public boolean delete(RegistrationPlate plate) {
        if (vehicleRegister.get(plate) == null) {       // Can't delete that which does not exist
            return false;
        }
        vehicleRegister.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : vehicleRegister.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();

        for(RegistrationPlate plate : vehicleRegister.keySet()){
            String owner = vehicleRegister.get(plate);

            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        for(String owner : owners){
            System.out.println(owner);
        }
    }


}
