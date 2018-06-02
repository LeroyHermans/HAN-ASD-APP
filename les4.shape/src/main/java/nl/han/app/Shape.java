package nl.han.app;

public abstract class Shape<T extends Shape<T>> implements Comparable<T>
{
    public abstract double area( );
    public abstract double perimeter( );

    public int compareTo( Shape rhs )
    {
        double diff = area( ) - rhs.area( );
        if( diff == 0 )
            return 0;
        else if( diff < 0 )
            return -1;
        else
            return 1;
    }

    public double semiperimeter( )
    {
        return perimeter( ) / 2;
    }
}