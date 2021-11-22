import processing.core.PApplet;

public class Ball {
    int SpeedOfTheBall,HeightOfTheBallFromTop,SizeOfTheBall,IndexOfBall;
    PApplet p;
    Ball(PApplet p,int xpos,int ypos,int radius,int i)
    {
        this.p=p;
        SpeedOfTheBall=xpos;
        HeightOfTheBallFromTop=ypos;
        SizeOfTheBall=radius;
        IndexOfBall=i;
    }
    void display()
    {
        p.ellipse(SpeedOfTheBall,HeightOfTheBallFromTop,SizeOfTheBall,SizeOfTheBall);
    }
    void move()
    {
        SpeedOfTheBall=SpeedOfTheBall+IndexOfBall+1;
    }
}
