import org.example.sort.NaiveQuickSort;
import org.example.sort.OptimizedQuickSort;
import org.example.sort.SortAlgorithm;

public class OptimizedQuickSortTest extends AbstractSortTest {
    @Override
    protected SortAlgorithm getSort() {
        return new OptimizedQuickSort();
    }
}
