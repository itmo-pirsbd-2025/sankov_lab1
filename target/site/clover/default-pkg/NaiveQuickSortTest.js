var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":9,"id":344,"methods":[{"el":8,"sc":5,"sl":5}],"name":"NaiveQuickSortTest","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":5}],"name":"testAlreadySorted","pass":true,"statements":[{"sl":7}]},"test_10":{"methods":[{"sl":5}],"name":"testWithDuplicates","pass":true,"statements":[{"sl":7}]},"test_15":{"methods":[{"sl":5}],"name":"testSingleElement","pass":true,"statements":[{"sl":7}]},"test_19":{"methods":[{"sl":5}],"name":"testReverseSorted","pass":true,"statements":[{"sl":7}]},"test_2":{"methods":[{"sl":5}],"name":"testAlmostSorted","pass":true,"statements":[{"sl":7}]},"test_3":{"methods":[{"sl":5}],"name":"testEmptyArray","pass":true,"statements":[{"sl":7}]},"test_6":{"methods":[{"sl":5}],"name":"testRandomArray","pass":true,"statements":[{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [2, 19, 6, 15, 1, 10, 3], [], [2, 19, 6, 15, 1, 10, 3], [], []]
