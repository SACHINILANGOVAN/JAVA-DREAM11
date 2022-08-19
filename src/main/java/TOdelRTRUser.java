public class TOdelRTRUser {

    private int id;
    private long phoneNumber;
    private int otp;

    public TOdelRTRUser() {
    }

    public TOdelRTRUser(int id, long phoneNumber, int otp) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.otp = otp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }
}
