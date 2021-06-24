package destiny.bplus;

/**
 * Tree
 */
public interface Tree
{

    Tuple find(Tuple key);

    boolean remove(Tuple key);

    void insert(Tuple key);
}
