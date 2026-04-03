// BE THE COMPILER PG-88

// PART A
class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
// Will compile , the code is correct

// PART B

class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }
    String getTime() { // void functions have no return values , set it to String type
        return time;
    }
}
class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: "+tod);
    }
}