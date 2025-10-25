package configuration;

public class Validation {

    private String type;
    private String errorMessage;

    // Getters & Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getErrorMessage() { return errorMessage; }
    public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; }

    @Override
    public String toString() {
        return "CellValidation{type='" + type + "', errorMessage='" + errorMessage + "'}";
    }
}
