class info{
    int side;

    public int area()
    {
        return side *side;
    }

    public int perimeter()
    {
        return 4 * side;
    }
}

public class square {
    public static void main(String[] args) {
        info sq = new info();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
