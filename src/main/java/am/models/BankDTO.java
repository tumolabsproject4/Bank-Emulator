package am.models;

public class BankDTO {
    private int bankID;
    private String bankName;
    private String address;

    public BankDTO() {
    }

    public BankDTO(int bankID, String bankName, String address) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.address = address;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
