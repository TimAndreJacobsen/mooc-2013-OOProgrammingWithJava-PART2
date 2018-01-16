
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object){  // Checks if the instances being compared are actually
            return true;      // the same instance. And if they are, Great go ahead and return true!
        }

        if (object == null) { // Checks if the comparison object exists.
            return false;     // If it doesnt? cant be equal to something that doesnt exist!
        }

        if (getClass() != object.getClass()) {   // checks if they are the same class.
            return false;                        // this check is probably redundant with casting in next if statement?
        }

        if (object instanceof RegistrationPlate)   {
            RegistrationPlate test = (RegistrationPlate) object;                           // -I THINK-// Initializes a
            if (test.regCode.equals(this.regCode) && test.country.equals(this.country)) {  // new RegistrationPlate object
                return true;                                                               // and casts the compared object into it.
            }                                                                              // Then checks if all its values are equal
        } return false;
    }

    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7; // Start with a non-zero prime number -- INITIAL HASH
        }
        return this.country.hashCode() + this.regCode.hashCode();
    }



}