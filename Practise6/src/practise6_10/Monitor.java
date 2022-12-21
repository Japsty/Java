package practise6_10;

public class Monitor {
    private int width;
    private int height;
    private int size;
    public Monitor(int w, int h, int s) {
        width = w;
        height = h;
        size = s;
    }
    public Monitor() {
        width = 1920;
        height = 1080;
        size = 21;
    }

    public int getResolution(){
        return this.width * this.height;
    }

    public int getPpi() {
        return (int) Math.pow(((this.width * this.width) + (this.height * this.height)),(1/2)) / this.size;
    }
    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getSize(){
        return size;
    }
    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h) {
        height = h;
    }
    public void setSize(int s) {
        size = s;
    }
}
