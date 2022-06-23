class Rectangle {
    int x; int y; int width; int height;

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int square() {
        return width * height;
    }

    void show() {
        System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    boolean contains(Rectangle r) {
        int x2 = r.x;
        int y2 = r.y;
        int x3 = r.x + r.width;
        int y3 = r.y + r.height;

        if ((x2 > x) && (x2 < (x+width)) && ((y2 > y) && (y2 < (y+height)))) return true;
        else if ((x3 > x) && (x3 < (x+width)) && ((y2 > y) && (y2 < (y+height)))) return true;
        else if ((x2 > x) && (x2 < (x+width)) && ((y3 > y) && (y3 < (y+height)))) return true;
        else if ((x3 > x) && (x3 < (x+width)) && ((y3 > y) && (y3 < (y+height)))) return true;
        else return false;
    }
}
