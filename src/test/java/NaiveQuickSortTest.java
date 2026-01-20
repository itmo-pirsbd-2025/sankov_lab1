import org.example.sort.ImprovedQuickSort;
import org.example.sort.NaiveQuickSort;
import org.example.sort.SortAlgorithm;

public class NaiveQuickSortTest extends AbstractSortTest {
    @Override
    protected SortAlgorithm getSort() {
        return new NaiveQuickSort();
    }
}
