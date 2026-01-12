import org.example.sort.OptimizedQuickSort;
import org.example.sort.SortAlgorithm;

public class OptimizedQuickSortTest extends AbstractSortTest {
    @Override
    protected SortAlgorithm algorithm() {
        return new OptimizedQuickSort();
    }
}
