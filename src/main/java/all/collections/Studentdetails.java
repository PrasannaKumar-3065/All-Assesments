package all.collections;

class Studentdetails {
    String studentName;
    String studentAddress;
    int id;

    protected Studentdetails(String studentName, String studentAddress, int id) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
