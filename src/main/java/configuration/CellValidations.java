package configuration;

import java.util.List;

public class CellValidations {

    String fieldName;
    List<Validation> cellValidations;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<Validation> getCellValidations() {
        return cellValidations;
    }

    public void setCellValidations(List<Validation> cellValidations) {
        this.cellValidations = cellValidations;
    }

    @Override
    public String toString() {
        return "CellValidations{" +
                "fieldName='" + fieldName + '\'' +
                ", cellValidations=" + cellValidations +
                '}';
    }
}
