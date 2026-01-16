var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":9,"id":342,"methods":[{"el":8,"sc":5,"sl":5}],"name":"ImprovedQuickSortTest","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":5}],"name":"testReverseSorted","pass":true,"statements":[{"sl":7}]},"test_11":{"methods":[{"sl":5}],"name":"testWithDuplicates","pass":true,"statements":[{"sl":7}]},"test_12":{"methods":[{"sl":5}],"name":"testEmptyArray","pass":true,"statements":[{"sl":7}]},"test_20":{"methods":[{"sl":5}],"name":"testSingleElement","pass":true,"statements":[{"sl":7}]},"test_4":{"methods":[{"sl":5}],"name":"testAlmostSorted","pass":true,"statements":[{"sl":7}]},"test_7":{"methods":[{"sl":5}],"name":"testAlreadySorted","pass":true,"statements":[{"sl":7}]},"test_9":{"methods":[{"sl":5}],"name":"testRandomArray","pass":true,"statements":[{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [7, 20, 4, 9, 12, 11, 0], [], [7, 20, 4, 9, 12, 11, 0], [], []]
