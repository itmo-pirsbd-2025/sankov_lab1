import org.example.sort.NaiveQuickSort;
import org.example.sort.SortAlgorithm;

public class NaiveQuickSortTest extends AbstractSortTest {
    @Override
    protected SortAlgorithm algorithm() {
        return new NaiveQuickSort();
    }
}
