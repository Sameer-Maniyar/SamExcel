package configuration;

import java.util.List;

public class RowValidation {

    private List<CellValidations> validations;


    public List<CellValidations> getValidations() {
        return validations;
    }

    public void setValidations(List<CellValidations> validations) {
        this.validations = validations;
    }

    @Override
    public String toString() {
        return "RowValidation{" +
                "validations=" + validations +
                '}';
    }
}
