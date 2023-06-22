package Classes;

public class CHL implements Hospital {

    private String hospitalName = "Care Hospital Limited";
    private String hospitalAddress = "Ashulia, Shavar, Dhaka.";

    @Override
    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String getHospitalAddress() {
        return hospitalAddress;
    }

    @Override
    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }
}
