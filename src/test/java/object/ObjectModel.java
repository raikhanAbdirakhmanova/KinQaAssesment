package object;

public class ObjectModel {



    private int pages;
    private  String DDSNum;
    private int read;
    private boolean readOrNot;

    public boolean isReadOrNot() {
        return readOrNot;
    }

    public void setReadOrNot(boolean readOrNot) {
        this.readOrNot = readOrNot;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public double getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDDSnum() {
        return DDSNum;
    }

    public void setDDSNum(String DDC) {
        this.DDSNum = DDC;
    }
}
