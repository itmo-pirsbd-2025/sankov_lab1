import org.example.sort.ImprovedQuickSort;
import org.example.sort.SortAlgorithm;

public class ImprovedQuickSortTest extends AbstractSortTest {
    @Override
    protected SortAlgorithm algorithm() {
        return new ImprovedQuickSort();
    }
}
