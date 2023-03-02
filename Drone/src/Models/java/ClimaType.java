/* Do not remove or modify this comment!  It is required for file identification!
DNL
platform:/resource/Drone/src/Models/dnl/Drone.dnl
 Do not remove or modify this comment!  It is required for file identification! */
package Models.java;

import java.io.Serializable;

public class ClimaType implements Serializable {
    private static final long serialVersionUID = 1L;

    //ID:VAR:ClimaType:0
    boolean value;

    //ENDIF
    public ClimaType() {
    }

    public ClimaType(boolean value) {
        this.value = value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return this.value;
    }

    public String toString() {
        String str = "ClimaType";
        str += "\n\tvalue: " + this.value;
        return str;
    }
}
