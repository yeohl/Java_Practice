package chap01;

class Tv { // Tv의 속성
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메서드, 함수)
    void power() {power =! power; }
    void channelUp() {++channel; }
    void channelDown() {--channel; }


}

public class tv_test {
    public static void main(String[] args){

        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelUp();
        System.out.println("현재 채널은 "+ t.channel + " 입니다.");

    }
    
}
