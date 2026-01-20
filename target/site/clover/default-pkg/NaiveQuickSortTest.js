var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":10,"id":269,"methods":[{"el":9,"sc":5,"sl":6}],"name":"NaiveQuickSortTest","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":6}],"name":"almostSorted","pass":true,"statements":[{"sl":8}]},"test_15":{"methods":[{"sl":6}],"name":"random","pass":true,"statements":[{"sl":8}]},"test_16":{"methods":[{"sl":6}],"name":"oneElement","pass":true,"statements":[{"sl":8}]},"test_19":{"methods":[{"sl":6}],"name":"duplicates","pass":true,"statements":[{"sl":8}]},"test_3":{"methods":[{"sl":6}],"name":"reverse","pass":true,"statements":[{"sl":8}]},"test_8":{"methods":[{"sl":6}],"name":"empty","pass":true,"statements":[{"sl":8}]},"test_9":{"methods":[{"sl":6}],"name":"sorted","pass":true,"statements":[{"sl":8}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [3, 19, 15, 1, 9, 16, 8], [], [3, 19, 15, 1, 9, 16, 8], [], []]
