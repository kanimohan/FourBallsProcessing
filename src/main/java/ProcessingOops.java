import processing.core.PApplet;
public class ProcessingOops extends PApplet{
    private static final int WIDTH =640;
    private static final int HEIGHT =100;
    private static final int DIAMETER =20;
    Ball b;
    Ball [] TotalNumberOfBalls=new Ball[4];
    public int [] BallSpeed={0,0,0,0};
    public static int [] BallHeightFromTop={HEIGHT,HEIGHT*2,HEIGHT*3,HEIGHT*4};
    public static void main(String[] args) {
        PApplet.main("ProcessingOops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT*5);
    }

    @Override
    public void setup() {
        for(int i =0 ;i <TotalNumberOfBalls.length ; i++) {
            TotalNumberOfBalls[i] = new Ball(this, BallSpeed[i], BallHeightFromTop[i], DIAMETER,i);
        }
    }

    @Override
    public void draw() {
        for(Ball b : TotalNumberOfBalls) {
            b.move();
            b.display();
        }
    }
}
